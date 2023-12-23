package automation.simple;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class SeleniumTest {
    WebDriver driver;
@Test
    public void loginTest () {
        WebDriverManager.firefoxdriver();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://yopmail.com");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));

    driver.findElement(By.id("login")).sendKeys("automationtest");
    driver.findElement(By.xpath("//i[@class='material-icons-outlined f36']")).click();
    driver.findElement(By.xpath("//button[@id='refresh']")).click();
    driver.switchTo().frame("ifmail");

    WebElement option = driver.findElement(By.xpath("//div[@class='ellipsis nw b f18']"));
    WebElement option2 = driver.findElement(By.xpath("//span[@class='ellipsis b']"));
    WebElement option3 = driver.findElement(By.xpath("//span[@class='ellipsis']"));
    WebElement option4 = driver.findElement(By.xpath("//strong[.='Thanks for connecting!']"));
    WebElement option5 = driver.findElement(By.xpath("//p[.='Brick&Bolt works relentlessly to make your construction safe & enjoyable.']"));
//    WebElement option6 = driver.findElement(By.xpath("//span[.='Your service request number is CRN298775']"));
    WebElement option7 = driver.findElement(By.xpath("//span[contains(.,'Our representative will get in touch with you within 24 hours to understand your')]"));
    String text1 = option.getText();
    String text2 = option2.getText();
    String text3 = option3.getText();
    String text4 = option4.getText();
    String text5 = option5.getText();
//    String text6 = option6.getText();
    String text7 = option7.getText();
    System.out.println(text1);
    System.out.println(text2);
    System.out.println(text3);
    System.out.println(text4);
    System.out.println(text5);
//    System.out.println(text6);
    System.out.println(text7);
    

    }
}

