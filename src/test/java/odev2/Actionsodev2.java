package odev2;

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
        WebElement videoElementi= driver.findElement(By.xpath("//iframe[@id='skimlinks-pixels-iframe']"));
        bekle(3);

        driver.switchTo().frame(videoElementi);
        bekle(3);
        Actions actions=new Actions(driver);
        actions.keyDown(Keys.ARROW_DOWN);
        bekle(3);

        //4- videoyu izlemek icin Play tusuna basin
        //5- videoyu calistirdiginizi test edin
    }
}
