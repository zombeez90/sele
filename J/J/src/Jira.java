import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jira 
{
        public static void main(String[] args) throws Exception 
        {
            
            System.out.println("hello world");
    
            //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Beez\\code\\sele\\J\\J\\drivers\\chromedriver.exe");
            //System.setProperty("webdriver.chrome.driver", "C:\\Users\\cofre\\OneDrive - kingland.com\\Documents\\DOC\\py\\sele\\J\\J\\drivers\\chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
    
    
            WebDriver driver = new ChromeDriver();
    
            driver.get("https://confluence.kingland-apps.com/x/YrfiHg/");
            Thread.sleep(15000);

            


        }
}
