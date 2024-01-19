package com.metlife.screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Windows2
{
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //w3schools for div WebTable:
        driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_grid");
        TakesScreenshot tc=(TakesScreenshot)driver;
        File srcFile=tc.getScreenshotAs(OutputType.FILE);
        srcFile=driver.findElement(By.tagName("html")).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(srcFile,new File("./ScreenShots/Screen2.PNG"));

    }
}
