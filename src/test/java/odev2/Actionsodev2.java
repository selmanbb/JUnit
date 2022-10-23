package odev2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Actionsodev2 extends TestBase {
    @Test
    public void test01(){
        //1- Bir Class olusturalim KeyboardActions2
        //2- https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe/");

        //3- video’yu gorecek kadar asagi inin
        WebElement iframeElementi= driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));

       Actions actions=new Actions(driver);
       actions.moveToElement(iframeElementi).perform();
        bekle(2);


        //4- videoyu izlemek icin Play tusuna basin
        driver.switchTo().frame(iframeElementi);
        driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")).click();
        bekle(2);

        //5- videoyu calistirdiginizi test edin
        WebElement oynatButonuElementi=driver.findElement(By.xpath("//button[@aria-label='Oynat']"));

        Assert.assertFalse(oynatButonuElementi.isDisplayed());
    }
}
