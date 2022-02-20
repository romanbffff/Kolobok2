package com.vntu.akit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Traine traine = new Traine();  // створення екземпляру об'єкта Traine, а змінна traine типу Traine указує на місце в пам'яті де був створенний об'єкт
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер потягу: ");
        int number = scanner.nextInt();
        traine.setNumber(number);

        System.out.println("Введіть стартову точку: ");
        String start = scanner.next();
        traine.setStart(start);

        System.out.println("Введіть кінцеву точку: ");
        String finish = scanner.next();
        traine.setFinish(finish);

        System.out.println("Номер поїзду: " + traine.getNumber());
        System.out.println("Стартова точка: " + traine.getStart());
        System.out.println("Кінцева точка: " + traine.getFinish());
    }
}
