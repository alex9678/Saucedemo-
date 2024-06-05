package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Owner("Alex Schwarz")
@Epic("Shopping Cart")
@Feature("Remove Product from Cart")
@Severity(SeverityLevel.NORMAL)

public class RemoveTest extends BaseTest {

	@Test(description = "Remove Product Sauce Labs Bike Light from cart test.")
	public void tc01_remove1() {
		int before = productsPage.getItemsInCart();
		productsPage.addToCart("Sauce Labs Bike Light");
		int actual = productsPage.getItemsInCart();
		productsPage.remove("Sauce Labs Bike Light");
		Assert.assertEquals(actual, before + 1);

	}

	@Test(description = "Remove Product Sauce Labs Fleece Jacket from cart test.")
	public void tc02_remove2() {
		int before = productsPage.getItemsInCart();
		productsPage.addToCart("Sauce Labs Fleece Jacket");
		int actual = productsPage.getItemsInCart();
		productsPage.remove("Sauce Labs Fleece Jacket");
		Assert.assertEquals(actual, before + 1);

	}

	@Test(description = "Remove Product  Test.allTheThings() T-Shirt (Red) from cart test.")
	public void tc03_remove3() {
		int before = productsPage.getItemsInCart();
		productsPage.addToCart("Test.allTheThings() T-Shirt (Red)");
		int actual = productsPage.getItemsInCart();
		productsPage.remove("Test.allTheThings() T-Shirt (Red)");
		Assert.assertEquals(actual, before + 1);
	}

	@Test(description = "Remove Product  Sauce Labs Backpack from cart test.")
	public void tc04_remove4() {
		int before = productsPage.getItemsInCart();
		productsPage.addToCart("Sauce Labs Backpack");
		int actual = productsPage.getItemsInCart();
		productsPage.remove("Sauce Labs Backpack");
		Assert.assertEquals(actual, before + 1);
	}

	@Test(description = "Remove Product  Sauce Labs Bolt T-Shirt from cart test.")
	public void tc05_remove5() {
		int before = productsPage.getItemsInCart();
		productsPage.addToCart("Sauce Labs Bolt T-Shirt");
		int actual = productsPage.getItemsInCart();
		productsPage.remove("Sauce Labs Bolt T-Shirt");
		Assert.assertEquals(actual, before + 1);

	}

	@Test(description = "Remove Product  Sauce Labs Onesie from cart test.")
	public void tc06_remove6() {
		int before = productsPage.getItemsInCart();
		productsPage.addToCart("Sauce Labs Onesie");
		int actual = productsPage.getItemsInCart();
		productsPage.remove("Sauce Labs Onesie");
		Assert.assertEquals(actual, before + 1);

	}

}
