package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {
          /*   1 - ilk önce google.com'a gidiniz.
            // 2 - oradan youtube.com'a gidiniz.
            // 3 - google.com'a back methodu ile geri dönünüz.
            // 4 - youtube.com'a geri giniz.(forward methodu ile)
            // 5 - youtube.com'u yenileyiniz (refresh methodu ile)
               6 - driver'i kapatin.(quit ile)
            */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenov\\OneDrive\\Documentos\\selenium dependencies\\drives\\chromedriver.exe");

        WebDriver WebDriver = new ChromeDriver();

        WebDriver.get("http://google.com");
        WebDriver.navigate().to("http://yotube.com");
        WebDriver.navigate().back();
        WebDriver.navigate().forward();
        WebDriver.navigate().refresh();
        WebDriver.quit();


    }



}
