package lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class settingsTest extends AbstractTest{
    @Test
    void settings(){
        getDriver().findElement(By.id("dop")).click();
        Assertions.assertEquals("Дополнительно", getDriver().findElement(By.linkText("Дополнительно")).getText());
    }
}
