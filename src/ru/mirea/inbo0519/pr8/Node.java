package ru.mirea.inbo0519.pr8;

//element of WaitList
public class Node<T> {
    T data;
    Node<T> next;

    public Node(T d)
    {
        data = d;
    }
}
