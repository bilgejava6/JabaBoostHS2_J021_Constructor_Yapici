package com.muhammet;

import com.muhammet.entity.Urun_NoDefaultConstructor;

public class Runner_UrunNoConstructor {
    public static void main(String[] args) {
        Urun_NoDefaultConstructor urun =
                new Urun_NoDefaultConstructor("Asus Anakart","1545",6_999);

        System.out.println("id......: "+ urun.id);
        System.out.println("ad......: "+ urun.ad);
        System.out.println("barkod..: "+ urun.barkod);
        System.out.println("time....: "+ urun.olusturmaZamani);
        System.out.println("fiyat...: "+ urun.fiyat);


    }
}
