import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\riyasingh6\\browserdriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        draggableanddropable(driver);

    }
    public static void draggableanddropable(ChromeDriver driver){
        driver.get("https://jqueryui.com/droppable/");
        Actions act = new Actions(driver);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        act.dragAndDropBy(driver.findElement(By.xpath("//div[@id='draggable']")),163,26 ).perform();
    }

}
