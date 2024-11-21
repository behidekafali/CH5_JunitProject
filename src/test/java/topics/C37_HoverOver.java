package topics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C37_HoverOver extends TestBase {
    /*
        Selenium ile "hover over" veya "mouse over" işlemi, bir web sayfasındaki bir öğenin üzerine
         fare imleci götürüldüğünde gerçekleşen bir etkileşimi ifade eder. Bu işlem, fare imleci bir
         öğenin üzerine getirildiğinde belirli bir tepkiyi tetikler. Örneğin, bir menü elemanının
         üzerine gelindiğinde alt menülerin açılması gibi.

    Selenium, bu tür interaktif işlemleri otomatize etmek için kullanılan bir araçtır.
    Web sayfalarını otomatik olarak test etmek veya belirli işlemleri otomatize etmek için kullanılır.
     Bu kapsamda, Selenium'un "Actions" sınıfı, mouse işlemlerini gerçekleştirmek için kullanılır ve bu
     sınıfın bir metodu olan "move_to_element" fonksiyonu, belirli bir öğenin üzerine fare imleci getirilmesini sağlar.
      Dolayısıyla, "hover over"
    işlemi, bu fonksiyonu kullanarak belirli bir web öğesinin üzerine fare imleci getirme işlemidir.
         */

    /*
    Go to URL: https://www.browserstack.com/
    Hover over on “Products” link.
    Click on "Automate".
    Verify the page URL contains “automate”.
*/

    @Test
    public void hoverOverTest() {
//Go to URL: https://www.browserstack.com/
        driver.get("https://www.browserstack.com/");

//Hover over on “Products” link.
        WebElement products = driver.findElement(By.id("products-dd-toggle"));

        Actions actions = new Actions(driver);
        actions
                .moveToElement(products)//moveToElement () methodu parantez içinde belirtilen web elementin üzerine mouse getirir.
                .perform();


//Click on "Automate".
        driver.findElement(By.xpath("(//div[.='Browser automation grid'])[1]")).click();

//Verify the page URL contains “automate”.
        assert driver.getCurrentUrl().contains("automate");


    }


}
