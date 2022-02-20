package com.vntu.akit;

public class Traine {
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
