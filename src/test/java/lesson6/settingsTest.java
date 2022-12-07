package lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class settingsTest extends AbstractTest {

    @FindBy(id = "dop")
    private WebElement dop;

    @FindBy(linkText = "Дополнительно")
    private WebElement dop2;

    String result = new settingsTest(getDriver())
            .dop2.getText();

    public settingsTest(WebDriver driver) {

    }

    @Test
    @DisplayName("Тест 6. Проверка дополнительных настроек.")
    void settings(){
        getDriver().findElement(By.id("dop")).click();
        Assertions.assertEquals("Дополнительно", result);
    }
}
