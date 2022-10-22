package odev2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class practiceHocaOdev1 extends TestBase {
    /*
     ...Exercise3...
    // http://the-internet.herokuapp.com/add_remove_elements/
    // click on the "Add Element" button 100 times
    // write a function that takes a number, and clicks the "Delete" button
    // given number of times, and then validates that given number of
    // buttons was deleted
 */
    public void add100Elements (){
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElement= driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        for (int i=0; i<100; i++){
            addElement.click();
        }
    }
    public void delete(int deleteCount){

    }


}
