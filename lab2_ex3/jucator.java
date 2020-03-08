package com.company;

class jucator{
    private String nume;
    private int valoare;

    jucator(){
        this.nume = " ";
        this.valoare = 0;
    }

    public int getValoare(){
        return this.valoare;
    }

    public String getNume(){
        return this.nume;
    }

    public void setValoare(int val){
        this.valoare = val;
    }

    public void setNume(String name){
        this.nume = name;
    }

    public void printDate(){
        System.out.print(this.nume + " " + this.valoare);
    }
}