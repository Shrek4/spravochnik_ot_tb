package com.example.tb;

import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import static android.view.animation.Animation.RELATIVE_TO_SELF;

public class MyGroupViewHolder extends GroupViewHolder {
    private TextView mTextView;
    private ImageView arrow;
    private View thisView;

    public MyGroupViewHolder(View itemView) {
        super(itemView);
        mTextView = itemView.findViewById(R.id.groupTextView);
        arrow = itemView.findViewById(R.id.arrow);
        thisView = itemView;
    }

    public void bind(Group group){
        mTextView.setText(group.name);
    }

    @Override
    public void expand() {
        animateExpand();
    }

    @Override
    public void collapse() {
        animateCollapse();
    }

    private void animateExpand() {
        RotateAnimation rotate =
                new RotateAnimation(360, 180, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        arrow.setAnimation(rotate);
        thisView.setBackgroundResource(R.drawable.shape_active);
    }

    private void animateCollapse() {
        RotateAnimation rotate =
                new RotateAnimation(180, 360, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        arrow.setAnimation(rotate);
        thisView.setBackgroundResource(R.drawable.shape);
    }
}
