package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    private final WebDriver driver;
    private Actions action;
    private WebDriverWait wait;
    private Select select;

    public BasePage() {
        System.getProperty("webdriver.chrome.driver","drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void visit(String url) {
        this.driver.get(url);
    }

    public String getCurrentUrl() {
        return this.driver.getCurrentUrl();
    }

    public void quit() {
        this.driver.quit();
    }

    public WebElement findElement(By locator) {
        return this.driver.findElement(locator);
    }

    public void type(String input, By locator) {
        this.driver.findElement(locator).sendKeys(input);
    }

    public Boolean isDisplayed(By locator) {
        try {
            return this.driver.findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void click(By locator) {
        this.driver.findElement(locator).click();
    }

    public String getText(By locator) {
        return this.driver.findElement(locator).getText();
    }

    public void actionMoveToElementPerform(By locator) {
        if (this.action == null) {
            this.action = new Actions(this.driver);
        }
        WebElement element = this.driver.findElement(locator);
        action.moveToElement(element);
    }

    public void actionMoveToElementClickPerform(By locator) {
        if (this.action == null) {
            this.action = new Actions(this.driver);
        }
        WebElement element = this.driver.findElement(locator);
        action.moveToElement(element).click().build().perform();
    }

    public String getTextByAttribute(By locator, String atributeName) {
        return this.driver.findElement(locator).getAttribute(atributeName);
    }

    public WebElement waitVisibilityOfElementLocated(By locator, Duration time) {
        wait = new WebDriverWait(driver, time);
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void waitVisibilityOfElementLocated(By locator) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));

    }
    public void selectByValue(By locator, String value){
        select = new Select(findElement(locator));
        select.selectByValue(value);
    }


    public void clear (By locator){
        findElement(locator).clear();
    }


}