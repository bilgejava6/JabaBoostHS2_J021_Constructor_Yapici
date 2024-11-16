package com.muhammet.entity;

import java.util.Random;

public class Urun_NoDefaultConstructor {
    public Long id;
    public String ad;
    public String barkod;
    public double fiyat;
    public Long olusturmaZamani;

    /**
     * Eğer default constructor yazılmadan parametreli constructor yazar iseniz
     * default constructor ipal olur.
     */
    public Urun_NoDefaultConstructor(String uAd, String uBarkod, double uFiyat){
        id = new Random().nextLong(0,9999);  // rast gele sayı üretir.
        ad = uAd;
        barkod = uBarkod;
        fiyat = uFiyat;
        olusturmaZamani = System.currentTimeMillis(); // zamanın şuanki değeri (ms cinsinden)
    }
}
