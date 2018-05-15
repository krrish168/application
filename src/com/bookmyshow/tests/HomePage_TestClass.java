package com.bookmyshow.tests;

import org.testng.annotations.Test;

import com.bookmyshow.driverexecutables.BaseTest;
import com.bookmyshow.homepage.BookMyShow_Homepage;

public class HomePage_TestClass extends BaseTest
{
	
	@Test //Book my show added to github
	public void HomePageCheck() throws InterruptedException
	{
	BookMyShow_Homepage bms=new BookMyShow_Homepage(driver);
	
	//click the region of book my show page
	//bms.clickRegionBTN();
	//Thread.sleep(3000);
	//change the region to hyderabad
	bms.selectHyderabad();
	Thread.sleep(4000);
	
	//click popup confirmation
	bms.confirmationPopUp();
	Thread.sleep(3000);
	//now go to now showing options and select the second slide
	bms.nowShowingOptions();
	Thread.sleep(2000);
	
	//now change to coming soon options
	bms.comingsoonOptions();
	Thread.sleep(2000);
	
	bms.filmslistSlide();
	Thread.sleep(3000);
	
	//click on the image at homepage slider
	bms.clickOnImage();
	Thread.sleep(2000);
	
	}

}
