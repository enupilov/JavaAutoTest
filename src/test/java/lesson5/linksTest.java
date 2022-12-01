package lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class linksTest extends AbstractTest{
    @Test
    void links(){
        Actions linksCheck = new Actions(getDriver());

        linksCheck
                .click(getDriver().findElement(By.linkText("Главная")))
                .click(getDriver().findElement(By.linkText("Все записи")))
                .click(getDriver().findElement(By.linkText("Календарь")))
                .click(getDriver().findElement(By.linkText("Галерея")))
                .click(getDriver().findElement(By.linkText("Настройки")))
                .click(getDriver().findElement(By.linkText("Экспорт")))
                .click(getDriver().findElement(By.linkText("ЧаВо")))
                .click(getDriver().findElement(By.linkText("Отзывы")))
                .click(getDriver().findElement(By.linkText("Введение")))
                .click(getDriver().findElement(By.linkText("Опрос")))
                .build()
                .perform();
        Assertions.assertEquals("Опрос", getDriver().findElement(By.linkText("Опрос")).getText());

    }
}
