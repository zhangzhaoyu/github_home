package org.anicloud.colletion;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by zhaoyu on 15-4-1.
 */

class User implements Comparable<User> {

    private String id;
    private int age;

    User(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}

public class SampleCompatator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return -(o1.length() - o2.length());
    }

    public static void main(String[] args) {
        SampleCompatator sampleCompatator = new SampleCompatator();

        String[] strs = {"zhao", "yu", "zhang"};
        System.out.println(Arrays.toString(strs));
        Arrays.sort(strs, sampleCompatator);
        System.out.println(Arrays.toString(strs));

        User[] users = new User[]{new User("zhang", 23), new User("zhao", 21), new User("yu", 13)};
        System.out.println(Arrays.toString(users));
        Arrays.sort(users);
        System.out.println(Arrays.toString(users));
    }
}
