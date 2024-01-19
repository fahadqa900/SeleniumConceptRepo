package com.metlife.opennewwindowtabandmultiplewindowhandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Windows1
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //w3schools for div WebTable:
        driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_grid");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com");
        Set<String> winds=driver.getWindowHandles();
        driver.switchTo().window(winds.toArray()[0].toString());
        driver.switchTo().window(winds.toArray()[1].toString());
    }
}
