package com.metlife.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScript1
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.tutorialspoint.com/java/java_regular_expressions.htm");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        //To Scroll on web page:
        //js.executeScript("window.scrollBy(50,500)");
        //Alternative approach to scroll on web page:
        //$x("//a[@title='Contact us']")[0].scrollIntoView()(To search on DOM console)
        //$x means xpath
        //$x("//a[@title='Contact us']")
        //$x("//a[@title='Contact us']")[0]
        js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//a[@title='Contact us']")));
    }
}
