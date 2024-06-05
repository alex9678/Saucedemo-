package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.qameta.allure.Step;

public class CheckoutOverviewPage extends AppBasePage {

	@FindBy(css = "#finish")
	private WebElement finishBtn;
	@FindBy(css = "#cancel")
	private WebElement cancelBtn;
	@FindBy(css = ".inventory_item_name")
	List<WebElement> verifyProducts;

	public CheckoutOverviewPage(WebDriver driver) {
		super(driver);

	}

	@Step("Finish the order")
	public void finish() {
		click(finishBtn);

	}

	@Step("Go to main products page")
	public void cancel() {
		click(cancelBtn);

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