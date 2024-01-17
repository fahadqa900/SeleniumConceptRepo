package com.metlife.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Table1
{
    public static void main(String[] args)
    {
        //Display values of two particular columns in WebTable:
        //(Here Display all name and salary columns in WebTable:
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(" https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
       //Display all records of table:
       int count=driver.findElement(By.xpath("//table[@id='example']/tbody"))
       .findElements(By.tagName("tr")).size();
        System.out.println(count);
        for(int i=1;i<=count;i++)
        {
         System.out.println(driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[2]")).getText() + "\t" +
         driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[6]")).getText());
        }

       /*Display all rows and columns of WebTable:
       List<WebElement> element= driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td"));
       int elementSize=element.size();
       System.out.println(elementSize);
       for(int i=0;i<elementSize;i++)
       {
       String str=element.get(i).getText();
       System.out.println(str);
       }*/

     /*Display only name and salary from first row of WebTable:
       WebElement elementName=driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td[2]"));
       WebElement elementSalary=driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td[6]"));
       System.out.println(elementName.getText());
       System.out.println(elementSalary.getText());*/
    }
}
