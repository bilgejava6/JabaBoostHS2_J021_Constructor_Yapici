package com.muhammet;

import com.muhammet.entity.Personel;

public class RunnerPersonel {
    public static void main(String[] args) {
        Personel personel = new Personel();
        personel.ad = "muhammet hoca";
        personel.id = 12L;
        personel.tel = "0 555 999 8745";
        personel.adres = "Ankara";

        Personel personel2 = new Personel(1L,"ali","İzmir","0555 666 9999");

        System.out.println("id.......: "+ personel2.id);
        System.out.println("ad.......: "+ personel2.ad);
        System.out.println("adres....: "+ personel2.adres);
        System.out.println("tel......: "+ personel2.tel);

    }
}
