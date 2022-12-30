import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;

    @BeforeEach
    void setUp()throws Exception{
        System.getProperty("webdriver.chrome.driver","drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/login");
    }
    @AfterEach
    void tearDown() throws Exception{
   //  driver.quit();
    }


    @Test
    void test() {
        WebElement emailAdressElement = driver.findElement(By.name("email"));
        emailAdressElement.sendKeys("eduardo0001@gmail.com");

        WebElement passWordElement = driver.findElement(By.name("password"));
        passWordElement.sendKeys("12345678");

        WebElement submitBtnElement =  driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
        submitBtnElement.click();

        WebElement featureItens = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/h2"));
        featureItens.getText();

        Assertions.assertEquals("FEATURES ITEMS",featureItens.getText());
    }
}
