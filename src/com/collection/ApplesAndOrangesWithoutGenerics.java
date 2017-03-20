package com.collection;

import java.util.ArrayList;

/**
 * Created by Xie on 2017.3.17.
 */

class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}


class Orange {
}


public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 6; i++) {
            apples.add(new Apple());
        }
//        apples.add(new Orange());

        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).id());
        }

        for (Apple ap : apples)
            System.out.println(ap);
    }
}
