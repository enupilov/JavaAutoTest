package lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class searchTest extends AbstractTest {

    @FindBy(id = "search")
    private WebElement search;

    @FindBy(id = "srchbut")
    private WebElement search_button;

    String result = new searchTest(getDriver())
            .getDriver().findElement(By.className("dt")).getText();

    public searchTest(WebDriver driver) {

    }

    @Test
    void search(){
        Actions searchCheck = new Actions(getDriver());

        searchCheck
                .click(search)
                .sendKeys("Новая запись")
                .click(search_button)
                .build()
                .perform();
        Assertions.assertEquals("Новая запись", result);
    }
}

