package homeWorkTasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import static org.junit.Assert.assertTrue;

public class HomeWork_08 extends TestBase {

    /*
Go to URL: https://app.endtest.io/guides/docs/how-to-test-checkboxes/
Select all checkboxes
Assert that they are all selected
 */

    /*
URL'ye git: https://app.endtest.io/guides/docs/how-to-test-checkboxes/
Tüm onay kutularını seç
Hepsinin seçili olduğunu doğrula
    */

    @Test
    public void odev_08() {

//        Go to URL: https://app.endtest.io/guides/docs/how-to-test-checkboxes/
        driver.get("https://app.endtest.io/guides/docs/how-to-test-checkboxes/");


//        Select all checkboxes
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        WebElement checkbox3 = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));

        if (!checkbox1.isSelected()) {
            checkbox1.click();
        }
        if (!checkbox2.isSelected()) {
            checkbox2.click();
        }
        if (!checkbox3.isSelected()) {
            checkbox3.click();
        }

//        Assert that they are all selected

        assertTrue(checkbox1.isSelected() && checkbox2.isSelected() && checkbox3.isSelected());

    }


}
