import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\riyasingh6\\browserdriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.linkText("jsPromp()")).click();
        Alert prompalert = driver.switchTo().alert();
        System.out.println(prompalert.getText());
        prompalert.sendKeys("ready");
        prompalert.accept();
        System.out.println(driver.findElement(By.id("result")).getText());
    }
}
