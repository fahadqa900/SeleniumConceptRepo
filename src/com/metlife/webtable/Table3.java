package com.metlife.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Table3
{
    public static void main(String[] args)
    {
        //https://www.icc-cricket.com/rankings/batting/mens/t20i(For div WebTable):
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //w3schools for div WebTable:
        driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_grid");
        driver.switchTo().frame("iframeResult");
       //WebElement element= driver.findElement(By.xpath("//div[@class='grid-container']/div[3]"));
        List<WebElement> cells= driver.findElements(By.xpath("//div[@class='grid-container']/div"));
        for (int i=0;i<cells.size();i=i+3)
        {
         System.out.println(cells.get(i).getText()+"\t"+cells.get(i+2).getText());
        }
        driver.switchTo().defaultContent();
    }
}