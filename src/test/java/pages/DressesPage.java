package pages;

import org.openqa.selenium.By;

public class DressesPage extends BasePage {

    //locators

    private By menuDressesLocator = By.cssSelector("#accordian > div:nth-child(1) > div.panel-heading > h4 > a");
    private By subMenuCasualDressesLocator = By.cssSelector("#Women > div > ul > li:nth-child(1) > a");
    private By titlePageCasualDressLocator = By.cssSelector("body > section > div > div.row > div.col-sm-9.padding-right > div > h2");

    public void viewCasualDressesPage(){
        if(super.isDisplayed(menuDressesLocator)){
            super.actionMoveToElementClickPerform(menuDressesLocator);
            super.actionMoveToElementClickPerform(subMenuCasualDressesLocator);

        }else{
            System.out.println("menu dress was not foundd");
        }
    }
    public String getTitlePage(){
        return super.getText(titlePageCasualDressLocator);
    }

}
