package ders06_junit;

import org.junit.Assert;
import org.junit.Test;

public class C07_Assertions {
    int sayi1= 10;
    int sayi2= 20;
    int sayi3= 30;
    @Test
    public void test01(){


        //sayi 1'in sayi2'den kucuk oldugunu test edin.
        Assert.assertTrue(sayi1<sayi2);

        //sayi1'in sayi 2'den buyuk olmadigini test edin.
        Assert.assertFalse(sayi1>sayi2);

        // sayi1'in sayi2'ye esit oldugunu test edin
        Assert.assertEquals(sayi1,sayi2);

    }
    @Test
    public void test02(){
        Assert.assertEquals(sayi3,sayi1+sayi2);
    }

    @Test
    public void test03(){
        Assert.assertNotEquals(sayi3,sayi2);
    }
    @Test
    public void test04(){
        Assert.assertTrue(sayi3==sayi2);
    }
    @Test
    public void test05(){
        Assert.assertFalse(sayi3==sayi2);
    }
    @Test
    public void test06(){
        Assert.assertNotEquals(sayi3,sayi1+sayi2);
    }
    @Test
    public void test07(){
        Assert.assertTrue(sayi3<sayi2);
    }
    @Test
    public void test08(){
        Assert.assertFalse(sayi3>sayi2);
    }
}
