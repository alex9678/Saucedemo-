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
@Epic("Enhance Shopping Experience")
@Feature("Products Management")
@Severity(SeverityLevel.MINOR)

public class SortListTest extends BaseTest {

	@Story("Sort Items")
	@Description("As a User when I Sort By Their Names. alphbetical and reverse")
	@Test(description = "SortList Name A to Z")
	public void tc01_Select1() {
		productsPage.select("az");
		waiting(2000);

	}

	@Story("Sort Items")
	@Description("As a User when I Sort By Their Names. alphbetical and reverse")
	@Test(description = "SortList Name Z to A")
	public void tc02_select2() {
		productsPage.select("za");
		waiting(2000);
	}

	@Story("Sort Items by Price")
	@Description("As a User when I Sort The Products By Their Price. from high to low and from low to high")
	@Test(description = "SortList Price low to high")
	public void tc03_select3() {
		productsPage.select("lohi");
		waiting(2000);
	}

	@Story("Sort Items by Price")
	@Description("As a User when I Sort The Products By Their Price. from high to low and from low to high")
	@Test(description = "SortList Price hight to low")
	public void tc04_select4() {
		productsPage.select("hilo");
		waiting(2000);
	}
}