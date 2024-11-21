package homeWorkTasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class odev_13 extends TestBase {

    /*
	Go to URL: https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html
	Shift 34 units to the up and 34 units to the down on the vertical axis.
*/
    /*
	URL'ye git: https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html
	Dikey eksende 34 birim yukarı ve 34 birim aşağı kaydır.
*/


    @Test
    public void homeWork13() {

        //Go to URL: https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html
        driver.get("https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html");

        //Shift 34 units to the up and 34 units to the down on the vertical axis.
        WebElement slider = driver.findElement(By.cssSelector(".range-slider-handle"));

      Actions actions = new Actions(driver);
      actions
              .dragAndDropBy(slider,0,-34)
              .pause(1000)
              .dragAndDropBy(slider, 0,34)
              .perform();






    }

}
