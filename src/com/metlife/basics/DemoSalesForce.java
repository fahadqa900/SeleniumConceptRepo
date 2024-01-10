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
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://login.salesforce.com/?locale=in");
        driver.findElement(By.xpath("//div[@id='signup']/a")).click();;
        driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("john");
        driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("ramsay");
        driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("john@CCCS.COM");
        Select jobTitle=new Select(driver.findElement(By.name("UserTitle")));
       jobTitle.selectByVisibleText("IT_Manager_AP");
        Select employee=new Select(driver.findElement(By.name("CompanyEmployees")));
        employee.selectByVisibleText("101-200 emplpoyees");
        driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();

    }
}
