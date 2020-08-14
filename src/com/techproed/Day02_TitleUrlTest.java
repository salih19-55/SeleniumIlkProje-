package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenov\\OneDrive\\Documentos\\selenium dependencies\\drives\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");
        String titleGoogle = driver.getTitle();
        System.out.println(titleGoogle);

        if( titleGoogle.contains("Video") ){
            System.out.println("video kelimesini içeriyor.");
        }else{
            System.out.println("video kelimesini İÇERMİYOR.");
        }
        driver.quit();
    }
}
