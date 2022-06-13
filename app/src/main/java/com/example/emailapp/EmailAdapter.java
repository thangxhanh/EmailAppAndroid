package com.example.emailapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class EmailAdapter extends BaseAdapter {

    Context context;
    List<EmailModel> emails;

    public EmailAdapter(Context context, List<EmailModel> emails){
        this.context = context;
        this.emails = emails;
    }


    @Override
    public int getCount() {
        return emails.size();
    }

    @Override
    public Object getItem(int i) {
        return emails.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        MyViewHolder viewHolder;

        if (view == null)
        {
            view = LayoutInflater.from(context).inflate(R.layout.custom_layout_item, null);
            viewHolder = new MyViewHolder();
            viewHolder.imageThumb = view.findViewById(R.id.image_thumb);
            viewHolder.textTitle = view.findViewById(R.id.text_title);
            viewHolder.textContent = view.findViewById(R.id.text_content);
            viewHolder.imageStar = view.findViewById(R.id.star);
            viewHolder.textTime = view.findViewById(R.id.editTextTime);
            view.setTag(viewHolder);
        } else
            viewHolder = (MyViewHolder) view.getTag();

        EmailModel email = emails.get(i);
        viewHolder.imageThumb.setImageResource(email.getThumb());
        viewHolder.textTitle.setText(email.getTitle());
        viewHolder.textContent.setText(email.getContent());
        viewHolder.textTime.setText(email.getTime());
        viewHolder.imageStar.setImageResource(email.getStar());
        return view;
    }

    class MyViewHolder {
        ImageView imageThumb;
        ImageView imageStar;
        TextView textTitle;
        TextView textContent;
        TextView textTime;
    }
}
