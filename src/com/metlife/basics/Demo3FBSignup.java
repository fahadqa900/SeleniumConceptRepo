package com.metlife.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
public class Demo3FBSignup
{
    public static void main(String[] args)throws Exception
    {
        //FB Signup with:
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        //Maximize Browser:
        driver.manage().window().maximize();
        //Open FB signup popup:
        driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
        Thread.sleep(3000);
        //Enter firstname:
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("fahad");
        Thread.sleep(3000);
        //Enter Surname:
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("khan");
        Thread.sleep(3000);
        //Enter mobile number:
        driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
        Thread.sleep(3000);
        //Enter new password:
        driver.findElement(By.name("reg_passwd__")).sendKeys("test@123");

        //Select option from dropdown for DOB:
        WebElement day1=driver.findElement(By.id("day"));
        Select daySelect=new Select(day1);
        daySelect.selectByVisibleText("12");

        Thread.sleep(3000);
        WebElement month1=driver.findElement(By.id("month"));
        Select monthSelect=new Select(month1);
        monthSelect.selectByVisibleText("May");

        Thread.sleep(3000);
        WebElement year1=driver.findElement(By.id("year"));
        Select yearSelect=new Select(year1);
        yearSelect.selectByVisibleText("2002");

        Thread.sleep(3000);
        //Absolute Xpath to click on first radio button:
        //driver.findElement(By.xpath("//span[@class='_5k_3']/span[1]/input")).click();
        Thread.sleep(3000);
        //Relative Xpath Xpath to click on first radio button:
        driver.findElement(By.xpath("//input[@value='1']")).click();

        //Click on signup button:
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
    }
}
