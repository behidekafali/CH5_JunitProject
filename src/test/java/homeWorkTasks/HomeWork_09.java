package homeWorkTasks;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class HomeWork_09 {

    /*
     Go to https://testpages.eviltester.com/styled/calculator
     Do all math operations with different @Test methods
     Get the result
     Verify the result
     Print the result
    */

    /*
     https://testpages.eviltester.com/styled/calculator adresine gidin
     Farklı @Test metotları ile tüm matematiksel işlemleri yapın
     Sonucu alın
     Sonucu doğrulayın
     Sonucu yazdırın
*/
    static WebDriver driver;
    WebElement dropDown = driver.findElement(By.id("function"));
    Select select = new Select(dropDown);


    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(" https://testpages.eviltester.com/styled/calculator");
    }

    @AfterClass // her test metodu sonrası calısır
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


    @Test
    public void plus() throws InterruptedException {

        WebElement numberone = driver.findElement(By.id("number1"));
        numberone.sendKeys("3");
        WebElement numbertwo = driver.findElement(By.id("number2"));
        numbertwo.sendKeys("3");
        WebElement calculate = driver.findElement(By.id("calculate"));
        calculate.click();
        String result = driver.findElement(By.id("answer")).getText();
        assertEquals("6", result);
        System.out.println("Result: " + result);
        Thread.sleep(3000);

    }
    @Test
    public void times() throws InterruptedException {
        WebElement numberone = driver.findElement(By.id("number1"));
        numberone.sendKeys("3");
        WebElement numbertwo = driver.findElement(By.id("number2"));
        numbertwo.sendKeys("3");
        select.selectByVisibleText("times");
        WebElement calculate = driver.findElement(By.id("calculate"));
        calculate.click();
        String result = driver.findElement(By.id("answer")).getText();
        assertEquals("9", result);
        System.out.println("Result: " + result);
        Thread.sleep(3000);

    }
    @Test
    public void minus() throws InterruptedException {
        WebElement numberone = driver.findElement(By.id("number1"));
        numberone.sendKeys("3");
        WebElement numbertwo = driver.findElement(By.id("number2"));
        numbertwo.sendKeys("3");
        select.selectByVisibleText("minus");
        WebElement calculate = driver.findElement(By.id("calculate"));
        calculate.click();
        String result = driver.findElement(By.id("answer")).getText();
        assertEquals("0", result);
        System.out.println("Result: " + result);
        Thread.sleep(3000);

    }
    @Test
    public void divide() throws InterruptedException {
        WebElement numberone = driver.findElement(By.id("number1"));
        numberone.sendKeys("5");
        WebElement numbertwo = driver.findElement(By.id("number2"));
        numbertwo.sendKeys("2");
        select.selectByVisibleText("divide");
        WebElement calculate = driver.findElement(By.id("calculate"));
        calculate.click();
        String result = driver.findElement(By.id("answer")).getText();
        assertEquals("2.5", result);
        System.out.println("Result: " + result);
        Thread.sleep(3000);
    }


}
