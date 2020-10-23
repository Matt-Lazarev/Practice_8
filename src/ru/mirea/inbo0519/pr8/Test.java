package ru.mirea.inbo0519.pr8;

import java.util.*;

public class Test {
    public static void in(Collection<Integer> c)
    {
        Random r = new Random();
        r.setSeed(new Date().getTime());
        for(int i=0; i<7; i++){
            c.add(r.nextInt() % 100);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        in(list);
        WaitList<Integer> waitList = new WaitList<>(list);
        System.out.println("Wait list: " + waitList);

        for(int i=0; i<3; i++)
            waitList.remove();
        System.out.println("Wait list: " + waitList);

        for(int i=0 ;i<4; i++)
            waitList.add(i+7);
        System.out.println("Wait list: " + waitList);

        BoundedWaitList<Integer> boundedList = new BoundedWaitList<>(5);
        for(int i=0; i<10; i++)
            boundedList.add(i);
        System.out.println(boundedList);

        UnfairWaitList<Integer> unfairList = new UnfairWaitList<>();
        for(int i=0; i<10; i++)
            unfairList.add(i);
        for(int i=0; i<10; i+=2){
            unfairList.moveToBack(i);
            unfairList.remove(i);
        }
        System.out.println(unfairList);
    }
}
