package lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginTest extends AbstractTest {

    @FindBy(id = "author")
    private WebElement author;

    String result = new loginTest(getDriver())
            .author.getText();

    public loginTest(WebDriver driver) {

    }

    @Test
    @DisplayName("Тест 2. Проверка входа на сайт.")
    void login() {

        Assertions.assertEquals("GB", result);
    }
}
