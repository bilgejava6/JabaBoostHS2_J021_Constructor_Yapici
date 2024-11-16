package com.muhammet.entity;

public class Urun {
    public Long id;
    public String ad;
    public String marka;
    public String model;

    /**
     * constructor private olursa o sınıftan
     * nesne yaratılamaz. Farklı yapılar ile
     * özelleştirmek gerekecektir.
     */
    private Urun(){
        System.out.println("Urun constructor çalıştı");
    }
}
