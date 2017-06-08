package com.string;

/**
 * Created by Xie on 2017.3.23.
 */
public class StringNullDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(15);
        sb.append("hello");
        System.out.println("length: " + sb.length());
        System.out.println(sb.toString());
    }
}
