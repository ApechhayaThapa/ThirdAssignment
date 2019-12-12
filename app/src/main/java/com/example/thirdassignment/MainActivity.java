package com.example.thirdassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);


        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Sujan Shrestha", "20", "Lalitpur", "male", R.drawable.male, R.drawable.delete));
        contactsList.add(new Contacts("Subiya Shakya", "20", "Bhaktapur", "male", R.drawable.male, R.drawable.delete));
        contactsList.add(new Contacts("Sareena Thapa", "19", "Kathmandu", "female", R.drawable.female, R.drawable.delete));

        ContactsAdapter contactsAdapter = new ContactsAdapter(this, contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}