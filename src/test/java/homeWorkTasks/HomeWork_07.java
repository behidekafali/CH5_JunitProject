package homeWorkTasks;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class HomeWork_07 {

        /*
      Go to https://testpages.eviltester.com/styled/find-by-playground-test.html
      Assert that there are 42 web elements with 'p' tag on the page

      https://testpages.eviltester.com/styled/find-by-playground-test.html adresine git
    Sayfada 'p' etiketine sahip 42 web öğesi olduğunu doğrula

         */

   static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testpages.eviltester.com/styled/find-by-playground-test.html");
    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void odev07_Test() {
        List <WebElement> elements = driver.findElements(By.tagName("p"));
        int numberOfPElements= elements.size();
        assertEquals("Sayfadaki 'p' etiketine sahip öğe sayısı doğru değil", 42, numberOfPElements);




    }



}
