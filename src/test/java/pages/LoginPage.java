package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    //Locators
    private By emailAdressLocator = By.name("email");
    private By passWordLocator = By.name("password");
    private By submitBtnLocator = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
    private By classMyAccountLocator = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a > b");


    public void signin() {
        if (super.isDisplayed(emailAdressLocator)) {
            super.type("eduardo0001@gmail.com", emailAdressLocator);
            super.type("12345678", passWordLocator);
            super.click(submitBtnLocator);

        } else {
            System.out.println("email textBox was not present");

        }
    }

    public String getMyAccountMessage() {
        return super.getText(classMyAccountLocator);
    }
}

