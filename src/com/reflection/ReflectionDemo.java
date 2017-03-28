package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by xie on 2017/3/28.
 */
public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class<?> classType = Class.forName("com.reflection.Student");
        Constructor<?> constructor = classType.getConstructor(new Class<?>[]{String.class, int.class});
        Object student = constructor.newInstance(new Object[]{"Joe", 20});
//        Student student = (Student)classType.newInstance();

        System.out.println(student.toString());
        Method[] methods = classType.getDeclaredMethods();
        for (Method m : methods)
            System.out.println("Public methods of Student" + m);


    }
}

class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("no paras constructor.");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
