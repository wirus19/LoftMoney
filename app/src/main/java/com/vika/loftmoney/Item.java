package com.vika.loftmoney;

public class Item {
    private String name;
    private int price;
    private int id;
    public static final String TYPE_EXPENSE = "expense";
    public static final String TYPE_INCOME = "income";

    Item(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;

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


}
