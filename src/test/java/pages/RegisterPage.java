package pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage{
    private By emailAdressLocator = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=email]:nth-child(3)");
    private By nameLocator = By.name("name");
    private By emailLocator = By.id("email");
    private By submitBtnLocator = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > button");
    private By alertAddInfoLocator = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/p[4]/label/span");
    private By NameLocator = By.id("name");
    //Locators YOUR PERSONAL INFORMATION
    private By genderMasculineLocator = By.id("id_gender1");
    private By passwordLocator = By.id("password");
    private By daysLocator = By.id("days");
    private By monthsLocator = By.id("months");
    private By yearsLocator = By.id("years");
    private By newsletterLocator = By.id("newsletter");
    private By receiveOffersLocator = By.id("optin");
    //Locators YOUR ADDRESS
    private By firstNameLocator = By.name("first_name");
    private By lastNameLocator = By.name("last_name");
    private By companyLocator = By.id("company");
    private By address1Locator = By.id("address1");
    private By address2Locator = By.id("address2");
    private By cityLocator = By.id("city");
    private By stateLocator = By.id("state");
    private By postCodeLocator = By.id("zipcode");
    private By countryLocator = By.id("country");
    private By mobilePhoneLocator = By.id("mobile_number");
    private By registerBtnLocator = By.cssSelector("#form > div > div > div > div.login-form > form > button");
    private By welcomeMessageLocator = By.cssSelector("#form > div > div > div > h2 > b");
    public void insertEmailRegister(){

            if(super.isDisplayed(emailAdressLocator)){
                type("Eduardo", nameLocator);
                type("eduardo0004@gmail.com", emailAdressLocator);
                click(submitBtnLocator);
            }else{
                System.out.println("emails textbox as not present");

            }
        }
        public String getEmailNewAccount(){
            super.waitVisibilityOfElementLocated(alertAddInfoLocator);
            return super.getTextByAttribute(this.emailLocator,"value");
        }
        public void fillOutForm(){
        this.insertEmailRegister();
        super.waitVisibilityOfElementLocated(alertAddInfoLocator);
        if(isDisplayed(genderMasculineLocator)){
            super.click(genderMasculineLocator);
            super.type("Eduardo", firstNameLocator);
            super.type("Kainan", lastNameLocator);
            super.type("12345678", passwordLocator);
            selectByValue(daysLocator, "5");
            selectByValue(monthsLocator, "7");
            selectByValue(yearsLocator, "1995");
            click(newsletterLocator);
            click(receiveOffersLocator);
            super.type("Eduardo", firstNameLocator);
            super.type("Kainan", lastNameLocator);
            type("DIO", companyLocator);
            type("Juarez Amorelli", address1Locator);
            type("Buena", address2Locator);
            selectByValue(countryLocator, "United States");
            type("Goias",stateLocator);
            type("Goiânia", cityLocator);
            type("1234",postCodeLocator);
            type("99999999", mobilePhoneLocator);
            click(registerBtnLocator);
            } else {
            System.out.println("message was not found");
        }
        }

        public String getWelcomeMessage(){
            super.waitVisibilityOfElementLocated(welcomeMessageLocator);
            return super.getText(welcomeMessageLocator);
        }
    }

