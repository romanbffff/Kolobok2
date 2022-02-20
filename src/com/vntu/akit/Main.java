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
        Traine poizd = new Traine();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер потягу: ");
        int number = scanner.nextInt();
        poizd.setNumber(number);

        System.out.println("Введіть стартову точку: ");
        String start = scanner.next();
        poizd.setStart(start);

        System.out.println("Введіть кінцеву точку: ");
        String finish = scanner.next();
        poizd.setFinish(finish);

        System.out.println("Номер поїзду: " + poizd.getNumber());
        System.out.println("Стартова точка: " + poizd.getStart());
        System.out.println("Кінцева точка: " + poizd.getFinish());
    }
}
