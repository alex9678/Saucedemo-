package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.qameta.allure.Step;

public class YourCartPage extends AppBasePage {

	@FindBy(css = "#checkout")
	private WebElement checkoutBtn;
	@FindBy(css = "#continue-shopping")
	private WebElement continueshoppingBtn;
	@FindBy(css = ".inventory_item_name")
	List<WebElement> verifyProducts;

	public YourCartPage(WebDriver driver) {
		super(driver);

	}

	@Step("Go to checkout")
	public void checkout() {
		click(checkoutBtn);
	}

	@Step("Go to main products page")
	public void back() {
		click(continueshoppingBtn);
	}

	@Step("Returns list of all ordered products name")
	public List<String> verifyProductName() {
		List<String> verifyProductsnames = new ArrayList<>();
		for (WebElement el : verifyProducts) {
			verifyProductsnames.add(getText(el));
		}
		return verifyProductsnames;
	}
}