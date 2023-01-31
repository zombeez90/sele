import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("hello world");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Beez\\code\\sele\\J\\J\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
      //  driver.wait(5);
        Thread.sleep(5000);;




        driver.close();
    }
}
