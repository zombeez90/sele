import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("hello world");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Beez\\code\\sele\\J\\J\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
      //  driver.wait(5);
        Thread.sleep(5000);

        
        WebElement username = driver.findElement(By.cssSelector("[name = 'username']"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.cssSelector("[name = 'password']"));
        password.sendKeys("admin123");

        WebElement login = driver.findElement(By.cssSelector("[type = 'submit']"));
        login.click();
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        username.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        password.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        Thread.sleep(1000);

        WebElement forgot = driver.findElement(By.cssSelector("[class = 'oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        forgot.click();
        Thread.sleep(3000);


        driver.close();
      
    }
}
