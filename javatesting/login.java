import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login{
    public static void main(string[] arg){
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://sepatucompass.com/login");
WebElement txtbx_username =driver.findElemet(By.name("email"));
        txtbx_username.sendKeys("testing");
driver.findElement(By.name("password")).sendKeys("testing");
driver.findElement(By.className("btn btn-primary")).click();


    

    }
}