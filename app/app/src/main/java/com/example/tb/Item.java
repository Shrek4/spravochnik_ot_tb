package com.example.tb;

import android.os.Parcel;
import android.os.Parcelable;

public class Item implements Parcelable {
    public final String name;
    public MainActivity context;

    public Item(String name, MainActivity context) {
        this.name = name;
        this.context = context;
    }

    protected Item(Parcel in) {
        name = in.readString();
    }

    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
    }
}
