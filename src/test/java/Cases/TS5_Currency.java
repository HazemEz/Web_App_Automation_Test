package Cases;

import Pages.TS5;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TS5_Currency {
    WebDriver driver;
    TS5 ts5;

    @BeforeMethod
    public  void  precondition() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Downloads\\Compressed\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\TOSHIBA\\Downloads\\Compressed\\chrome-win64\\chrome.exe");
        //    WebDriver driver = new ChromeDriver();

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        ts5 = new TS5(driver);
    }

    @Test
    public void SwitchCurrencyToEuro () {

        ts5.CurrencyLink().click();
        ts5.CurrencySelectionEuro().click();
        ts5.CurrencySymbolEuro();
    }

    @Test
    public void SwitchCurrencyToDollar () {

        ts5.CurrencyLink().click();
        ts5.CurrencySelectionEuro().click();
        ts5.CurrencySymbolDollar();
    }

    @AfterMethod
    public void postcondition() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
