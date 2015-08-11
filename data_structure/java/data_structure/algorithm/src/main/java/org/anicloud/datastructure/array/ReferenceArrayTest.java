package org.anicloud.datastructure.array;

import java.util.Arrays;

/**
 * Created by zhaoyu on 15-7-19.
 */
class Person {
    public int age;
    public double height;

    static int eyeNum;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", height=" + height +
                '}';
    }
}

public class ReferenceArrayTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person[] persons;
        persons = new Person[2];
        System.out.println(persons.length);

        int[] arrInt = new int[] {1,2,3,4};
        int a = arrInt[1];
        System.out.println(a);
        a = 10;
        System.out.println(a);
        System.out.println(Arrays.toString(arrInt));

        System.out.println(Person.class);
        System.out.println(Class.forName("org.anicloud.datastructure.array.Person"));
    }
}

class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        System.out.println("constructor");
        this.name = name;
        this.age = age;
    }

    double weight = 2.3;

    {
        System.out.println("no static block");
        weight = 2.0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Cat cat = new Cat("kitty", 2);
        System.out.println(cat);
        Cat cat1 = new Cat("Jerfield", 3);
        System.out.println(cat1);
    }
}
