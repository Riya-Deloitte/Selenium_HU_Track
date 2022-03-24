import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Test4 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\riyasingh6\\browserdriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.goibibo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='header__contInners']//div//ul//li[2]//span[text()='Round-trip']")).click();
        WebElement from=driver.findElement(By.xpath("//span[text()='From']"));
        from.click();
        from.sendKeys("New York");
        WebElement to=driver.findElement(By.xpath("//span[text()='To']"));
        to.click();
        to.sendKeys("Seattle");
        driver.findElement(By.xpath("//span[text()='Departure']")).click();
        WebElement nextmonth=driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
        nextmonth.click();
        nextmonth.click();
        driver.findElement(By.xpath("//div[@aria-label='Fri Jun 24 2022']//p[text()='24']")).click();
        driver.findElement(By.xpath("//span[text()='Return']")).click();
        nextmonth.click();
        driver.findElement(By.xpath("//div[@aria-label='Fri Jul 08 2022']//p[text()='8']")).click();
        driver.findElement(By.xpath("//span[text()='Done']")).click();
        driver.findElement(By.xpath("//span[text()='Done']")).click();
        driver.findElement(By.xpath("//span[text()='Search for Flights']")).click();
        driver.findElement(By.xpath("//div[@class='srp-card-uistyles__BookBtWrap-sc-3flq99-20 dOIIDo flexCol width100']//button[text()='BOOK'].")).click();
    }

}
