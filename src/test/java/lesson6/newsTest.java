package lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class newsTest extends AbstractTest {

    @FindBy(linkText = "Новости")
    private WebElement news;

    String result = new newsTest(getDriver())
            .news.getText();

    public newsTest(WebDriver driver) {

    }
    @Test
    @DisplayName("Тест 3. Проверка новостной ленты.")
    void news(){
        news.click();
        Assertions.assertEquals("Новости", result);
    }
}
