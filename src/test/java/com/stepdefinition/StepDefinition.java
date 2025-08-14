package com.stepdefinition;

import com.libglobal.BaseClass;
import com.page.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	PageObjectManager page = new PageObjectManager();

	// Login page

	@Given("User is on adaction page")
	public void user_is_on_adaction_page() {
		launchBrowser();
		loadUrl("http://adactinhotelapp.com/");
		maximizewindow();

	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		type(page.getLoginPage().getUser().get(0), username);
		type(page.getLoginPage().getPass().get(0), password);

	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
		btnClick(page.getLoginPage().getLog().get(0));
	}

	@Then("user verify success message")
	public void user_verify_success_message() {
		System.out.println("Successfuly Login");

	}
	// Search page

	@When("User select {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_select_and_and_and_and_and(String Location, String hotel, String roomType, String numofRooms,
			String adultsPerRoom, String childperRoom) {
		selectByVisibleText(page.getSearchPage().getLocation().get(0), Location);
		selectByVisibleText(page.getSearchPage().getHotels().get(0), hotel);
		selectByVisibleText(page.getSearchPage().getRoomtype().get(0), roomType);
		selectByVisibleText(page.getSearchPage().getRooms().get(0), numofRooms);
		selectByVisibleText(page.getSearchPage().getAdult_room().get(0), adultsPerRoom);
		selectByVisibleText(page.getSearchPage().getChild_room().get(0), childperRoom);
	}

	@When("User click search button")
	public void user_click_search_button() {
		btnClick(page.getSearchPage().getSubmit().get(0));

	}
	// Hotel Confirm Page

	@When("User select the Hotel")
	public void user_select_the_hotel() {
		btnClick(page.getHotelConfimPage().getRadio().get(0));

	}

	@When("User click the continue button")
	public void user_click_the_continue_button() {
		btnClick(page.getHotelConfimPage().getContinue().get(0));
	}

	// Booking Page

	@When("enter {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void enter_and_and_and_and_and_and_and(String firstName, String lastName, String billingAddress,
			String creditCardNo, String creditCardType, String expiryMonth, String expiryYear, String cvvNumber) {
		type(page.getBookingPage().getFname().get(0), firstName);
		type(page.getBookingPage().getLname().get(0), lastName);
		type(page.getBookingPage().getAddress().get(0), billingAddress);
		type(page.getBookingPage().getCcnum().get(0), creditCardNo);
		type(page.getBookingPage().getCardtype().get(0), creditCardType);
		type(page.getBookingPage().getMonth().get(0), expiryMonth);
		type(page.getBookingPage().getYear().get(0), expiryYear);
		type(page.getBookingPage().getCvv().get(0), cvvNumber);

	}

	@When("User click BookNow button")
	public void user_click_book_now_button() {
		btnClick(page.getBookingPage().getBook().get(0));

	}
	// Confirm page

	@When("User click search hotel")
	public void user_click_search_hotel() throws InterruptedException {
		Thread.sleep(5000);
		btnClick(page.getConfirmpPage().getSearchhotel().get(0));
		quitBrowser();
	}

}
