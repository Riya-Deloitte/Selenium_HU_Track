package sampleApp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.ArrayList;

import java.util.ArrayList;

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
        String currentHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.switchTo().window(currentHandle);
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
        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();
    }
}
