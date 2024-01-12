package com.metlife.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo1HDFC
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        //Maximize the browser window:
        driver.manage().window().maximize();
        //Apply implicit wait of 20 mili seconds:
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Launching the browser:
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        //Switch to Frame by using frame name:
        driver.switchTo().frame("login_page");
        //Inspect the element on frame and enter text:
        driver.findElement(By.name("fldLoginUserId")).sendKeys("john@test.com");

    }
}
