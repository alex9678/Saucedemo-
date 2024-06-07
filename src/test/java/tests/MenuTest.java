package tests;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Owner("Alex Schwarz")
@Epic("Menu")
@Severity(SeverityLevel.CRITICAL)

public class MenuTest extends BaseTest {

	@Feature("Navigation")
	@Story("Navigate from cart to All Items")
	@Description("Verify navitating from Cart to All Items")
	@Test(description = "Cleaning Cart Button Test")
	public void tc01_menutest() {
		productsPage.chooseProduct("Sauce Labs Bike Light");
		itemPage.addToCart();
		itemPage.resetAppState();
		itemPage.backMenu();

	}

	@Story("Reset App State test")
	@Description("remove all products from cart test")
	@Test(description = "ResetApp test")
	public void tc02_menutest2() {
		productsPage.addToCart("Sauce Labs Bike Light");
		productsPage.resetAppState();
		productsPage.addToCart("Sauce Labs Backpack");
		productsPage.resetAppState();

	}

	@Feature("Navigation")
	@Story("Logout from YourCartPage")
	@Description("Verify logout functionality from YourCartPage")
	@Test(description = "Back To HomePage Button Test")
	public void tc03_menutest3() {
		productsPage.addToCart("Sauce Labs Fleece Jacket");
		productsPage.goToCart();
		yourCartPage.resetAppState();
		yourCartPage.backMenu();
		productsPage.logout();

	}

}
