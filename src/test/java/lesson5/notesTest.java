package lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class notesTest extends AbstractTest{
    @Test
    void notes() {
        Actions notesCheck = new Actions(getDriver());

        notesCheck
                .click(getDriver().findElement(By.id("DiText")))
                .sendKeys("Новая запись")
                .click(getDriver().findElement(By.id("btn_save")))
                .click(getDriver().findElement(By.linkText("Править")))
                .click(getDriver().findElement(By.id("DiText")))
                .sendKeys(" 2")
                .click(getDriver().findElement(By.id("btn_save")))
                .build()
                .perform();
        Assertions.assertEquals("Новая запись 2", getDriver().findElement(By.xpath("//*[@id=\"DiText\"]")).getText());
    }
}
