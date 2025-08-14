package org.pojo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.libglobal.BaseClass;

public class ConfirmationPOJOClass extends BaseClass{
	public ConfirmationPOJOClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="search_hotel")
	private List<WebElement> searchhotel;
	
	public List<WebElement> getSearchhotel() {
		return searchhotel;
	}
	

}
