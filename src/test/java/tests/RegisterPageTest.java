package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.RegisterPage;

public class RegisterPageTest {
    private RegisterPage registePage;
    String URL = "https://automationexercise.com/login";



    @BeforeEach
    void setUp() {
        this.registePage = new RegisterPage();
        this.registePage.visit(URL);
    }
    @AfterEach
    void tearDown() {
    //    this.registePage.quit();
    }
    @Test
    void test2() {
        //when
        this.registePage.fillOutForm();
        //then
        String expected = "ACCOUNT CREATED!";
        String actual = this.registePage.getWelcomeMessage();
        Assertions.assertEquals(expected,actual);

        String actualUrl = this.registePage.getCurrentUrl();
        Assertions.assertFalse(this.URL.equals(actualUrl));
    }
}
