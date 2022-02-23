package com.vntu.akit;
import java.util.Scanner;

class Train {
    private int TrainNumber;
    private String start;
    private String finish;
    // private double cost1KmOfRoad; // Заготовка під ЛБ2

    //геттери
     /* public int getNumber(){
        return this.TrainNumber;
    }
    public String getStart(){return this.start;}
    public String getFinish(){return this.finish;}
      */
    //сеттери
    public void setNumber(int TrainNumber){
        this.TrainNumber = TrainNumber;
    }
    public void setStart(String start){
        this.start = start;
    }
    public void setFinish(String finish) {
        this.finish = finish;
    }

     public Train() {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Введіть номер потягу: ");
           int number = scanner.nextInt();
           setNumber(number);

           System.out.println("Введіть стартову точку: ");
           String start = scanner.next();
           setStart(start);

           System.out.println("Введіть кінцеву точку: ");
           String finish = scanner.next();
           setFinish(finish);
       }
          // public Train(int TrainNumber, String start, String finish) {
          // this.TrainNumber = TrainNumber;
          // this.start = start;
          // this.finish = finish; }

    void print(){
        System.out.println("Номер потягу: " + this.TrainNumber);
        System.out.println("Стартова точка: " + this.start);
        System.out.println("Кінцева точка: " + this.finish);
    }
}
