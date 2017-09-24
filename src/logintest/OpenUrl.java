package logintest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author python27
 */
public class OpenUrl {
    String url1;
    final WebDriver driver;
    // No return type, same name as the class
    public OpenUrl(String url1) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\python27\\Desktop\\selenium java\\chromedriver.exe");
        //System.out.print('"'+url1+'"');
        driver = new ChromeDriver();
        driver.get("http://"+url1);
       
}
    
}
