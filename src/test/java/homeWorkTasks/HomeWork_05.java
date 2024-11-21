package homeWorkTasks;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_05 {

    /*
    Go to https://thinking-tester-contact-list.herokuapp.com/
    Create a user
    Sing in Application
    Add 5 contacts
    */

    /*
    https://thinking-tester-contact-list.herokuapp.com/ adresine gidin
    Bir kullanıcı oluşturun
    Uygulamaya giriş yapın
    5 kişi ekleyin
    */

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void applicationTest() throws InterruptedException {


        //Create a user
        Thread.sleep(1000);
        WebElement user= driver.findElement(By.xpath("//*[@id=\"signup\"]"));
        user.click();

        WebElement name = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        name.sendKeys("Behide");

        WebElement surName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        surName.sendKeys("Kafali");

        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys("kafali@hotmail.com");

        WebElement addPassword = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        addPassword.sendKeys("123456*");
        Thread.sleep(2000);


        WebElement inputUser = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        inputUser.click();
        Thread.sleep(2000);



        // Sing in Application
        WebElement login = driver.findElement(By.id("email"));
        login.sendKeys("kafali@hotmail.com");
        WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWord.sendKeys("123456*");
        Thread.sleep(2000);
        WebElement buttonSubmit = driver.findElement(By.id("submit"));
        buttonSubmit.click();
        Thread.sleep(2000);


       // Add 5 contacts
        WebElement addContact = driver.findElement(By.xpath("//*[@id=\"add-contact\"]"));
        addContact.click();
        driver.findElement(By.id("firstName")).sendKeys("Merve");
        driver.findElement(By.id("lastName")).sendKeys("Han");
        driver.findElement(By.id("birthdate")).sendKeys("1994/11/22");
        driver.findElement(By.id("email")).sendKeys("hanmerve@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("1111111111");
        driver.findElement(By.id("street1")).sendKeys("Gül Sokak");
        driver.findElement(By.id("city")).sendKeys("İzmir");
        driver.findElement(By.id("country")).sendKeys("Türkiye");
        Thread.sleep(1000);
        driver.findElement(By.id("submit")).click();



    }


}
