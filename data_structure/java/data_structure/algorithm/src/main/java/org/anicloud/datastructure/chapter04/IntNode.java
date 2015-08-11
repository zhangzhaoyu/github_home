package org.anicloud.datastructure.chapter04;

/**
 * Created by zhaoyu on 15-7-15.
 */
public class IntNode {

    private int data;
    private IntNode link;

    public IntNode(int initialData, IntNode initialLink) {
        data = initialData;
        link = initialLink;
    }

    public int getData() {
        return data;
    }

    public IntNode getLink() {
        return link;
    }

    public void setData(int newData) {
        this.data = newData;
    }

    public void setLink(IntNode newLink) {
        this.link = newLink;
    }

    public void addNodeAfter(int element) {
        link = new IntNode(element, link);
    }

    public void removeNodeAfter() {
        link = link.link;
    }



    public static void main(String[] args) {
        IntNode head;
        head = new IntNode(10, null);
        // add before
        head = new IntNode(20, head);
    }
}
