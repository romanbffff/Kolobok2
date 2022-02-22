package com.vntu.akit;

class Train {
    private int TrainNumber;
    private String start;
    private String finish;

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

    void print(){
        System.out.println("Номер потягу: " + this.TrainNumber);
        System.out.println("Стартова точка: " + this.start);
        System.out.println("Кінцева точка: " + this.finish);
    }
}
