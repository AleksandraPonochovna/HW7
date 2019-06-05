package com.company;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) &&
                Objects.equals(second, pair.second);
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
