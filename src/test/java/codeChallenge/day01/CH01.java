package codeChallenge.day01;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CH01 {

    /*
       driver.get() Methodlari
        -  driver.get(String Url);     String olarak girilen Url’e gider
        -  driver.getTitle();          Icinde olunan sayfanin basligini String olarak getirir
        -  driver.getCurrentUrl();     Icinde olunan sayfanin Url’ini String olarak getirir
        -  driver.getPageSource();     Icinde olunan sayfanin kaynak kodlarini String olarak getirir
    /*
     /*
    //1) Open the browser
    //2) Enter the URL https://www.ikea.com/
    //3) set expected title "Welcome"
    //4) using getTitle() to retrieve actual title.
    //5) verify title: contains "Welcome"
    //6) get currentUrl text
   */

    static WebDriver driver;

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
    public void test1() {

        //1) Open the browser
        //2) Enter the URL https://www.ikea.com/

        //3) set expected title "Welcome"
        //4) using getTitle() to retrieve actual title.
        //5) verify title: contains "Welcome"
        //6) get currentUrl text
    }
}
