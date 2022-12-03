package lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class linksTest extends AbstractTest {

    @FindBy(linkText = "Главная")
    private WebElement main;

    @FindBy(linkText = "Все записи")
    private WebElement all_notes;

    @FindBy(linkText = "Календарь")
    private WebElement calendar;

    @FindBy(linkText = "Галерея")
    private WebElement gallery;

    @FindBy(linkText = "Настройки")
    private WebElement settings;

    @FindBy(linkText = "Экспорт")
    private WebElement export;

    @FindBy(linkText = "ЧаВо")
    private WebElement qa;

    @FindBy(linkText = "Отзывы")
    private WebElement feedback;

    @FindBy(linkText = "Введение")
    private WebElement intro;

    @FindBy(linkText = "Опрос")
    private WebElement survey;

    String result = new linksTest(getDriver())
            .survey.getText();

    public linksTest(WebDriver driver) {

    }

    @Test
    void links(){
        Actions linksCheck = new Actions(getDriver());

        linksCheck
                .click(main)
                .click(all_notes)
                .click(calendar)
                .click(gallery)
                .click(settings)
                .click(export)
                .click(qa)
                .click(feedback)
                .click(intro)
                .click(survey)
                .build()
                .perform();
        Assertions.assertEquals("Опрос", result);

    }
}
