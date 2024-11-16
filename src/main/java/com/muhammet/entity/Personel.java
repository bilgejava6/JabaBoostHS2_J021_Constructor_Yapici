package com.muhammet.entity;

public class Personel {
    public Long id;
    public String ad;
    public String adres;
    public String tel;
    //default constructor
    public Personel(){
        System.out.println("Default Constructor çalıştı");
    }
    // parametreli constructor oldu.
    public Personel(Long pId, String pAd, String pAdres, String pTel){
        id = pId;
        ad = pAd;
        adres = pAdres;
        tel = pTel;
    }

    public int toplam(int sayi1, int sayi2){
        return sayi1+sayi2;
    }

}
