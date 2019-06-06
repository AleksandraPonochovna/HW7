package com.company;

public class StorageApp {

    public static void main(String[] args) {
        Storage<Integer, String> storageFirst = new Storage<>();
        Storage<Integer, String> storageTwo = new Storage<>();
        Storage<Integer, String> storageThird = new Storage<>();

        storageFirst.put(1, "hello");
        System.out.println(storageFirst);
        System.out.println(storageFirst.get(1));

        storageTwo.put(2, "world");
        System.out.println(storageTwo);
        System.out.println(storageTwo.get(2));

        storageThird.put(3, "!!!!!!");
        System.out.println(storageThird);
        System.out.println(storageThird.get(4));

    }
}
