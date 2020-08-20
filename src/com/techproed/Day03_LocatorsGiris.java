package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {

    public static void main(String[] args) {


        // Java projemize, chromedriver'ı tanıttık.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenov\\OneDrive\\Documentos\\selenium dependencies\\drives\\chromedriver.exe");
        WebDriver WebDriver = new ChromeDriver();
        WebDriver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        WebDriver.manage().window().maximize();
        WebDriver.get("http://a.testaddressbook.com/");
        // ilk webelementimizi buluyoruz.
        // "Hamza" -> String
        // Web sayfasındaki tüm elamanlar -> WebElement
        // webelementimizi id kullanarak bulduk.
        WebElement signInLink = WebDriver.findElement(By.id("sign-in"));
        // webelementimize tıkladık.
        signInLink.click();
        //email kutusunu bulalım.
        WebElement emailKutusu = WebDriver.findElement(By.id("session_email"));
        // emailKutusu'nun içerisine yazı gönderiyoruz
        emailKutusu.sendKeys("testtechproed@gmail.com");
        //sifre kutusunu buluyor.
        WebElement sifreKutusu = WebDriver.findElement(By.id("session_password"));
        // sifreKutusu'nun içerisine yazı gönderiyoruz
        sifreKutusu.sendKeys("Test1234!");
        // sign in butonunu buluyoruz. // name="commit"
        WebElement signInButonu = WebDriver.findElement(By.name("commit"));
        signInButonu.click();
        String baslik = WebDriver.getTitle();
        if (baslik.equals("Address Book")){
            System.out.println("Giriş Başarılı.");
        }else {
            System.out.println("Giriş Başarısız.");
        }








    }
}
