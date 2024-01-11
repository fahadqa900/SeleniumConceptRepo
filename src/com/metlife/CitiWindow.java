package com.metlife;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;

public class CitiWindow
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        //Maximize the browser window:
        driver.manage().window().maximize();
        //Apply implicit wait of 20 mili seconds:
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Launch browser window:
        driver.get("https://www.online.citibank.co.in/");
        //Close first alert window:
        driver.findElement(By.className("newclose")).click();
        //Close second alert window:
        driver.findElement(By.className("newclose2")).click();
        //Click on login link:
        driver.findElement(By.xpath("//a[@title='Login']")).click();
        //Converting getWindowHandles return type from set to list so that to use get method:
        ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
        //Switch to second window:
        driver.switchTo().window(windows.get(1));
        //Do activities on second window:
        driver.findElement(By.xpath("//div[@class='fl cup pt3']")).click();
        driver.findElement(By.xpath("//a[text()='select your product type']")).click();
        driver.findElement(By.xpath("//a[text()='Credit Card']")).click();
        driver.findElement(By.id("citiCard1")).sendKeys("4545");
        driver.findElement(By.id("citiCard2")).sendKeys("5656");
        driver.findElement(By.id("citiCard3")).sendKeys("8887");
        driver.findElement(By.id("citiCard4")).sendKeys("9998");
        driver.findElement(By.id("cvvnumber")).sendKeys("123");
        driver.findElement(By.id("bill-date-long")).click();
        Select selectYear=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        selectYear.selectByVisibleText("2022");
        Select selectMonth=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        selectMonth.selectByVisibleText("Apr");
        driver.findElement(By.xpath("//a[text()='14']")).click();
        driver.findElement(By.xpath("//input[@value='PROCEED']")).click();
        //Storing value in errMsg String variable:
        String errMsg= driver.findElement(By.xpath("//div[@role='dialog']")).getText();
       //Print message on console:
        System.out.println(errMsg);
    }
}
