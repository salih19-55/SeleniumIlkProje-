package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_locatorsTagName {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenov\\OneDrive\\Documentos\\selenium dependencies\\drives\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");


        //id,name,className,LiknText,partialLinkText,TagName

        WebElement homeLinki = driver.findElement(By.tagName("a"));
        System.out.println(homeLinki.getText());



    }
}
