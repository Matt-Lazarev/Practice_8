package ru.mirea.inbo0519.pr8;

public class BoundedWaitList <T extends Comparable<T>> extends WaitList<T> {
    private final int CAPACITY;

    public BoundedWaitList(int capacity)
    {
        super();
        CAPACITY = capacity;
    }

    @Override
    public void add(T data) {
        if(size < CAPACITY)
            super.add(data);
    }

    public int getCAPACITY() {
        return CAPACITY;
    }

    @Override
    public String toString() {
        return "BoundedWaitList: " + super.toString();
    }
}
