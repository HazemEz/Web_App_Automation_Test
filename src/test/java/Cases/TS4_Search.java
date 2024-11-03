package Cases;

import Pages.TS4;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TS4_Search {

    WebDriver driver;
    TS4 ts4;

    @BeforeMethod
    public  void  precondition() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Downloads\\Compressed\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\TOSHIBA\\Downloads\\Compressed\\chrome-win64\\chrome.exe");
        //    WebDriver driver = new ChromeDriver();

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        ts4 = new TS4(driver);
    }

    @Test
    public void SearchForExistedItem () {

        ts4.SearchBox().sendKeys("imac");
        ts4.SearchBtn().click();
        ts4.SearchResultExisted();
    }

    @Test
    public void SearchForExistedItemWithEnter () {

        ts4.SearchBox().sendKeys("imac");
        ts4.SearchBox().sendKeys(Keys.ENTER);
        ts4.SearchResultExisted();
    }
    @Test
    public void SearchForNonExistedItem () {

        ts4.SearchBox().sendKeys("hazem");
        ts4.SearchBtn().click();
        ts4.SearchResultNotExisted();
    }
    @AfterMethod
    public void postcondition() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
