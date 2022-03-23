package sampleApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test2 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\riyasingh6\\browserdriver\\chromedriver.exe");

        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Headless");
        driver = new ChromeDriver(options);
        PrintUrl(driver);
    }
    public static void PrintUrl(WebDriver driver) throws InterruptedException {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        driver.navigate().to("https://phptravels.com/demo");
        String Actual = driver.getTitle();
        String Expected = "Demo Script Test drive - PHPTRAVELS";
        if(Actual.equals(Expected)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        driver.navigate().to("https://phptravels.org/login");
        String str1 = driver.getTitle();
        String str2 = "Login";
        if(str1.equals(str2)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        driver.navigate().back();
        String str3 = driver.getTitle();
        String str4 = "Demo Script Test drive - PHPTRAVELS";
        if(str3.equals(str4)) {
            System.out.println("https://phptravels.com/demo");
        } else {
            System.out.println("FAIL");
        }
        driver.findElement(By.linkText("Pricing")).click();
        System.out.println("PASS");

        driver.navigate().back();
        System.out.println("PASS");

        driver.navigate().refresh();
        System.out.println("PASS");

        driver.close();

    }

}


