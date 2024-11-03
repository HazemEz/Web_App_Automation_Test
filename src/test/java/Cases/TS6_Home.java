package Cases;


import Pages.TS6;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class TS6_Home {

    WebDriver driver;
    TS6 ts6;


    @BeforeMethod
    public  void  precondition() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Downloads\\Compressed\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\TOSHIBA\\Downloads\\Compressed\\chrome-win64\\chrome.exe");
        //    WebDriver driver = new ChromeDriver();

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        ts6 = new TS6(driver);

    }

    @Test
    public void SelectCategory () {

        Actions action = new Actions(driver);
        action.moveToElement(ts6.CategoryName()).perform();
     //   ts6.CategoryName().click();
    }

    @Test
    public void SelectSubCategory () {

        Actions action = new Actions(driver);
        action.moveToElement(ts6.CategoryName()).perform();
//        ts6.CategoryName().click();
        ts6.CategoryList().click();
        ts6.CategoryURL();
    }

    @Test
    public void NavigateToHomeUsingBanner () {
        ts6.HomeBanner().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://awesomeqa.com/ui/index.php?route=common/home");
    }

    @Test
    public void NavigateToAccUsingFooter () {
        ts6.MyAccFooter().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://awesomeqa.com/ui/index.php?route=account/login");
    }



    @AfterMethod
    public void postcondition() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
