package com.vika.loftmoney;

import android.os.Parcel;
import android.os.Parcelable;
public class Item implements Parcelable {

    private String name;
    private int price;
    private int id;
    private String type;

    public static final String TYPE_EXPENSE = "expense";
    public static final String TYPE_INCOME = "income";

    Item(int id, String name, int price, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;

    }

    public Item(String name, int price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    public String getType() {
        return type;
    }
    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeInt(price);
        dest.writeString(type);
    }
    protected Item(Parcel in) {
        id = in.readInt();
        name = in.readString();
        price = in.readInt();
        type = in.readString();
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

}
