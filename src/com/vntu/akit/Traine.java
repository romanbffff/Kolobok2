package com.vntu.akit;

class Train {
    private int TrainNumber;
    private String start;
    private String finish;
    //гетери
    public int getNumber(){
        return this.TrainNumber;
    }
    public String getStart(){return this.start;}
    public String getFinish(){return this.finish;}

    //сетери
    public void setNumber(int TrainNumber){
        this.TrainNumber = TrainNumber;
    }
    public void setStart(String start){
        this.start = start;
    }
    public void setFinish(String finish) {
        this.finish = finish;
    }
}
