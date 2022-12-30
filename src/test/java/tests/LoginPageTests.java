package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.BasePage;
import pages.LoginPage;

public class LoginPageTests {
    private LoginPage loginPage;
    private  final String BASE_URL = "https://automationexercise.com/login";

    @BeforeEach
    void setUp() throws Exception {
        this.loginPage = new LoginPage();
        this.loginPage.visit(BASE_URL);
    }

    @AfterEach
    void tearDown() throws Exception {
  //      this.loginPage.quit();
    }

    @Test
    void test() {
        //when
        loginPage.signin();

        //then
        Assertions.assertEquals("Eduardo Kainan Leite Sousa",loginPage.getMyAccountMessage());

    }
}
