package lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class notesTest extends AbstractTest {

    @FindBy(id = "DiText")
    private WebElement diary;

    @FindBy(id = "btn_save")
    private WebElement save;

    @FindBy(linkText = "Править")
    private WebElement edit;

    String result = new notesTest(getDriver())
            .getDriver().findElement(By.xpath("//*[@id=\"DiText\"]")).getText();

    public notesTest(WebDriver driver) {

    }

    @Test
    void notes() {
        Actions notesCheck = new Actions(getDriver());

        notesCheck
                .click(diary)
                .sendKeys("Новая запись")
                .click(save)
                .click(edit)
                .click(diary)
                .sendKeys(" 2")
                .click(save)
                .build()
                .perform();
        Assertions.assertEquals("Новая запись 2", result);
    }
}
