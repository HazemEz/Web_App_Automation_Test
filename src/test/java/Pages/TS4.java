package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TS4 {
    WebDriver driver;

    public TS4(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement SearchBox (){
        return  driver.findElement(By.xpath("//input[@name = \"search\"]"));
    }

    public WebElement SearchBtn (){
        return  driver.findElements(By.xpath("//button [@type = \"button\"]")).get(3);
    }

    public void SearchResultExisted (){
        Assert.assertTrue(driver.findElement(By.linkText("iMac")).isDisplayed());
    }

    public void SearchResultNotExisted (){
        Assert.assertTrue(driver.findElement(By.xpath("//p[text()='There is no product that matches the search criteria.']")).isDisplayed());
    }
}
