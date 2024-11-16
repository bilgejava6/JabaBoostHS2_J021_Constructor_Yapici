package com.muhammet;

import com.muhammet.entity.Kedi;

public class Runner {
    public static void main(String[] args) {
        /**
         * Constructor - Kurucu, Yapıcı Method
         * Tanım:
         *  bir sınıc içerisinde yazılmış olmasalar dahi var olan
         *  methodlardır. Genel amaçları bir sınıftan nesne yaratıp
         *  o sınıfın referansını dönmektedir. Ayrıca bu sınıflarda
         *  başlangıç işlemleri için değer atama yapılabilir.
         *  Özellikleri;
         *  - constructor lar sınıfın adı ile aynı ada sahiptirler.
         *  - return type ları yoktur. (void, v.s. yoktur)
         *  - dışarıdan değer alabilirler, ancak dışarıdan
         *  değer aldıklarında default constructor ayrıca yazılmalıdır
         *  yazılmaz ise default constructor iptal olur.
         *  - özel bir builder method yok ise erişim belirteci
         *  public olmak zorundadır.
         *
         */
        Kedi kedi = new Kedi();

        System.out.println("kedinin türü.......: "+ kedi.tur);
        System.out.println("kedinin boyu.......: "+ kedi.boy);
        System.out.println("kedinin agırlığı...: "+ kedi.agirlik);
        System.out.println("kedinin tüy Rengi..: "+ kedi.tuyRengi);
        System.out.println("kedinin kuyruk uz..: "+ kedi.kuyrukUzunlugu);
    }


}