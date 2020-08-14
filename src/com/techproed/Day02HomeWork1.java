package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02HomeWork1 {
   /*
   1. Yeni bir class oluşturun :Homework
   2. ChromeDriver'ı kullanarak facebook'a gidin ve sayfa başlığının(Page Title) "facebook" olup olmadığını doğrulayın, Değilse, doğru başlığı(Actual title) yazdırın.
   3. Sayfa URL'sinin facebook içerip içermediğini(contains), Değilse doğru URL'yi(Actual url) yazdırın.
   4. Ardından Navigate to https://www.walmart.com/
   5. Walmart sayfa başlığının "Walmart.com" içerip içermediğini(contains) doğrulayın
   6. Navigate back to facebook
   7. Sayfayı yenileyin(refresh)
   8. Maximize the window
   9. Close the browse


    */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenov\\OneDrive\\Documentos\\selenium dependencies\\drives\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://facebook.com");
        String titleFacebook = driver.getTitle();
        System.out.println(titleFacebook);

        if( titleFacebook.contains("facebook") ){
            System.out.println("facebook kelimesini içeriyor.");
        }else{
            System.out.println("facebook kelimesini İÇERMİYOR.");
        }

      driver.navigate().to("https://walmart.com");
      driver.navigate().back();
      driver.navigate().refresh();
      driver.manage().window().maximize();
      driver.quit();



    }
}
