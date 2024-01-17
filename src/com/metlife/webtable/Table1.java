package com.metlife.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Table1
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
     //Display all records of table:
       /*List<WebElement> element= driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td"));
       int elementSize=element.size();
       for (int i=0;i<elementSize;i++)
       {
          String str=element.get(i).getText();
           System.out.println(str);
       }*/
        //Display only name and salary from first row of table:
       WebElement elementName=driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td[2]"));
       WebElement elementSalary=driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td[6]"));
        System.out.println(elementName.getText());
        System.out.println(elementSalary.getText());
    }
}
