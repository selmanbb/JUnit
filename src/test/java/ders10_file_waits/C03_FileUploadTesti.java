package ders10_file_waits;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03_FileUploadTesti extends TestBase {

    @Test
    public void uploadTesti(){

        //1.Tests packagenin altina bir class oluşturun : C05_UploadFile
        //2.https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");
        //3.chooseFile butonuna basalim

        //4.Yuklemek istediginiz dosyayi secelim.

        WebElement dosyaButonu= driver.findElement(By.id("file-upload"));

        /*
          dosya sec butonuna bastiktan sonra
          bilgisayardan selenium ile dosya secmemiz mumkun degil
          onun yerine
          dosyaSecButonu.sendKeys("DosyaYolu") yaparsak
          dosya secme islemi yapilmis olacaktir
         */


        String yuklenecekDosyaYolu=System.getProperty("user.home")+"/Desktop/FileTest/deneme.txt";
        dosyaButonu.sendKeys(yuklenecekDosyaYolu);
        bekle(5);
        //5.Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();
        //6.“File Uploaded!” textinin goruntulendigini test edelim.

        WebElement fileUploadYaziElementi=driver.findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadYaziElementi.isDisplayed());
    }
}
