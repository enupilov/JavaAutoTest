package lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {
    private static WebDriver driver;

    @BeforeAll
    static void init(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://diary.anek.ws");

    }

    @BeforeEach
    void goTo(){
        Actions login = new Actions(getDriver());

        login
                .click(getDriver().findElement(By.id("Nik")))
                .sendKeys("GB")
                .click(getDriver().findElement(By.id("Password")))
                .sendKeys("test")
                .click(getDriver().findElement(By.id("login_subm")))
                .build()
                .perform();
    }

    @AfterEach
    void logout(){
        getDriver().findElement(By.linkText("Выйти")).click();
    }

    @AfterAll
    static void close(){
        //driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}

