package lab5;

import java.util.*;

public class Album implements Comparable<Album> {
    private String nume;
    private Integer an_publicare;
    private double rating;

    Album(){
        this.nume = " ";
        this.an_publicare = 0;
        this.rating = 0;
    }

    public String getNume(){
        return this.nume;
    }

    public int getAn_publicare(){
        return this.an_publicare;
    }

    public double getRating(){
        return this.rating;
    }

    public void setAn_publicare(int an_publicare) {
        this.an_publicare = an_publicare;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void afisare(){
        System.out.println("albumul " + this.nume + " a fost publicat in " + this.an_publicare.toString() + " si are ratingul " + this.rating);
    }

    @Override
    public int compareTo(Album o) {
        if(this.rating == o.rating){
            if(this.nume.compareTo(o.nume) > 0){
                return 1;
            }
            else return -1;
        }

        if(this.rating > o.rating)
            return 1;
        else return -1;
    }
}
