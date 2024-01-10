package com.metlife.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoCiti
{
    public static void main(String[] args)throws Exception
    {
        WebDriver driver=new ChromeDriver();
        //maximize the browser window:
        driver.manage().window().maximize();
        //Apply implicit wait of 20 miliseconds:
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Launch the browser for citibank Url:
        driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp");
        //Select Product Type as Credit Card:
        driver.findElement(By.xpath("//a[text()='select your product type']")).click();
        driver.findElement(By.xpath("//a[text()='Credit Card']")).click();

        //Enter credit card number in four text boxes:
        driver.findElement(By.xpath("//input[@name='citiCard1']")).sendKeys("4545");
        driver.findElement(By.xpath("//input[@name='citiCard2']")).sendKeys("5656");
        driver.findElement(By.xpath("//input[@name='citiCard3']")).sendKeys("8887");
        driver.findElement(By.xpath("//input[@name='citiCard4']")).sendKeys("9998");

        //Enter CVV:
        driver.findElement(By.xpath("//input[@name='CCVNO']")).sendKeys("1234567890");

        //Enter date:
        driver.findElement(By.id("bill-date-long")).click();
        Select selectYear=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        selectYear.selectByVisibleText("2022");
        Select selectMonth=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        selectMonth.selectByVisibleText("Apr");
        driver.findElement(By.xpath("//a[text()='14']")).click();
        //Click on checkbox:
        driver.findElement(By.name("agree")).click();
       //Click on proceed:
        driver.findElement(By.xpath("//input[@value='PROCEED']")).click();
        //Print:
        String actualError=driver.findElement(By.xpath("//div[@role='dialog']")).getText();
        System.out.println(actualError);
    }
}
