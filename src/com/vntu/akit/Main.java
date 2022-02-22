package com.vntu.akit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Train train = new Train();  // створення екземпляру об'єкта Train, а змінна train типу Train указує на місце в пам'яті де був створенний об'єкт
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер потягу: ");
        int number = scanner.nextInt();
        train.setNumber(number);

        System.out.println("Введіть стартову точку: ");
        String start = scanner.next();
        train.setStart(start);

        System.out.println("Введіть кінцеву точку: ");
        String finish = scanner.next();
        train.setFinish(finish);

        train.print();
    }
}
