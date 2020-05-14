package com.example.tb;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class ItemViewHolder extends ChildViewHolder {
    private TextView mTextView;
    private View thisView;
    public MainActivity context;

    public ItemViewHolder(View itemView) {
        super(itemView);
        mTextView = itemView.findViewById(R.id.itemTextView);
        thisView = itemView;
        thisView.setOnClickListener(clikcer);

    }

    public void bind(Item item){
        mTextView.setText(item.name);
        this.context = item.context;
    }

    private View.OnClickListener clikcer = new View.OnClickListener() {
        public void onClick(View v) {
            Intent myIntent = new Intent(context, tb.class);
            context.startActivity(myIntent);
        }
    };
}
