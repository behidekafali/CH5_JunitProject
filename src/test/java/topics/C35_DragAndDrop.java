package topics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import javax.swing.text.html.HTML;

public class C35_DragAndDrop extends TestBase {
/*
    Selenium'da "drag and drop" (sürükle ve bırak) işlevi, bir web sayfasındaki bir öğeyi
            (örneğin bir kutu, resim veya başka bir HTML öğesi) bir konumdan başka bir
    konuma sürüklemek için kullanılır. Bu işlev, kullanıcı etkileşimlerini otomatikleştirmek ve özellikle
    sürükleme ve bırakma işlemlerini içeren test senaryolarını gerçekleştirmek için kullanışlıdır.

 */

    // Go to URL: http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Fill in capitals by country.

    @Test
    public void dragAndDropTest() { // SÜRÜKLE BIRAK MANTIĞI !!!

        // Go to URL: http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        driver.get(" http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        // Fill in capitals by country.

        //Source
        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement stockholm = driver.findElement(By.id("box2"));
        WebElement washington = driver.findElement(By.id("box3"));
        WebElement copenhagen = driver.findElement(By.id("box4"));
        WebElement seoul = driver.findElement(By.id("box5"));
        WebElement rome = driver.findElement(By.id("box6"));
        WebElement madrid = driver.findElement(By.id("box7"));

        //Target
        WebElement norway = driver.findElement(By.id("box101"));
        WebElement sweden = driver.findElement(By.id("box102"));
        WebElement usa = driver.findElement(By.id("box103"));
        WebElement denmark = driver.findElement(By.id("box104"));
        WebElement korea = driver.findElement(By.id("box105"));
        WebElement italy = driver.findElement(By.id("box106"));
        WebElement spain = driver.findElement(By.id("box107"));


        Actions actions = new Actions(driver);
        actions
                .dragAndDrop(oslo,norway) //Birinci parantezde belirtilen wen elemneti, ikinci parantezde belirtilene sürükleyip bırakır.
                .pause(1000) //isterseniz sadece drag and drop geciktirir,Sadece actions işlemini bekletir. Thread.sleep() gibi değildir.
                .dragAndDrop(stockholm,sweden)
                .dragAndDrop(washington,usa)
                .dragAndDrop(copenhagen,denmark)
                .dragAndDrop(seoul,korea)
                .dragAndDrop(rome,italy)
                .dragAndDrop(madrid,spain)
                .perform();









    }

}
