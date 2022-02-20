package com.vntu.akit;
import java.util.Scanner;

class Traine {
    private int NumberOfTraine;
    private String start;
    private String finish;
    //гетери
    public int getNumber(){
        return this.NumberOfTraine;
    }
    public String getStart(){return this.start;}
    public String getFinish(){return this.finish;}

    //сетери
    public void setNumber(int NumberOfTraine){
        this.NumberOfTraine = NumberOfTraine;
    }
    public void setStart(String start){
        this.start = start;
    }
    public void setFinish(String finish) {
        this.finish = finish;
    }
}

public class Main {

    public static void main(String[] args) {
        Traine traine = new Traine();
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
