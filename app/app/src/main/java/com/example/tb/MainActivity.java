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

        ArrayList<Item> itemsTb = new ArrayList<>();
        itemsTb.add(new Item("Персональный компьютер",this,0,"tb"));
        itemsTb.add(new Item("Токарный станок",this,1,"tb"));
        itemsTb.add(new Item("Хим. Оборудование",this,2,"tb"));

        ArrayList<Item> itemsCheck = new ArrayList<>();
        itemsCheck.add(new Item("Персональный компьютер",this,0,"check"));
        itemsCheck.add(new Item("Токарный станок",this,1,"check"));
        itemsCheck.add(new Item("Хим. Оборудование",this,2,"check"));

        ArrayList<Item> itemsTest = new ArrayList<>();
        itemsTest.add(new Item("Персональный компьютер",this,0,"test"));
        itemsTest.add(new Item("Токарный станок",this,1,"test"));
        itemsTest.add(new Item("Хим. Оборудование",this,2,"test"));

        Group tb = new Group("Техника безопасности ",itemsTb);
        Group check = new Group("Чек-лист ",itemsCheck);
        Group test = new Group("Тест ",itemsTest);

        groups.add(tb);
        groups.add(check);
        groups.add(test);

        ItemAdapter adapter = new ItemAdapter(groups);
        recyclerView.setAdapter(adapter);
    }
}
