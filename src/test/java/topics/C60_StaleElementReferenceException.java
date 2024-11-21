package topics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C60_StaleElementReferenceException extends TestBase {

    @Test
    public void test1() {

        driver.get("https://thinking-tester-contact-list.herokuapp.com/");

        WebElement signup = driver.findElement(By.id("signup"));
        signup.click();

        driver.get("https://google.com");

        driver.get("https://thinking-tester-contact-list.herokuapp.com/");

        //ilk sayfada locate edilen elementin referansı eskidi.
        //tekrar locate edilmeden aynı web element kullanılırsa staleelementreferenceexception atar.
        //çözüm : tekrar locat et
        // driver.findElement(By.id("signup"));

        signup.click();//StaleElementReferenceException
    }

    @Test
    public void test2() {

        driver.get("https://google.com");

        WebElement searchBox = driver.findElement(By.name("q"));

        driver.navigate().refresh(); // refresh yapılınca önceki locate edilen web elementlerin referensları eskir.

       //çözüm: relocate --> searchBox = driver.findElement(By.name("q"));

        searchBox.sendKeys("Clarusway"+ Keys.ENTER); //StaleElementReferenceException

    }
}
