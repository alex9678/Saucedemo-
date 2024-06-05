package tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CheckInformationPage;
import pages.CheckoutCompletePage;
import pages.CheckoutOverviewPage;
import pages.ItemPage;
import pages.LoginPage;
import pages.ProductsPage;
import pages.YourCartPage;
import utils.Utils;

public class BaseTest {
	WebDriver driver;
	LoginPage loginPage;
	ProductsPage productsPage;
	ItemPage itemPage;
	YourCartPage yourCartPage;
	CheckInformationPage checkInformationPage;
	CheckoutOverviewPage checkoutOverviewPage;
	CheckoutCompletePage checkoutCompletePage;

	@BeforeClass
	protected void setup(ITestContext testContext) {
		driver = WebDriverManager.chromedriver().create();
		testContext.setAttribute("WebDriver", this.driver);
		String url = Utils.getValue("url");
		driver.get(url);

		loginPage = new LoginPage(driver);
		productsPage = new ProductsPage(driver);
		itemPage = new ItemPage(driver);
		yourCartPage = new YourCartPage(driver);
		checkInformationPage = new CheckInformationPage(driver);
		checkoutOverviewPage = new CheckoutOverviewPage(driver);
		checkoutCompletePage = new CheckoutCompletePage(driver);

	}

	@BeforeClass
	public void setupLogin() {
		loginPage.login("standard_user", "secret_sauce");
	}
	
	public void waiting(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@AfterClass
	public void TearDown() {

	}

}