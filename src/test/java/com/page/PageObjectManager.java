package com.page;

import org.pojo.BookHotelPOJOClass;
import org.pojo.ConfirmationPOJOClass;
import org.pojo.HotelConfirmPOJOClass;
import org.pojo.LoginPOJOClass;
import org.pojo.SearchHotelPOJOClass;

public class PageObjectManager {
	LoginPOJOClass loginPage;
	SearchHotelPOJOClass searchPage;
	HotelConfirmPOJOClass hotelConfimPage;
	BookHotelPOJOClass bookingPage;
	ConfirmationPOJOClass confirmpPage;

	public LoginPOJOClass getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPOJOClass() : loginPage;
	}

	public SearchHotelPOJOClass getSearchPage() {
		return (searchPage == null) ? searchPage = new SearchHotelPOJOClass() : searchPage;
	}

	public HotelConfirmPOJOClass getHotelConfimPage() {
		return (hotelConfimPage == null) ? hotelConfimPage = new HotelConfirmPOJOClass() : hotelConfimPage;
	}

	public BookHotelPOJOClass getBookingPage() {
		return (bookingPage == null) ? bookingPage = new BookHotelPOJOClass() : bookingPage;

	}

	public ConfirmationPOJOClass getConfirmpPage() {
		return (confirmpPage == null) ? confirmpPage = new ConfirmationPOJOClass() : confirmpPage;

	}

}
