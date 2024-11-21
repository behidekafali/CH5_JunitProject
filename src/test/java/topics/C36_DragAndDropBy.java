package topics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;

public class C36_DragAndDropBy extends TestBase {

    /*
    "Drag and Drop By" Selenium'da bir öğeyi belirli bir konuma sürüklemek için kullanılan bir yöntemdir.
    Bu yöntem, öğenin başlangıç konumundan belirli bir x ve y koordinatına kadar sürüklenmesini sağlar.
     */

    //Go to URL: https://rangeslider.js.org/
    //Shift 100 units to the right and 100 units to the left on the horizontal axis.

    @Test
    public void C36_DragAndDropByTest() {

        //Go to URL: https://rangeslider.js.org/
        driver.get("http://rangeslider.js.org");

        //Shift 100 units to the right and 100 units to the left on the horizontal axis.
        WebElement slider = driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[1"));
        Actions actions = new Actions(driver);
        actions
                .dragAndDropBy(slider, 55, 0)
                .pause(1000)
                .dragAndDropBy(slider, -50, 0)
                .perform();

        assertEquals("300", driver.findElement(By.id("js-output")).getText());

    }


}
