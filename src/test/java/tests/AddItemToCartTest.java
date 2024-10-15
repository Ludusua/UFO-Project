package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.HomePage;

public class AddItemToCartTest extends BaseTest {
    @Test
    public void orderNowButtonValidTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.clickOrderNowButton();
        Thread.sleep(5000);
        Assertions.assertTrue(homePage.addToCartButtonModalIsDisplayed());
        Assertions.assertTrue(homePage.closeButtonModalIsDisplayed());
        Assertions.assertTrue(homePage.imageModalIsDisplayed());
    }

}
