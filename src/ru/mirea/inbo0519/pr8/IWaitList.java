package ru.mirea.inbo0519.pr8;

import java.util.Collection;

public interface IWaitList<T extends Comparable<T>> {
    void add(T element);
    T remove();
    boolean contains(T element);
    boolean containsAll(Collection<T> c);
    boolean isEmpty();
}
