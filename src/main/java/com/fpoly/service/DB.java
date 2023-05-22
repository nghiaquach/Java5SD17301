package com.fpoly.service;

import java.util.HashMap;
import java.util.Map;

import com.fpoly.model.Item;

public class DB {
    public static Map<Integer, Item> items = new HashMap<>();
    static {
        items.put(1, new Item(1, "Samsung", 10.0, 1));
        items.put(2, new Item(2, "Nokia 2021", 20.50, 2));
        items.put(3, new Item(3, "iPhone 20", 90.49, 1));
        items.put(4, new Item(4, "Motorola", 15.55, 2));
        items.put(5, new Item(5, "Seamen", 8.99, 1));
    }
}