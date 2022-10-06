import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Register {
    public static void main(string[] arg){
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://sepatucompass.com/login");
        driver.findElement(By.id("btn btn-login")).click();
        WebElement txtbx_username =driver.findElemet(By.name("name"));
        txtbx_username.sendKeys("testing");
        driver.findElement(By.name("email")).sendKeys("testing@gmail.com");
        driver.findElement(By.name("mobileNumber")).sendKeys("081231414");
        driver.findElement(By.name("password")).sendKeys("Testing22");
        driver.findElement(By.id("btn btn-primary")).click();
    }
    
}
