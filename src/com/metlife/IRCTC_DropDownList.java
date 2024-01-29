package com.metlife;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class IRCTC_DropDownList
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//div[@role='button']")).click();
        List<WebElement> lst=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
        int count=lst.size();
        System.out.println(count);
        for(int i=0;i<count;i++)
        {
            String str=lst.get(i).getText();
            if(str.equalsIgnoreCase("Anubhuti Class (EA)"))
            {
                lst.get(i).click();
                break;
            }
        }
    }
}
