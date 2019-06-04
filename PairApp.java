package com.company;

public class PairApp {

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(null, "hello");
        Integer integer = pair.getFirst();
        System.out.println(integer); //null
        String string = pair.getSecond();
        System.out.println(string); //hello

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2);
        System.out.println(mustBeTrue); //true
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode();
        System.out.println(mustAlsoBeTrue); //true

    }
}
