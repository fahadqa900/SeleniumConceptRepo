package com.metlife.assessment;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class SeleniumSecondProgram
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        //Maximizing the browser:
        driver.manage().window().maximize();
        //Apply implicit wait of 30 mili seconds:
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Launch browser Url:
        driver.get("https://mockexam1cpsat.agiletestingalliance.org/");
        //Clicking on hamberger menu:
        driver.findElement(By.xpath("//li[@class='slideout-toggle menu-item-align-right ']")).click();
        //Clicking on Challenge1:
        driver.findElement(By.linkText("Challenge 1")).click();
        //Taking total number of accordian tabs in list of web elements:
        List<WebElement> lw1 = driver.findElements(By.xpath("//div[@class='eael-accordion-list']"));
        //Printing size of total number of accordian tabs:
        System.out.println("Total number of Tabs: "+lw1.size());
        Date d = new Date();
        for(int i=1;i<=lw1.size();i++)
        {
        String s1= d.toString().replace(":", "_").replace(" ", "_") +i+ ".png";
        //Background color before clicking by using getCSSValue() method:
        System.out.println("Background color before clicking "+i+"tab"+" \t "  +driver.findElement(By.xpath("(//div[@class='eael-accordion-list'])["+i+"]")).getCssValue("color"));
        //Clicking on all tabs:
        driver.findElement(By.xpath("(//div[@class='eael-accordion-list'])["+i+"]")).click();
        //Background color after clicking on all tabs:
        System.out.println("Background color after clicking " +driver.findElement(By.xpath("(//div[@class='eael-accordion-list'])["+i+"]")).getCssValue("color"));
        //Applying static wait of 5 mili seconds:
        Thread.sleep(5000);
        //Storing text in str1 variable:
        String str1=driver.findElement(By.xpath("(//div[@class='eael-accordion-content clearfix'])["+i+"]")).getText();
        //Printing text under all tabs:
        System.out.println(str1);
        //Taking screenshots in for loop:
        File file1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file1,new File("./ScreenShots.png"+s1));
        }
        //Launching browser Url:
        driver.get("https://mockexam1cpsat.agiletestingalliance.org/index.php/challenge-2/");
        //Finding all speakers elements and storing into lSpeaker variable of type List
        //of webelements:
        List<WebElement> lSpeaker = driver.findElements(By.xpath("//h6[@class='elementor-heading-title elementor-size-default']"));
        //Printing size of all speaker elements:
        System.out.println("Number of Speakers: "+lSpeaker.size());
        //Printing all speaker elements:
        for(int i=0;i<lSpeaker.size();i++)
        {
        System.out.println("Speaker Name is "+i +driver.findElement(By.xpath("(//h6[@class='elementor-heading-title elementor-size-default'])[" + i + "]")).getText());
        }
    }
}