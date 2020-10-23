package ru.mirea.inbo0519.pr8;

import java.util.Collection;

public class WaitList <T extends Comparable<T>> implements IWaitList<T> {
    protected Node<T> first;
    protected Node<T> last;
    protected int size;

    public int size() {
        return size;
    }

    public WaitList()
    {
        size = 0;
    }

    public WaitList(Collection<T> c)
    {
        this();
        for (T t : c) add(t);
    }

    @Override
    public void add(T data)
    {
        Node<T> newNode = new Node<>(data);
        if(size ==0){
            first = last = newNode;
            size++;
        }
        else{
            last.next = newNode;
            last = newNode;
            size++;
        }
    }

    @Override
    public T remove()
    {
        Node<T> temp = first;
        first = first.next;
        size--;
        return temp.data;
    }

    public T peek(){
        return first.data;
    }

    @Override
    public boolean contains(T element) {
        Node<T> current = first;
        while(current.data.compareTo(element) != 0){
            if(current.next == null)
                return false;
            else
                current = current.next;
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection<T> c) {
        Node<T> current = first;
        for(int i=0; i<size; i++){
            if(c.contains(first.data))
                first = first.next;
            else
                return false;
        }
        return true;
    }

    @Override
    public boolean isEmpty()
    {
        return size==0;
    }

    @Override
    public String toString() {
        Node<T> current = first;
        StringBuilder result = new StringBuilder();
        while(current != null){
            result.append(current.data).append(", ");
            current = current.next;
        }
        result.deleteCharAt(result.length()-2);
        return "[ " + result + "]";
    }
}
