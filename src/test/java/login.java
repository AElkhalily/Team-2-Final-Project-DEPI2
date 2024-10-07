import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class login {
    ChromeDriver driver;
    @BeforeMethod
    void openBrowser()
    {driver = new ChromeDriver();
       driver.navigate().to("https://www.saucedemo.com/");
    }


    @Test
    void TC_A()
    {
        WebElement userloc1 = driver.findElement(By.id("user-name"));
        userloc1.sendKeys("standard_user");
        WebElement passlog1 = driver.findElement(By.id("password"));
        passlog1.sendKeys("secret_sauce");
        WebElement loginbttn1 = driver.findElement(By.id("login-button"));
        loginbttn1.click();




    }


    @Test
    void TC_B()
    {
        WebElement userloc = driver.findElement(By.id("user-name"));
        userloc.sendKeys("standard_user");
        WebElement passlog = driver.findElement(By.id("password"));
        passlog.sendKeys("secret_sauc112e");
        WebElement loginbttn = driver.findElement(By.id("login-button"));
        loginbttn.click();

    }

    @AfterMethod
    void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
