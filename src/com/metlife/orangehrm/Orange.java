package com.metlife.orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Orange
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
        driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")).click();
        driver.findElement(By.xpath("//button[text()=' Add ']")).click();
        driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
       //Using different locator for XPath(text() method):
        //driver.findElement(By.xpath("(//*[text()='Admin'])[3]")).click();
        //Using different locator for XPath(Following sibling concept):
       driver.findElement(By.xpath("//div[@class='oxd-select-text-input']/following::*[text()='Admin']")).click();
       driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("abcdabcd");
       driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();
       driver.findElement(By.xpath("//*[text()='Enabled']")).click();
       driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("test123");
       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test@123");
       driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("test@123");
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       //Using following sibling to click on PIM element:
       driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[1]/following-sibling::li[1]")).click();
       //Using preceding sibling to click on Admin element:
       driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper']/preceding-sibling::li[11]")).click();
    }
}
