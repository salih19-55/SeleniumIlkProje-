package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {
        //Java projemize,chromedriver'i tanittik.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenov\\OneDrive\\Documentos\\selenium dependencies\\drives\\chromedriver.exe");

       //selenium ile ilgili ilk kodumuz.
       // webDriver nesnesi olusturarak,chrome driven kullanabilir hale getirdik.

        WebDriver WebDriver = new ChromeDriver();

        //driver'imiza google.com'a gitmesini soyledik.
        WebDriver.get("http://google.com");
       // driverimizda acik olan pencereyi kapatir.
        // WebDriver.close();

       // acik olan dirver'i tum pencereleri ile birlikte kapatiyor
        WebDriver.quit();




    }

}
