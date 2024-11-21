package homeWorkTasks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class HomeWork_04 {

    /*
     Create chrome driver object by using @Before annotation
     Navigate to  https://testpages.herokuapp.com/styled/index.html
     Click on  Calculator under Micro Apps
     Type any number in the first input
     Type any number in the second input
     Click on Calculate
     Get the result
     Verify the result
     Print the result
     Close the browser by using @After annotation
*/
    /*
     @Before açıklamasını kullanarak chrome driver nesnesi oluşturun
     https://testpages.herokuapp.com/styled/index.html adresine gidin
     Micro Uygulamalar altında Calculator'a tıklayın
     İlk girişe herhangi bir sayı yazın
     İkinci girişe herhangi bir sayı yazın
     Hesapla'ya tıklayın
     Sonucu alın
     Sonucu doğrulayın
     Sonucu yazdırın
     @After açıklamasını kullanarak tarayıcıyı kapatın
*/
    static WebDriver driver;

    @Before
    public void start() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
    }

    @After
    public void stop() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void clickOn() {
        WebElement Calculator = driver.findElement(By.id("calculatetest"));
        Calculator.click();
        WebElement numberone = driver.findElement(By.id("number1"));
        numberone.sendKeys("10");
        WebElement numbertwo = driver.findElement(By.id("number2"));
        numbertwo.sendKeys("20");
        WebElement calculate = driver.findElement(By.id("calculate"));
        calculate.click();
        String result = driver.findElement(By.id("answer")).getText();
        assertEquals("30", result);
        System.out.println("Result: " + result);

    }

}
