package com.metlife.navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.get("https://www.yahoo.com");
        System.out.println((driver.getCurrentUrl()));
        driver.navigate().back();
    }
}
