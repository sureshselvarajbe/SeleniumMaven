package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
        WebElement textBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        textBox.sendKeys("Selenium");
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).build().perform();
    }
    @AfterMethod
    public void quitBrowser(){
        driver.close();
        driver.quit();
    }
}
