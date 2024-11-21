package topics;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_BeforeClassAfterClass {        //DRY = Dont Repeat Yourself ( kendini tekrarlama ! )
    static WebDriver driver;                    //WET = Wrtie Everything Twice( herşeyi iki kez yaz ) uydurulmus kısaltmalar

    @BeforeClass
    public static void setUp() {
        System.out.println("Before Class Methodu");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        System.out.println("After Class Methodu");
        Thread.sleep(3000);
        driver.quit();
    }


    @Test
    public void test01() {
        System.out.println("test01");
        driver.get("http://www.google.com");

    }

    @Test
    public void test02() {
        System.out.println("test02");
        driver.get("http://www.linkedin.com");

    }

    @Test
    public void test03() {
        System.out.println("test03");
        driver.get("http://www.instagram.com");

    }
}
