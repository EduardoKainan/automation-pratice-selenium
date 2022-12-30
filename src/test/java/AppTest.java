import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {


    private WebDriver driver;

    @Test
    public void helloseleium(){
    System.getProperty("webdriver.chrome.driver","drivers/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://automationexercise.com/");

        String currentUrls = driver.getCurrentUrl();
        String expected = "https://automationexercise.com/";

    Assertions.assertEquals(expected, currentUrls);

    //driver.quit();
    }
}
