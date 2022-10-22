package ders09_actionsClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;
public class C06_FacebookKayit extends TestBase {
    @Test
    public void test01(){
        //1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");
        //2- cookies'i kabul edin ve yeni hesap olustur butonuna basalim
        driver.findElement(By.xpath("//*[@title='Only allow essential cookies']")).click();
        driver.findElement(By.linkText("Create New Account")).click();
        //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
        WebElement isimKutusu= driver.findElement(By.xpath("//input[@name='firstname']"));
        Actions actions=new Actions(driver);
        actions.click(isimKutusu)
                .sendKeys("Levent")
                .sendKeys(Keys.TAB)
                .sendKeys("Celik")
                .sendKeys(Keys.TAB)
                .sendKeys("fatih@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("fatih@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("12345Arti")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("13")
                .sendKeys(Keys.TAB)
                .sendKeys("Oct")
                .sendKeys(Keys.TAB)
                .sendKeys("2000")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.ARROW_LEFT)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
        //4- Kaydol tusuna basalim
        bekle(25);
    }
}
