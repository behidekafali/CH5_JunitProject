package topics;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;

public class C61_NullPointerException {

    WebDriver driver; // Driver null durumda olduğundan kullanıldığında NullPointerException atar.

    @Test
    public void test1() {

        //Çözüm : null objeye atama yapmak
       // driver = new ChromeDriver();

    driver.get("https://google.com"); //NullPointerException

    }

}
