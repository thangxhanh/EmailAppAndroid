package com.example.emailapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<EmailModel> emails = new ArrayList<>();
        emails.add(new EmailModel(R.drawable.ic_e, "Manh Thang", "ewrer rewr  ewrwe ewrwe",
                "11:43PM", R.drawable.ic_baseline_star_border_24));
        emails.add(new EmailModel(R.drawable.ic_c, "Huyen Anh", "Help make Campaign Monitor",
                "11:22AM", R.drawable.ic_baseline_star_border_24));
        emails.add(new EmailModel(R.drawable.ic_t, "Bss commerce", "Wellcome to BSS Group",
                "05:41AM", R.drawable.ic_baseline_star_border_24));
        emails.add(new EmailModel(R.drawable.ic_m, "Matt from lonic", "The New lonic Creator is Here",
                "9:24PM", R.drawable.ic_baseline_star_border_24));
        emails.add(new EmailModel(R.drawable.ic_s_2, "Soictttt", "Welcome to the office .....",
                "8:18PM", R.drawable.ic_baseline_star_border_24));
        emails.add(new EmailModel(R.drawable.ic_t_2, "BA aaaaa", "Hello Hello Hello Hello Hello.....",
                "7:20PM", R.drawable.ic_baseline_star_border_24));
        emails.add(new EmailModel(R.drawable.ic_e, "Manh Thang", "ewrer rewr  ewrwe ewrwe",
                "11:43PM", R.drawable.ic_baseline_star_border_24));
        emails.add(new EmailModel(R.drawable.ic_c, "Huyen Anh", "Help make Campaign Monitor",
                "11:22AM", R.drawable.ic_baseline_star_border_24));
        EmailAdapter adapter = new EmailAdapter(this, emails);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}