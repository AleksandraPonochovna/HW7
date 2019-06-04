package com.company;

public class Storage<T, V> {

    private T key;
    private V value;

    public void put(T key, V value) {
        this.key = key;
        this.value = value;
    }

    public V get(T key) {
        if (this.key == key){
            return value;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Storage: " +
                "key = " + key +
                ", value = " + value;
    }
}
