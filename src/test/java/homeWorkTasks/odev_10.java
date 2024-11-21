package homeWorkTasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class odev_10 extends TestBase {

    /*
	Go to https://webdriveruniversity.com/Popup-Alerts/index.html
	Click on JavaScript Alert
	Print alert message
	Accept alert
	Click on JavaScript Confirm Box
	Print alert message
	Cancel alert
	Click on Modal Popup Box
	Print alert message
	Close alert
*/
    // https://webdriveruniversity.com/Popup-Alerts/index.html adresine git
    // JavaScript Alert'e tıkla
    // Uyarı mesajını yazdır
    // Uyarıyı kabul et
    // JavaScript Confirm Box'a tıkla
    // Uyarı mesajını yazdır
    // Uyarıyı iptal et
    // Modal Popup Box'a tıkla
    // Uyarı mesajını yazdır
    // Uyarıyı kapat


    @Test
    public void homeWork10() throws InterruptedException {

        // https://webdriveruniversity.com/Popup-Alerts/index.html adresine git
        driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");

        // JavaScript Alert'e tıkla
        driver.findElement(By.id("button1")).click();

        // Uyarı mesajını yazdır
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());

        // Uyarıyı kabul et
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        // JavaScript Confirm Box'a tıkla
        driver.findElement(By.id("button4")).click();

        // Uyarı mesajını yazdır
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());

        // Uyarıyı iptal et
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();

        // Modal Popup Box'a tıkla
        Thread.sleep(2000);
        driver.findElement(By.id("button2")).click();

        // Uyarı mesajını yazdır
        Thread.sleep(2000);
        WebElement modalText = driver.findElement(By.xpath("//div[@class='modal-body']"));
        System.out.println("Modal Popup Box message: " + modalText.getText());


        // Uyarıyı kapat
        WebElement closeButton = driver.findElement(By.xpath("//button[text()='Close']"));
        closeButton.click();



    }







}
