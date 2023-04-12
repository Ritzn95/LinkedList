package com.Ritesh;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(6);
//        list.insertFirst(8);
//        list.insertLast(97);
//        list.insert(54, 4);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
//        System.out.println(list.find(6));
//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(6);
//        list.insertFirst(8);
//        list.insert(3, 44);
//        list.insert(6, 55);
//        list.display();

        CLL list = new CLL();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);
        list.display();
        list.delete(19);
        list.display();
    }
}
