package com.company;

import java.util.ArrayList;

public class Storage<T, V> {

    private ArrayList<T> keys = new ArrayList<>();
    private ArrayList<V> values = new ArrayList<>();

    public void put(T key, V value) {
        keys.add(key);
        values.add(value);
    }

    public V get(T key) {
        for (T someKey : keys) {
            if (someKey == key) {
                int index = keys.indexOf(someKey);
                return values.get(index);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Storage: " +
                "keys = " + keys +
                ", values = " + values;
    }
}
