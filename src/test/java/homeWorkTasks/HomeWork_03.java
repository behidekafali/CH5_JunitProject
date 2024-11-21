package homeWorkTasks;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class HomeWork_03 {

    /*
Go to Clarusway homepage
Do the following tasks by creating 3 different test methods.
Check if the URL contains clarusway.
Check if the title does not contain Python.
Check if the title equals to "Online IT Bootcamp; Learn Coding, Data Science, AWS, DevOps, Cyber Security & Salesforce"
 */

    /*
Clarusway ana sayfasına git
3 farklı test yöntemi oluşturarak aşağıdaki görevleri yapın.
URL'nin clarusway içerip içermediğini kontrol edin.
Başlığın Python içerip içermediğini kontrol edin.
Başlığın "Çevrimiçi BT Eğitim Kampı; Kodlamayı Öğrenin, Veri Bilimi, AWS, DevOps, Siber Güvenlik ve Salesforce" olup olmadığını kontrol edin
   */
    static WebDriver driver;

    @BeforeClass
    public static void start() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://clarusway.com");
    }

    @AfterClass
    public static void stop() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void urlControl() {
        assertFalse(driver.getCurrentUrl().contains("clarusway"));

    }
    @Test
    public void titleControl() {

        assertTrue(driver.getTitle().contains("Python"));
    }
    @Test
    public void titleEqualsTest() {
        assertEquals(driver.getTitle(),"Online IT Bootcamp; Learn Coding, Data Science, AWS, DevOps, Cyber Security & Salesforce");

    }
}
