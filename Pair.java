package com.company;

public class Pair<T, V> {

    private T first;
    private V second;

    private Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <T, V> Pair<T, V> of(T first, V second) {
        return new Pair<>(first, second);
    }

    public V getSecond() {
        return second;
    }

    public T getFirst() {
        return first;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Pair) {
            Pair<T, V> pair = (Pair<T, V>) obj;
            return (getFirst() == pair.first && getSecond() == pair.second);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hashCode = 0;
        int someSimpleNumber = 31;
        hashCode += first == null ? null : first.hashCode() * someSimpleNumber;
        hashCode += second == null ? null : second.hashCode() * someSimpleNumber;
        return hashCode;
    }
}
