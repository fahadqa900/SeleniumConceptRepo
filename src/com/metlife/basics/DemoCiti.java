package com.metlife.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoCiti
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        //maximize the browser window:
        driver.manage().window().maximize();
        //Apply implicit wait of 20 miliseconds:
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Launch the browser for citibank Url:
        driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp");
        //Select Product Type as Credit Card:
        Select creditSelect=new Select(driver.findElement(By.xpath("//ul[@id='sbOptions_2036625']/li[3]")));
        creditSelect.selectByVisibleText("Credit Card");
        //Enter credit card number in four text boxes:
        driver.findElement(By.xpath("//input[@name='citiCard1']")).sendKeys("4545");
        driver.findElement(By.xpath("//input[@name='citiCard2']")).sendKeys("5656");
        driver.findElement(By.xpath("//input[@name='citiCard3']")).sendKeys("8887");
        driver.findElement(By.xpath("//input[@name='citiCard4']")).sendKeys("9998");
       //Enter CVV:
        driver.findElement(By.xpath("//input[@name='CCVNO']")).sendKeys("1234567890");
        //Enter date:
        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[5]/a")).click();
        //Click on proceed:
        driver.findElement(By.xpath("//input[@value='PROCEED']")).click();
    }
}
