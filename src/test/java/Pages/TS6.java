package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TS6 {
    WebDriver driver;

    public TS6(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement CategoryName(){
        return driver.findElement(By.xpath("//a[normalize-space()='Components']"));
    }

    public WebElement CategoryList(){
        return driver.findElement(By.xpath("//a[normalize-space()='Monitors (2)']"));
    }

    public void CategoryURL(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://awesomeqa.com/ui/index.php?route=product/category&path=25_28");
    }

    public WebElement HomeBanner(){
        return driver.findElement(By.xpath("//img[@title='TheTestingAcademy eCommerce']"));
    }

    public WebElement MyAccFooter(){
        return driver.findElement(By.xpath("//ul[@class='list-unstyled']//a[normalize-space()='My Account']"));
    }


}
