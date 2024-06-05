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
@Feature("Add To Cart Through Product Page")
@Severity(SeverityLevel.NORMAL)

public class ProductsTest extends BaseTest {

	@Test(description = "Add Product Sauce Labs Bike Light to cart test.")
	public void tc01_addProduct1() {
		int before = productsPage.getItemsInCart();
		productsPage.addToCart("Sauce Labs Bike Light");
		int actual = productsPage.getItemsInCart();
		Assert.assertEquals(actual, before + 1);

	}

	@Test(description = "Add Product Sauce Labs Fleece Jacket to cart test.")
	public void tc02_addPoduct2() {
		int before = productsPage.getItemsInCart();
		productsPage.addToCart("Sauce Labs Fleece Jacket");
		int actual = productsPage.getItemsInCart();
		Assert.assertEquals(actual, before + 1);
	}

	@Test(description = "Add Product Test.allTheThings() T-Shirt (Red) to cart test.")
	public void tc03_addProduct3() {
		int before = productsPage.getItemsInCart();
		productsPage.addToCart("Test.allTheThings() T-Shirt (Red)");
		int actual = productsPage.getItemsInCart();
		Assert.assertEquals(actual, before + 1);
	}

	@Test(description = "Add Product Sauce Labs Backpack to cart test.")
	public void tc04_addProduct4() {
		int before = productsPage.getItemsInCart();
		productsPage.addToCart("Sauce Labs Backpack");
		int actual = productsPage.getItemsInCart();
		Assert.assertEquals(actual, before + 1);

	}

	@Test(description = "Add Product Sauce Labs Bolt T-Shirt to cart test.")
	public void tc05_addProduct5() {
		int before = productsPage.getItemsInCart();
		productsPage.addToCart("Sauce Labs Bolt T-Shirt");
		int actual = productsPage.getItemsInCart();
		Assert.assertEquals(actual, before + 1);
	}

	@Test(description = "Add Product Sauce Labs Onesie to cart test.")
	public void tc06_addProduct6() {
		int before = productsPage.getItemsInCart();
		productsPage.addToCart("Sauce Labs Onesie");
		int actual = productsPage.getItemsInCart();
		Assert.assertEquals(actual, before + 1);
	}

}
