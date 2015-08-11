package org.anicloud.datastructure.array;

/**
 * Created by zhaoyu on 15-7-20.
 */

class Base {
    int count = 2;

    public void display() {
        System.out.println(this.count);
    }
}

class Derived extends Base {
    int count = 20;

    @Override
    public void display() {
        System.out.println(this.count);
    }
}

public class FieldAndMethodTest {
    public static void main(String[] args) {
        Base b = new Base();
        System.out.println(b.count);
        b.display();

        Derived d = new Derived();
        System.out.println(d.count);
        d.display();

        Base bd = new Derived();
        System.out.println(bd.count);
        bd.display();

        Base d2b = d;
        System.out.println(d2b.count);

        System.out.println(d == d2b);
    }
}
