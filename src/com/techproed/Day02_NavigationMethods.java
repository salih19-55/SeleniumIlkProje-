package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {

    public static void main(String[] args) {

        ////Java projemize,chromedriver'i tanittik.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenov\\OneDrive\\Documentos\\selenium dependencies\\drives\\chromedriver.exe");

        //selenium ile ilgili ilk kodumuz.
        // webDriver nesnesi olusturarak,chrome driven kullanabilir hale getirdik.

        WebDriver WebDriver = new ChromeDriver();

        WebDriver.manage().window().maximize();

        // driver'a google.com'a gitmesini söyledik.
        WebDriver.get("http://google.com");

         // get methodu ile aynı işlemi yapıyor
        WebDriver.navigate().to("http://amazon.com");

        // navigate().back() methodu bir önceki sayfaya geri dönmeye yarıyor.
        WebDriver.navigate().back();

        // navigate().forward() methodu geri geldiğimiz sayfaya gitmemizi sağlıyor
        // örnek : google -> amazona gittik -> amazondan google'a geri geldik
        // eğer forward yaparsak, amazona geri gideriz.
        WebDriver.navigate().forward();

       // navigate().refresh() methodu sayfayı yenilemeye yarıyor.
        WebDriver.navigate().refresh();









  }
}
