package com.metlife.browserconfiguration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Configuration1
{
    public static void main(String[] args)
    {
        //Apart from Actions class also we discussed about browser configuration in this
        //section:
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.tutorialspoint.com/java/java_regular_expressions.htm");
        //For drag and drop:
        Actions ac=new Actions(driver);
        ac.moveToElement(driver.findElement(By.xpath("")))
                .pause(50)
                .clickAndHold(driver.findElement(By.xpath("")))
                .pause(50)
                .moveToElement(driver.findElement(By.xpath("")))
                .pause(50)
                .release()
                .perform();
       //For right click:
       //ac.contextClick(driver.findElement(By.xpath(""))).perform();
    }

}
