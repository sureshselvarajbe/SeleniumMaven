package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Launch_Google_WebPage {
    public static WebDriver driver;
    @BeforeMethod
    public void initBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\IdeaProjects\\Selenium\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void launchGoogleSite(){
        driver.get("https://google.com/");
    }
    @AfterMethod
    public void quitBrowser(){
        driver.close();
        driver.quit();
    }
}
