package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Owner("Alex Schwarz")
@Epic("Checkout")
@Feature("User Checkout Functionality")
@Severity(SeverityLevel.CRITICAL)


public class CheckoutTest extends BaseTest {

	@Story("Correct Checkout")
	@Description("User successfully completes the checkout process")
	@Test(description = "User successfully completes the checkout process")
	public void checkout1() {
		productsPage.addToCart("Sauce Labs Bike Light");
		productsPage.goToCart();
		yourCartPage.verifyProductName();
		yourCartPage.checkout();
		checkInformationPage.fillform("Alex", "Schwarz", "Tel Aviv 727272");

	}

	@Story("Test fill form with wrong login")
	@Description("User cannot proceed with checkout without providing a FirstName,LastName, Zip")
	@Test(description = "FillForm Test", dataProvider = "getData")
	public void tc02_fillform(String firstName, String lastName, String zip, String expected) {
		productsPage.chooseProduct("Sauce Labs Bike Light");
		productsPage.goToCart();
		yourCartPage.checkout();
		checkInformationPage.fillform(firstName, lastName, zip);
		String actual = checkInformationPage.getErrotMsg();
		Assert.assertEquals(actual, expected);

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = { { "", "Schwarz", "Tel Aviv", "Error: First Name is required" },
				{ "Alex", "", "Tel Aviv", "Error: Last Name is required" },
				{ "Alex", "Schwarz", "", "Error: Postal Code is required" },
				{ "standart_user", "34374637", "", "dfdfdfd" }, { "standart_user", "fdfdf", "72727", "" },

		};
		return data;

	}
}