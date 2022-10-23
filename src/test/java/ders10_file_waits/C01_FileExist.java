package ders10_file_waits;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C01_FileExist {

    @Test
    public void test01(){
        System.out.println(System.getProperty("use.dir"));

        System.out.println(System.getProperty("user.home"));



        /*
        System.getProperty("user.home") tum bilgisayarlarda kullanici olan pathi verir
        ve bu kisim herkes icin farklidir.

        user.home'dan sonrasi tum kullanicilar icin ortak olabilir
        ornegin tum kullanicilar masaustu

        user.home/Desktop
        dowloads %90 kullanici icin
        user.home/Dowloads

        eger birden fazla bilgisayarda file ile ilgili test yapilacaksa dosya yolu dinamik
        olarak olusturulmalidir
         */


        String dosyaYolu=System.getProperty("user.home")+"/Desktop/FileTest/deneme.txt";

        System.out.println(Files.exists(Paths.get(dosyaYolu))); //true false
    }
}
