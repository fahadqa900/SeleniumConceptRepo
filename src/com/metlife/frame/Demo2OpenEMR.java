package com.metlife.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2OpenEMR
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        //Maximize the browser:
        driver.manage().window().maximize();
        //Launch the browser Url:
        driver.get("http://demo.openemr.io/b/openemr/");
        //Enter username:
        driver.findElement(By.id("authUser")).sendKeys("admin");
        //Enter the password:
        driver.findElement(By.id("clearPass")).sendKeys("pass");
        //Select the language:
        Select language=new Select(driver.findElement(By.xpath("//select[@name='languageChoice']")));
        language.selectByVisibleText("English (Indian)");
        //Click on login button:
        driver.findElement(By.id("login-button")).click();
        //Click on button patient:
        driver.findElement(By.xpath("(//div[@class='menuSection dropdown'])[1]/div")).click();
        //Click on New Search button:
        driver.findElement(By.xpath("//div[text()='New/Search']")).click();
        //Switching to frame by using WebElement:
        WebElement elementFrame= driver.findElement(By.name("pat"));
        driver.switchTo().frame(elementFrame);
        //Enter the firstname:
        driver.findElement(By.name("form_fname")).sendKeys("fahad");
        //Enter the lastname:
        driver.findElement(By.name("form_lname")).sendKeys("khan");
    }
}
