package topics;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class C41_RobotClass extends TestBase {

/*  Robot sınıfı, Selenium'un yetersiz kaldığı durumlarda, özellikle düşük seviyeli klavye ve fare işlemleri
    gerektiğinde devreye girer. Dosya yükleme/indirme işlemleri, sistem diyaloglarıyla etkileşim ve tarayıcı penceresi
    kontrolü gibi işlemler için Robot sınıfı kullanılarak daha kapsamlı ve esnek test senaryoları oluşturulabilir.


Selenium ve Robot Sınıfının Kullanım Alanları

Klavye ve Fare İşlemleri:
Selenium, belirli klavye ve fare işlemlerini gerçekleştirebilir, ancak tüm düşük seviyeli giriş işlemlerini kapsamayabilir.
 Robot sınıfı, tuş kombinasyonları, fare hareketleri ve tıklamalar gibi daha karmaşık giriş işlemlerini simüle etmek için kullanılabilir.

Dosya Yükleme ve İndirme:
Selenium, dosya yükleme işlemleri için genellikle sendKeys metodunu kullanır, ancak dosya indirme işlemlerinde sistem düzeyinde
 bir etkileşim gerektiğinde yetersiz kalabilir. Robot sınıfı, dosya yükleme/indirme diyaloglarıyla etkileşim kurmak için kullanılabilir.

Popup ve Dialog Pencereleri:
Bazı popup ve sistem dialog pencereleri doğrudan Selenium ile kontrol edilemez. Bu tür pencerelerle etkileşim kurmak için Robot sınıfı kullanılabilir.

Tarayıcı Eylemleri:
Tarayıcı pencerelerini yeniden boyutlandırma, minimize etme, maximize etme veya belirli koordinatlara taşıma gibi işlemler Robot sınıfı ile yapılabilir.
 */
//Robot sınıfı metotları ve işlevleri:
//    keyPress(): Belirli bir tuşa basar.
//    keyRelease(): Belirli bir tuşu bırakır.
//    mouseMove(): Fare imlecini belirtilen koordinatlara taşır.
//    mousePress(): girilen değere göre  fare düğmesine basar.
//    mousePress(1):birincil tuşa basar.
//    mouseRelease(): Belirli bir fare düğmesini bırakır.
//    mouseWheel(): Fare tekerleğini döndürür.
//    delay(): Belirtilen süre boyunca bekler.
//    createScreenCapture(): Belirtilen alanın ekran görüntüsünü alır.
//    setAutoDelay(): Her bir eylemden sonra otomatik bekleme süresi ayarlar.
//    setAutoWaitForIdle(): Eylemlerden sonra olay kuyruğunun boşalmasını bekler.


    /*
    Go to https://testpages.eviltester.com/styled/basic-html-form-test.html
    Copy h1 element's text and paste it into username input
    Click enter
    Scroll page down
    Scroll page up
    (Don't use click() and sendKeys() methods)
 */

    @Test
    public void robotClassTest() throws InterruptedException, AWTException {
        // Go to https://testpages.eviltester.com/styled/basic-html-form-test.html
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");

        //    Copy h1 element's text and paste it into username input
        String h1 = driver.findElement(By.tagName("h1")).getText();
        System.out.println("h1 = " + h1);

        StringSelection ss = new StringSelection(h1);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); // bu 2 satırda h1 textini panoya kopyaladık.

        Robot robot = new Robot();

        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);//Bu 2 satırda tab tuşuna basılıp çekilir.
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        //CTRL+V ile panodaki String değeri yapıştıralım:
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);//Bu iki satır => CTRL + V
        //Bastığımız tuşları kaldrımayı unutmayalım!!!
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        //Click enter
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);//Bu 2 satırda Enter tuşuna basılıp çekilir
        Thread.sleep(3000);

//Scroll page down
        robot.mouseWheel(3);

//Scroll page up
        Thread.sleep(3000);
        robot.mouseWheel(-2);

    }


}


