package com.bookmyshow.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookMyShow_Homepage
{
	//Declaration of WebElements
		
	@FindBy(xpath="//span[@class='__region']")
	private WebElement regionBTN;
	
	@FindBy(xpath="(//li[@class='region-list']/../..//span[@class='__icon'])[4]")
	private WebElement hyderabadRegion;
	/*
	@FindBy(className="showtimes btn _cuatro")
	private WebElement showBTN;
	
	@FindBy(xpath="//span[.='TOM']")
	private WebElement date;
	*/
	
	@FindBy(xpath="//button[.='Not Now']")
	private WebElement confirmationBTN;
	
	@FindBy(xpath="(//button[.='2'])[2]")
	private WebElement nowshowingBTN;
	
	@FindBy(xpath="//button[.='COMING SOON']")
	private WebElement comingsoonBTN;
	
	@FindBy(xpath="(//button[.='3'])[3]")
	private WebElement cominsoonoptionsBTN;
	
	@FindBy(xpath="//div[@class='banner-container slick-slide slick-cloned' and @data-slick-index='-2']")
	private WebElement image1;
	
	//Initialization using COnstructor
	public BookMyShow_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization of WebElements
	
	public void clickRegionBTN()
	{
		regionBTN.click();
	}
	
	public void selectHyderabad()
	{
		hyderabadRegion.click();
	}
	
	public void confirmationPopUp()
	{
		confirmationBTN.click();
	}
	public void nowShowingOptions()
	{
		nowshowingBTN.click();
	}
	
	public void comingsoonOptions()
	{
		comingsoonBTN.click();
	}
	
	public void filmslistSlide()
	{
		cominsoonoptionsBTN.click();
	}
	
	public void clickOnImage()
	{
		image1.click();
	}
}
