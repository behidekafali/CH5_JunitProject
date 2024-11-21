package topics;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C38_KeyboardActions extends TestBase {
/*
 Keyboard Actions, Selenium'un bir parçası olan Actions sınıfı tarafından sağlanan işlevlerdir.
 Bu sınıf, bir web sayfasındaki elementlerle kullanıcı klavye etkileşimlerini
 (örneğin, tuşa basma, tuş bırakma, kopyala-yapıştır işlemleri) simüle etmek için kullanılır.

 Klavye Tuşlarına Basmak: Bir tuşa basmak ve bırakmak gibi işlemler simüle edilir.
  Örneğin, ENTER, TAB, SHIFT, CTRL gibi tuşlar kullanılabilir.

Kombine Tuş Basımları: Birden fazla tuşa aynı anda basma işlemleri simüle edilebilir.
 Örneğin, CTRL+C (kopyalama) ve CTRL+V (yapıştırma) işlemleri.

Metin Girişi: Bir input alanına metin girişi yapılabilir.

 */

    //Go to URL: https://testpages.eviltester.com/styled/basic-html-form-test.html
    //In the username section, print "John" by using the action methods.
    //Do not use findElement() method

    @Test
    public void keyboardActionsTest() {

        //Go to URL: https://testpages.eviltester.com/styled/basic-html-form-test.html
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");

        //In the username section, print "John" by using the action methods.
        Actions actions = new Actions(driver);
        actions
                .sendKeys(Keys.TAB) //Tab tuşuna basar çeker
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .keyDown(Keys.SHIFT) //Shift tuşuna basılı tutar
                .sendKeys("j")
                .keyUp(Keys.SHIFT)
                .sendKeys("ohn")
                .sendKeys(Keys.ENTER)
                .perform();


    }


}
