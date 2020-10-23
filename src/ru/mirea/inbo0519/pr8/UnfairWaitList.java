package ru.mirea.inbo0519.pr8;

public class UnfairWaitList <T extends Comparable<T>> extends WaitList<T>{

    public UnfairWaitList()
    {
        super();
    }

    public void remove(T element) {
        if(size <= 0)
            return;
        Node<T> parent = first;
        Node<T> current = first;
        while(current.data.compareTo(element) != 0){
            if(current.next != null){
                parent = current;
                current = current.next;
            }
            else
                return;
        }
        if(current == parent)
            super.remove();
        else
            parent.next = current.next;
        size--;
    }

    public void moveToBack(T data) {
        super.add(data);
    }

    @Override
    public String toString() {
        return "UnfairWaitList: " + super.toString();
    }
}
