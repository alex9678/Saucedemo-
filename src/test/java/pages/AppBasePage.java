package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.qameta.allure.Step;

public class AppBasePage extends BasePage {

	@FindBy(css = "#react-burger-menu-btn")
	private WebElement menuBtn;
	@FindBy(css = "#inventory_sidebar_link")
	private WebElement allItemBtn;
	@FindBy(css = "#logout_sidebar_link")
	private WebElement logoutBtn;
	@FindBy(css = "#reset_sidebar_link")
	private WebElement resetAppBtn;
	@FindBy(css = "#react-burger-cross-btn")
	private WebElement closeBtn;

	@FindBy(css = ".shopping_cart_link")
	private WebElement cartBtn;
	@FindBy(css = ".shopping_cart_badge")
	private WebElement cartItemsLabel;

	public AppBasePage(WebDriver driver) {
		super(driver);

	}

	@Step("go to cart")
	public void goToCart() {
		click(cartBtn);
	}

	@Step("Log out")
	public void logout() {
		click(menuBtn);
		waiting(1000);
		click(logoutBtn);
	}

	@Step("Clean cart from products")
	public void resetAppState() {
		click(menuBtn);
		waiting(1000);
		click(resetAppBtn);
		waiting(1000);
		click(closeBtn);
	}

	@Step("Go to Products Page")
	public void backMenu() {
		click(menuBtn);
		waiting(1000);
		click(allItemBtn);
	}

	// Validation
	// Returns num of items in the cart
	public int getItemsInCart() {
		String s = "";
		try {
			s = getText(cartItemsLabel);
		} catch (Exception e) {
			return 0;
		}
		int i = Integer.parseInt(s);
		return i;
	}

}
