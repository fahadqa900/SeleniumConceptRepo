package com.metlife.alertdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo1HDFC
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        //Maximize browser window:
        driver.manage().window().maximize();
        //Apply implcit wait of 20 mili seconds:
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Launch browser window:
        driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");
        //Click on Go link:
        //driver.findElement(By.xpath("(//table[@class='dclogin'])[2]/tbody/tr[3]/td[1]/a")).click();
        driver.findElement(By.xpath("//img[@alt='Go']")).click();
        //Switch to alert prompt, get the text and print that text:
       String actualAlert=driver.switchTo().alert().getText();
        System.out.println(actualAlert);
        //Switch to alert popup and click on ok:
        driver.switchTo().alert().accept();
        //close all running sessions:
        driver.quit();
    }
}
