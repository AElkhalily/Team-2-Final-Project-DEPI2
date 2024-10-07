package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    ChromeDriver driver;
    @BeforeMethod
    void openBrowser()
    {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");


    }

    @Test
    void TC_1()
    {
        WebElement log = driver.findElement(By.id("APjFqb"));
        log.sendKeys("Hello");
    }
}