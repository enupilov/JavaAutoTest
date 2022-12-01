package lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class loginTest extends AbstractTest {

    @Test
    void login() {

        Assertions.assertEquals("GB", getDriver().findElement(By.id("author")).getText());
    }
}
