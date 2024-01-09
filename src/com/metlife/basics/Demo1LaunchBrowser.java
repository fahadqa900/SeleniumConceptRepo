package com.metlife.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1LaunchBrowser
{
    public static void main(String[] args)
    {
        //Browser Launch:
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com");
       driver.manage().window().maximize();
       String Title=driver.getTitle();
        System.out.println("Page title is "+driver.getTitle());
        System.out.println("Page title is "+Title);
        String Url=driver.getCurrentUrl();
        System.out.println("Current Url is "+Url);
        System.out.println("Current Url is "+driver.getCurrentUrl());
        String pageSource=driver.getPageSource();
        System.out.println("Page source is "+pageSource);
        System.out.println("Page source is "+driver.getPageSource());
        driver.close();

    }
}
