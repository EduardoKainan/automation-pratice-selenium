package tests;

import org.junit.jupiter.api.*;
import pages.DressesPage;

public class DressesPageTest {

    private DressesPage dressesPage;
    private final String URL = "https://automationexercise.com/";

    @BeforeEach
     void setUp() throws Exception {
        this.dressesPage = new DressesPage();
        this.dressesPage.visit(URL);
        
    }

    @AfterEach
     void tearDrown() {
    //    this.dressesPage.quit();
    }

    @Test
    void test() {
        //when
        this.dressesPage.viewCasualDressesPage();
        //then
        Assertions.assertEquals("WOMEN - DRESS PRODUCTS",this.dressesPage.getTitlePage());
        Assertions.assertFalse(this.URL.equals(dressesPage.getCurrentUrl()));
    }
}
