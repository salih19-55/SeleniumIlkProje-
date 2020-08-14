package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenov\\OneDrive\\Documentos\\selenium dependencies\\drives\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amazon.com");
// contains -> bir kelimenin, bir yazı içerisinde geçip geçmediğini kontrol ediyordu.
        String amazonTitle = driver.getTitle(); // Car
        if( amazonTitle.contains("Car") ){
            System.out.println("Car kelimesini içeriyor.");
        }else{
            System.out.println("Car kelimesini İÇERMİYOR.");
        }
      driver.quit();

    }

}
