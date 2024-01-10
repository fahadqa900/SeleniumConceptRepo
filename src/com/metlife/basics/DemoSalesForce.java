package com.metlife.basics;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSalesForce
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //Implicit wait for 20 seconds:
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Browser launch with salesforce Url:
        driver.get("https://login.salesforce.com/?locale=in");
        //Click on Try link:
        driver.findElement(By.xpath("//div[@id='signup']/a")).click();;
        //Enter firstname:
        driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("john");
        //Enter lastname:
        driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("ramsay");
        //Enter email:
        driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("john@CCCS.COM");
        //Select jobtitle:
        Select jobTitle=new Select(driver.findElement(By.name("UserTitle")));
        jobTitle.selectByVisibleText("IT_Manager_AP");
        //Select country:
        WebElement selectCountry= driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
        Select countrySelect=new Select(selectCountry);
        countrySelect.selectByVisibleText("Maldives");
        //Select employee:
        Select employee=new Select(driver.findElement(By.name("CompanyEmployees")));
        employee.selectByVisibleText("101-200 employees");
        //Click on checkbox:
        driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
        //Click on button:
        driver.findElement(By.name("start my free trial")).click();
    }
}
