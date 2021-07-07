package VivekTechnologies.testcases;

import VivekTechnologies.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login extends TestBase {


  //  @Test(groups = {"kiana"})
    @Test
    @Parameters({"url"})
    //public void test1() {
    public void test1(String url) {
    driver.findElement(By.cssSelector(OR.getProperty("bmlBtn_CSS"))).click();
    log.info("URL fetched is : " + url);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
