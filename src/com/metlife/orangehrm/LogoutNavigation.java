package com.metlife.orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LogoutNavigation
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        //Apply contains method in xpath:
        driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Admin");
        //driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        //Apply starts-with method in xpath:
        driver.findElement(By.xpath("//input[starts-with(@name,'password')]")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //System.out.println(driver.getTitle());
        //driver.navigate().refresh();
        driver.findElement(By.linkText("Logout")).click();
        //System.out.println(driver.getTitle());
        driver.navigate().back();
        System.out.println(driver.getTitle());
    }
}
