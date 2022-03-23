package sampleApp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\riyasingh6\\browserdriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        openUrl(driver);
        TitleCheck(driver);
        Login(driver);
        PrintUrl(driver);
        BackAndRefresh(driver);
    }

    public static void openUrl(ChromeDriver driver) {
        driver.get("http://www.google.com");
        driver.get("https://phptravels.com/demo ");
        driver.manage().window().maximize();

    }

    public static void TitleCheck(ChromeDriver driver) {
        if (driver.getPageSource().contains("PHPTRAVELS")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public static void Login(ChromeDriver driver) {
        driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL +"t");
        driver.get("https://www.phptravels.net/login");
        System.out.println("Page title is : " + driver.getTitle());
        driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL +"\t");
        System.out.println("Page title is : " + driver.getTitle());
        if (driver.getPageSource().contains("PHPTRAVELS")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

    }

    public static void PrintUrl(ChromeDriver driver) {
        driver.navigate().back();
        String strUrl = driver.getCurrentUrl();
        System.out.println("Current Url is:" + strUrl);
    }

    public static void BackAndRefresh(ChromeDriver driver) {
        /*driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL +"t");
        driver.get("https://www.phptravels.net/login");*/
        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();
    }
}
