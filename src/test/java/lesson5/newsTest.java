package lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class newsTest extends AbstractTest{
    @Test
    void news(){
        getDriver().findElement(By.linkText("Новости")).click();
        Assertions.assertEquals("Новости", getDriver().findElement(By.linkText("Новости")).getText());
    }
}
