package lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class searchTest extends AbstractTest{
    @Test
    void search(){
        Actions searchCheck = new Actions(getDriver());

        searchCheck
                .click(getDriver().findElement(By.id("search")))
                .sendKeys("Новая запись")
                .click(getDriver().findElement(By.id("srchbut")))
                .build()
                .perform();
        Assertions.assertEquals("Новая запись", getDriver().findElement(By.className("dt")).getText());
    }
}

