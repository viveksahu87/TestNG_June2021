package VivekTechnologies.testcases;

import VivekTechnologies.base.TestBase;
import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class AddCustomerTest extends TestBase {



  //  @Test(priority = 2,dataProvider = "getData" , groups = {"kiana"})
  @Test(priority = 2, groups = {"kiana"})
   // public void addCustomer(String firstName,String lastName, String postCode, String alerttext) throws InterruptedException {
  public void addCustomer() throws InterruptedException {
        driver.findElement(By.cssSelector(OR.getProperty("addCustBtn_CSS"))).click();
        driver.findElement(By.cssSelector(OR.getProperty("firstname_CSS"))).sendKeys("firstName");
        driver.findElement(By.cssSelector(OR.getProperty("lastname_CSS"))).sendKeys("lastName");
        driver.findElement(By.cssSelector(OR.getProperty("postcode_CSS"))).sendKeys("444");
        driver.findElement(By.cssSelector(OR.getProperty("addbtn_CSS"))).click();
        Alert alert =  wait.until(ExpectedConditions.alertIsPresent());
      //  Reporter.log("Login Sucessfull-----");

        Assert.assertTrue(alert.getText().contains("Customer"));
        //Thread.sleep(3000);
        alert.accept();


    }
    /*
    @DataProvider
    public Object [] [] getData(){

        String sheetName = "addCustomer";
        int rows = excel.getRowCount(sheetName);
        int cols = excel.getColumnCount(sheetName);

        Object[][] data = new Object[rows - 1][cols];

        for (int rowNum = 2; rowNum <= rows; rowNum++) { // 2

            for (int colNum = 0; colNum < cols; colNum++) {

                data[rowNum-2][colNum]= excel.getCellData(sheetName,colNum,rowNum);
                // data[0][0]
            }

        }
        return data;
    }*/
}
