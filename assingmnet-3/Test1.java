import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\riyasingh6\\browserdriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
        driver.get("https://the-internet.herokuapp.com/frames");
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        String title = driver.getTitle();
        System.out.println(title);

    }

}
