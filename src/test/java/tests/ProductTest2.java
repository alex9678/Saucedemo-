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
@Feature("Add To Cart Through Product Item Page")
@Severity(SeverityLevel.NORMAL)

public class ProductTest2 extends BaseTest {

	@Test(description = "Add Product Sauce Labs Bike Light from Item page test.")
	public void tc01_addProductItem1() {
		productsPage.chooseProduct("Sauce Labs Bike Light");
		int before = productsPage.getItemsInCart();
		itemPage.addToCart();
		int actual = productsPage.getItemsInCart();
		itemPage.back();
		Assert.assertEquals(actual, before + 1);

	}

	@Test(description = "Add Product Sauce Labs Fleece Jacket from Item page test.")
	public void tc02_addProductItem2() {
		productsPage.chooseProduct("Sauce Labs Fleece Jacket");
		int before = productsPage.getItemsInCart();
		itemPage.addToCart();
		int actual = productsPage.getItemsInCart();
		itemPage.back();
		Assert.assertEquals(actual, before + 1);
	}

	@Test(description = "Add Product Test.allTheThings() T-Shirt (Red) from Item page test.")
	public void tc03_addProductItem3() {
		productsPage.chooseProduct("Test.allTheThings() T-Shirt (Red)");
		int before = productsPage.getItemsInCart();
		itemPage.addToCart();
		int actual = productsPage.getItemsInCart();
		itemPage.back();
		Assert.assertEquals(actual, before + 1);
	}

	@Test(description = "Add Product Sauce Labs Backpack from Item page test.")
	public void tc04_addProdcutItem4() {
		productsPage.chooseProduct("Sauce Labs Backpack");
		int before = productsPage.getItemsInCart();
		itemPage.addToCart();
		int actual = productsPage.getItemsInCart();
		itemPage.back();
		Assert.assertEquals(actual, before + 1);

	}

	@Test(description = "Add Product Sauce Labs Bolt T-Shirt from Item page test.")
	public void tc05_addProductItem5() {
		productsPage.chooseProduct("Sauce Labs Bolt T-Shirt");
		int before = productsPage.getItemsInCart();
		itemPage.addToCart();
		int actual = productsPage.getItemsInCart();
		itemPage.back();
		Assert.assertEquals(actual, before + 1);
	}

	@Test(description = "Add Product Sauce Labs Onesie from Item page test.")
	public void tc06_addProductItem6() {
		productsPage.chooseProduct("Sauce Labs Onesie");
		int before = productsPage.getItemsInCart();
		itemPage.addToCart();
		int actual = productsPage.getItemsInCart();
		itemPage.back();
		Assert.assertEquals(actual, before + 1);

	}
}
