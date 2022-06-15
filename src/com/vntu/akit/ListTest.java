package com.vntu.akit;

import java.io.File;
import java.io.*;
import java.util.Scanner;

class ListElement {
    ListElement next;    // вказує на наступний елемент
    int data;            // елемент
}

class List {
    private ListElement head;       // вказує на перший елемент
    private ListElement tail;       // а це на останній

    void addFront(int data)           //додати спереді
    {
        ListElement a = new ListElement();  // створюю новий елемент
        a.data = data;              //ініціаліцую його
        if(head == null)            //список пустий?
        {                           //то вказую силки початку і кінця на новий елемент
            head = a;               //бо список тепер тільки з одного елемента
            tail = a;
        }
        else {
            a.next = head;          //або новий елемент тепер посилається на "минулий" первый
            head = a;               //а вказівник на перший елемент тепер посилається вже на новий елемент
        }
    }

    void addBack(int data) {          //додавання в кінець списку
        ListElement a = new ListElement();
        a.data = data;
        if (tail == null)
        {
            head = a;
            tail = a;
        } else {
            tail.next = a;          //або "минулий" останній елемент тепер посилається на новий
            tail = a;
        }
    }

    void printList()                //вивод списку
    {
        ListElement t = this.head;       //ссилка на перший елемент
        while (t != null)           //пока він існує
        {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

   /* public int nthToLast(ListElement head, int k) {
        if (head == null) {
            return 0;
        }
        int i = nthToLast(head.next, k) + 1;
        if (i == k) {
            System.out.println(head.data);
        }
        return i;
    }*/

    void delEl(int data)          //Видалення елементу
    {
        if(head == null)        //якщо список пустий -
            return;             //нічого не робимо

        if (head == tail) {     //якщо з одного елементу
            head = null;        //присваюємо вказівникам початку і кінця - значення нулл
            tail = null;
            return;             //і ліваємо
        }

        if (head.data == data) {    //якщо перший елемент той який нам потрібен
            head = head.next;       //переключаємо вказівник на наступний
            return;                 //і виходимо
        }

        ListElement t = head;       //інакше шукаємо
        while (t.next != null) {    //поки наступний елемент є
            if (t.next.data == data) {  //переверяємо його
                if(tail == t.next)      //якщо останній?
                {
                    tail = t;           //то переключаєм вказівник на останній елемент на той що зараз
                }
                t.next = t.next.next;   //цей елемент викидаємо
                return;                 //і виходимо
            }
            t = t.next;                //або йдемо далі
        }
    }
}

public class ListTest {
    public static void main(String[] args) throws FileNotFoundException {
        List l = new List();
        try {
            Scanner scanner = new Scanner(new File("Cost.txt"));
            int [] arr= new int [5];
            int i = 0;
            while(scanner.hasNextInt()){
                arr[i++] = scanner.nextInt();
            }
            for (int y =0; y < i; y++) {
                l.addBack(arr[y]);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        l.printList();
        System.out.println("Додати елемент до списку - ");
        Scanner sc = new Scanner(System.in);
        int plus = sc.nextInt();
        l.addBack(plus);
        l.printList();
        System.out.println("Видалити елемент зі списку - ");
        int del = sc.nextInt();
        l.delEl(del);
        l.printList();
    }
}
