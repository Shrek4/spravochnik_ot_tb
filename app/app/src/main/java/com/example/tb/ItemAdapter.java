package com.example.tb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class ItemAdapter extends ExpandableRecyclerViewAdapter<MyGroupViewHolder,ItemViewHolder> {
    public ItemAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }

    @Override
    public MyGroupViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recucler_view_group, parent, false);
        return new MyGroupViewHolder(v);
    }

    @Override
    public ItemViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recucler_view_item, parent, false);
        return new ItemViewHolder(v);
    }

    @Override
    public void onBindChildViewHolder(ItemViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        final Item item = (Item) group.getItems().get(childIndex);
        holder.bind(item);
    }

    @Override
    public void onBindGroupViewHolder(MyGroupViewHolder holder, int flatPosition, ExpandableGroup group) {
        final  Group group1 = (Group) group;
        holder.bind(group1);
    }
}
