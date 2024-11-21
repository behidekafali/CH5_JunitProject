package homeWorkTasks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class odev_11 extends TestBase {

/*

      Go to http://webdriveruniversity.com/To-Do-List/index.html

      Add todos: (Prepare breakfast, Wash the dishes, Take care of baby, Help your kid's homework, Study Selenium, Sleep)

      Strikethrough all todos.(Üzerlerini çiziniz)

      Delete all todos.

      Assert that all todos deleted.
      ----------------------------------------------------------------------------------------------------------
       Verilen
      http://webdriveruniversity.com/To-Do-List/index.html adresine git
  Ne zaman
      Şu görevleri ekle: (Kahvaltı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenium çalış, Uyu)
  Ve
      Tüm görevlerin üzerini çiz.
  Ve
      Tüm görevleri sil.
  O zaman
      Tüm görevlerin silindiğini doğrula.
*/

    @Test
    public void homeWork11() throws InterruptedException {

//        Go to http://webdriveruniversity.com/To-Do-List/index.html
             driver.get("http://webdriveruniversity.com/To-Do-List/index.html");

//        Add todos: (Prepare breakfast, Wash the dishes, Take care of baby, Help your kid's homework, Study Selenium, Sleep)

        WebElement addInput = driver.findElement(By.xpath("//input[@type='text]"));

        addInput.sendKeys("Prepare breakfast" + Keys.ENTER);
        addInput.sendKeys("Wash the dishes" + Keys.ENTER);
        addInput.sendKeys("Take care of baby" + Keys.ENTER);
        addInput.sendKeys("Help your kid's homework" + Keys.ENTER);
        addInput.sendKeys("Study Selenium" + Keys.ENTER);
        addInput.sendKeys("Sleep" + Keys.ENTER);


//        Strikethrough all todos.(Üzerlerini çiziniz)
        List<WebElement> todoItems = driver.findElements(By.xpath("//li"));
        for (WebElement item : todoItems) {
            item.click();
        }


//        Delete all todos.
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//li//i"));
        for (WebElement deleteButton : deleteButtons) {
            deleteButton.click();
        }


//        Assert that all todos deleted.
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElements(By.tagName("li")).isEmpty());





    }

}
