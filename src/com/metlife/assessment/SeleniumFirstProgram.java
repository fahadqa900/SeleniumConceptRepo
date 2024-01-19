package com.metlife.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumFirstProgram
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mockexam1cpsat.agiletestingalliance.org/");
        //Clicking on hamberger menu and print all items under menu on console:
        driver.findElement(By.xpath("//li[@class='slideout-toggle menu-item-align-right ']/a")).click();
        List<WebElement> element=driver.findElements(By.tagName("a"));
        int elemenSize=element.size();
        for(int i=0;i<elemenSize;i++)
        {
            System.out.println(element.get(i).getText());
        }

 //Getting all social media Urls
WebElement ele1=driver.findElement(By.xpath("//ul[@class='lsi-social-icons icon-set-lsi_widget-1']/li[1]/a"));
System.out.println(ele1.getAttribute("href"));

 WebElement ele2=driver.findElement(By.xpath("//ul[@class='lsi-social-icons icon-set-lsi_widget-1']/li[2]/a"));
 System.out.println(ele2.getAttribute("href"));

 WebElement ele3=driver.findElement(By.xpath("//ul[@class='lsi-social-icons icon-set-lsi_widget-1']/li[3]/a"));
 System.out.println(ele3.getAttribute("href"));

 WebElement ele4=driver.findElement(By.xpath("//ul[@class='lsi-social-icons icon-set-lsi_widget-1']/li[4]/a"));
 System.out.println(ele4.getAttribute("href"));
    }
}
