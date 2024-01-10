package com.metlife.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demonasscom
{
    public static void main(String[] args)throws Exception
    {
        WebDriver driver=new ChromeDriver();
        //Maximize browser:
        driver.manage().window().maximize();
        //Launch browser window:
        driver.get("https://nasscom.in/");
        //Click on login button:
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        //Click on register button:
        driver.findElement(By.xpath("//li[text()='register']")).click();
        //Enter firstname:
        driver.findElement(By.xpath("//input[@id='edit-field-fname-reg-0-value']")).sendKeys("admin");
        //Enter lastname:
        driver.findElement(By.xpath("//input[@id='edit-field-lname-0-value']")).sendKeys("pass");
        //Enter email:
        driver.findElement(By.xpath("//input[@id='edit-mail']")).sendKeys("admin1@gmail.com");
        //Enter company name:
        driver.findElement(By.xpath("//input[@id='edit-field-company-name-registration-0-value']")).sendKeys("Google");
        //Click on dropdown:
        driver.findElement(By.id("edit-field-business-focus-reg")).click();
        //Select required value from dropdown:
        Select BusinessFocus=new Select(driver.findElement(By.id("edit-field-business-focus-reg")));
        BusinessFocus.selectByVisibleText("IT Consulting");
        //Click on register:
        driver.findElement(By.id("edit-submit--2")).click();
    }
}
