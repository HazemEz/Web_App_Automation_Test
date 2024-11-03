package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TS5 {
    WebDriver driver;

    public TS5(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement CurrencyLink (){
        return driver.findElement(By.xpath("//span[text()='Currency']"));
    }

    public WebElement CurrencySelectionEuro(){
        return driver.findElement(By.xpath("//button[@name='EUR']"));
    }

    public void CurrencySymbolEuro(){
        Assert.assertTrue(driver.findElement(By.xpath("//strong[contains(text(),'€')]")).isDisplayed());
    }

    public WebElement CurrencySelectionDollar(){
        return driver.findElement(By.xpath("//button[@name='USD']"));
    }

    public void CurrencySymbolDollar(){
        Assert.assertTrue(driver.findElement(By.xpath("//strong[text()='$']")).isDisplayed());
    }
}
