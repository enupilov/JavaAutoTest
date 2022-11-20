package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class test2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://diary.anek.ws");

        WebElement emailInputField = driver.findElement(By.id("Nik"));
        WebElement passwordInputField = driver.findElement(By.id("Password"));
        WebElement loginButton = driver.findElement(By.id("login_subm"));

        emailInputField.click();
        emailInputField.sendKeys("GB");

        passwordInputField.click();
        passwordInputField.sendKeys("test");

        loginButton.click();

        driver.findElement(By.id("DiText")).click();
        driver.findElement(By.id("DiText")).sendKeys("Новая запись");

        driver.findElement(By.id("btn_save")).click();

        driver.findElement(By.linkText("Править")).click();

        driver.findElement(By.id("DiText")).click();
        driver.findElement(By.id("DiText")).sendKeys(" 2");

        driver.findElement(By.id("btn_save")).click();

        driver.findElement(By.linkText("Выйти")).click();

        //driver.quit();
    }
}
