package com.balfour.publishing.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.balfour.publishing.Test_Enviornment;
import com.balfour.publishing.Test_EnviornmentPOJO;
import com.balfour.publishing.qa.pages.sb4.Sb4ShopCheckoutRcvd;
import com.balfour.publishing.qa.pages.sb4.Sb4ShopPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stubs_Supply_Desk {

	WebDriver driver;

	By shopTile = By.xpath("//*[.='Shop']");
	By myCart = By.xpath("//*[.='My Cart']");
	By thankYou = By.xpath("//*[.='Thank you. Your order has been received.']");
	By oDetails = By.xpath("//*[.='Order Details']");

	String value = "/shop/?add-to-cart=433";
	Test_EnviornmentPOJO slugNAction = new Test_Enviornment().slugNAction();
	String prod001 = slugNAction.getProd001();
	String value2 = new Test_Enviornment().envUrl(prod001);

	public Stubs_Supply_Desk(SharedDriver driver) {
		this.driver = driver;
	}

	@When("^navigate to Supplies Page$")
	public void navigate_to_Supplies_Page() throws Throwable {

		String url = new Test_Enviornment().envUrl("/shop/");
		driver.get(url);
	}

	@Then("^arrive at the Supplies Page$")
	public void arrive_at_the_Supplies_Page() throws Throwable {
		new Sb4ShopPage(driver).isLoaded(shopTile, myCart);
	}

	@When("^place order$")
	public void place_order() throws Throwable {
		new Sb4ShopPage(driver).ClickAdd2Cart(value, value2).Go2ChkOut()
				.placeOrder();
	}

	@Then("^order is sent to BAAN$")
	public void order_is_sent_to_BAAN() throws Throwable {
		new Sb4ShopCheckoutRcvd(driver);
	}
}