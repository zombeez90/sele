
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("hello world");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Beez\\code\\sele\\J\\J\\drivers\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\cofre\\OneDrive - kingland.com\\Documents\\DOC\\py\\sele\\J\\J\\drivers\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(co);

        driver.get("https://opensource-demo.orangehrmlive.com/");
       
        
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

      
        
        driver.quit();
      
    }
}
