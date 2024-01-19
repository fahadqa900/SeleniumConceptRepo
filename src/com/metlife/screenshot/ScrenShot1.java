package com.metlife.screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScrenShot1
{
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //w3schools for div WebTable:
        driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_grid");
        TakesScreenshot tc=(TakesScreenshot) driver;
        File srcFile=tc.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("./ScreenShots/DemoScreenShot1.PNG"));

    }
}
