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
@Epic("User Authentication")
@Feature("Login")
@Severity(SeverityLevel.CRITICAL)

public class LoginTest extends BaseTest {

	@Override
	public void setupLogin() {
		loginPage.login("standard_user", "secret_sauce");
	}

	@Story("Failed Login Scenarios")
	@Description("To verify that the system prevents users from logging in with invalid credentials and displays an appropriate error message.")
	@Test(description = "To verify that the system prevents users from logging in with invalid credentials.", dataProvider = "getData")
	public void tc01_loginFailed(String user, String password, String expected) {
		loginPage.login(user, password);
		String actual = loginPage.getErrorMsg();
		Assert.assertEquals(actual, expected);

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = { { "", "secret_sauce", "Epic sadface: Username is required" },
				{ "standart_user", "", "Epic sadface: Password is required" },
				{ "standart_user", "secret_sauc",
						"Epic sadface: Username and password do not match any user in this service" },
				{ "sdsd", "sdsd", "sdsds" },

				{ "43434", "44545", "erere" },

		};
		return data;

	}

	@Story("Successful Login")
	@Description("Verify successful login with correct login information")
	@Test(description = "Verify successful login with correct login information")
	public void tc02_loginpassed() {
		loginPage.login("standard_user", "secret_sauce");
	}

	@Feature("Logout")
	@Story("Logout from Cart Page")
	@Description("Verify logout functionality from Product Page")
	@Test(description = "Verify logout functionality from  Product Page")
	public void tc03_logout() {
		productsPage.logout();
	}
}