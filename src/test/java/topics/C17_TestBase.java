package topics;

import org.junit.Test;
import utilities.TestBase;

public class C17_TestBase extends TestBase { //testbase classına extends yaparak driver a ulasabiliriz

    @Test
    public void test1() {

        driver.get("https://google.com");


    }

    @Test
    public void test2() {

        driver.get("https://linkedin.com");


    }

    @Test
    public void test3() {

        driver.get("https://clarusway.com");


    }
}
