package com.company;

import java.util.*;

public class student{
    private String nume;
    private int nota;

    student(){
        this.nume = " ";
        this.nota = 0;
    }

    public void setAtr(String line){
        this.nota = 1;
        this.nume = "ALE";
    }

    public int getNota(){
        return this.nota;
    }

    public String getNume(){
        return this.nume;
    }

    public void setNume(String name){
        this.nume = name;
    }

    public void setNota(int nota){
        this.nota = nota;
    }

}