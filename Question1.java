package Task17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.snapdeal.com/");
        WebElement signInButton = driver.findElement(By.xpath("//span[contains(@class,'accountUserName')] "));
        signInButton.click();
        WebElement login = driver.findElement(By.xpath("//a[text()='Your Account']"));
        login.click();
        Thread.sleep(2000);
        driver.findElement(By.id("userName")).sendKeys("yaminiraghavan@gmail.com");
        driver.findElement(By.id("checkUser")).click();

     // After that the application is asking for the OTP to login.

    }
}
