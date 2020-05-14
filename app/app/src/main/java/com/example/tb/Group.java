package com.example.tb;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class Group extends ExpandableGroup<Item> {
    public String name;

    public Group(String title, List<Item> items) {
        super(title, items);
        this.name = title;
    }
}
