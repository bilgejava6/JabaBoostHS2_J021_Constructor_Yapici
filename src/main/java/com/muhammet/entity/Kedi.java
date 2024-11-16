package com.muhammet.entity;

public class Kedi {
    public String tur;
    public int boy;
    public int agirlik;
    public String tuyRengi;
    public int kuyrukUzunlugu;
    // default constructor
    public Kedi(){
        // sınıftan nesne yaratır ve nesnenin adresini döner.
        System.out.println("Default Constructor çalıştı");
        tur = "Genel kedi";
        boy = 10;
        agirlik = 210;
        tuyRengi = "Gri";
        kuyrukUzunlugu = 3;
    }

}
