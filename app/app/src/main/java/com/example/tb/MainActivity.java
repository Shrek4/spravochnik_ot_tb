package com.example.tb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recuclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Group> groups = new ArrayList<>();

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Персональный компьютер",this));
        items.add(new Item("Токарный станок",this));
        items.add(new Item("Хим. Оборудование",this));

        Group tb = new Group("Техника безопасности ",items);
        Group check = new Group("Чек-лист ",items);
        Group test = new Group("Тест ",items);

        groups.add(tb);
        groups.add(check);
        groups.add(test);

        ItemAdapter adapter = new ItemAdapter(groups);
        recyclerView.setAdapter(adapter);
    }
}
