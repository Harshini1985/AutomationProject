package org.logo.stepdef;

import org.junit.Assert;
import org.logo.pages.LogoHomePagePojo;
import org.logo.pages.LogoLoginPagePojo;
import org.logo.utils.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogoSteps extends Base{
	@Given("User launch the browser and navigates to the shopping app")
	public void user_launch_the_browser_and_navigates_to_the_shopping_app() {
	     getUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
	
	@When("User captures the title")
	public void user_captures_the_title() {
		getTitle();
	}
	
	@Then("User validates the title")
	public void user_validates_the_title() {
		Assert.assertEquals("Login - My Store",getTitle());
	}
	@Then("User validates logo is displayed in the screen")
	public void user_validates_logo_is_displayed_in_the_screen() {
		LogoLoginPagePojo l=new LogoLoginPagePojo();
		Assert.assertTrue("Logo is not displayed",l.getImgLogo().isDisplayed());
	}

	@When("User enters valid credentials in the shopping app")
	public void user_enters_valid_credentials_in_the_shopping_app() {
		LogoLoginPagePojo l=new LogoLoginPagePojo();
		insertType(l.getTxtEmail(),"lanmerkpharmaceuticals@gmail.com");
		insertType(l.getTxtPass(),"Lanmerk@123");
			
	}
	
	@When("User clicks the SignIn button")
	public void user_clicks_the_SignIn_button() throws InterruptedException {
		LogoLoginPagePojo l=new LogoLoginPagePojo();
		Click(l.getBtnSubmit());
		Thread.sleep(3000);
	}
	
	@Then("User validates that Call us now is displayed along with valid phone number")
	public void user_validates_that_Call_us_now_is_displayed_along_with_valid_phone_number() {
		LogoHomePagePojo h=new LogoHomePagePojo();
		Assert.assertTrue("Contact Info is not displayed",h.getCallImage().isDisplayed()); 
	}
	
	@Then("User validates that Contact Us, Sign Out is displayed")
	public void user_validates_that_Contact_Us_Sign_Out_is_displayed() {
		LogoHomePagePojo h=new LogoHomePagePojo();
		Assert.assertTrue("Contact Us Tab is not displayed",h.getTabContact().isDisplayed() );
		Assert.assertTrue("Sign Out Tab is not displayed",h.getTabSign().isDisplayed() );
	}
	
	@When("User clicks on Women")
	public void user_clicks_on_Women() {
		LogoHomePagePojo h=new LogoHomePagePojo();
		Click(h.getTabWomen());
	}
	
	@Then("User validates the title of Women")
	public void user_validates_the_title_of_Women() {
		getTitle();
		Assert.assertEquals("Women - My Store", getTitle());
	}
	
	@When("User clicks on Dresses")
	public void user_clicks_on_Dresses() {
		LogoHomePagePojo h=new LogoHomePagePojo();
		Click(h.getTabDresses());
	}

	@Then("User validates the title of Dresses")
	public void user_validates_the_title_of_Dresses() {
		getTitle();
		Assert.assertEquals("Dresses - My Store",getTitle());
	}
	
	@When("User clicks on T-Shirt")
	public void user_clicks_on_T_Shirt() {
		LogoHomePagePojo h=new LogoHomePagePojo();
		Click(h.getTabTshirt());
	}

	@Then("User validates the title of T-shirt")
	public void user_validates_the_title_of_T_shirt() {
		getTitle();
		Assert.assertEquals("T-shirts - My Store", getTitle());

	}
	
	@Then("User validates the title of SignIn screen")
	public void user_validates_the_title_of_SignIn_screen() {
		getTitle();
		Assert.assertEquals("My account - My Store",getTitle());
	}
	
	@Then("User validates the username displayed on screen once logged in")
	public void user_validates_the_username_displayed_on_screen_once_logged_in() {
		LogoHomePagePojo h=new LogoHomePagePojo();
		Assert.assertEquals("Ram Remo",h.getTxtUserName().getText());
	}
	
	@When("User scrolls to end of the page")
	public void user_scrolls_to_end_of_the_page() {
		LogoLoginPagePojo l=new LogoLoginPagePojo();
	    scroll(l.getScrollText());
	}

	@Then("User validates Categories, Information and My Account is Displayed is displayed")
	public void user_validates_Categories_Information_and_My_Account_is_Displayed_is_displayed() {
		 LogoLoginPagePojo l=new LogoLoginPagePojo();
	     Assert.assertTrue("Title is not displayed",l.getTitle1().isDisplayed());
	     Assert.assertTrue("Title is not displayed",l.getTitle2().isDisplayed());
	     Assert.assertTrue("Title is not displayed",l.getTitle3().isDisplayed());
	}
	
	@Then("User validates all sublinks in each category")
	public void user_validates_all_sublinks_in_each_category() {
		LogoLoginPagePojo l=new LogoLoginPagePojo();
	    System.out.println(Text(l.getSubLink1()));
	    Assert.assertEquals("Women",Text(l.getSubLink1()));
	    System.out.println(Text(l.getSubLink2()));
	    Assert.assertEquals("Specials",Text(l.getSubLink2()));
	    Assert.assertEquals("New products",Text(l.getSubLink3()));
	    Assert.assertEquals("Best sellers",Text(l.getSubLink4()));
	    Assert.assertEquals("Our stores",Text(l.getSubLink5()));
	    Assert.assertEquals("Contact us",Text(l.getSubLink6()));
	    Assert.assertEquals("Terms and conditions of use",Text(l.getSubLink7()));
	    Assert.assertEquals("About us",Text(l.getSubLink8()));
	    Assert.assertEquals("Sitemap",Text(l.getSubLink9()));
	    Assert.assertEquals("My orders",Text(l.getSubLink10()));
	    Assert.assertEquals("My credit slips",Text(l.getSubLink11()));
	    Assert.assertEquals("My addresses",Text(l.getSubLink12()));
	    Assert.assertEquals("My personal info",Text(l.getSubLink13()));
	    //Assert.assertEquals("Sign out",Text(l.getSubLink14()));
	    
	}
	
	@When("User taps on any product")
	public void user_taps_on_any_product() {
		LogoHomePagePojo h=new LogoHomePagePojo();
		Click(h.getImgFaded());
	}
	
	@Then("User validates that image is loaded and displayed")
	public void user_validates_that_image_is_loaded_and_displayed() {
		 LogoHomePagePojo h=new LogoHomePagePojo();
	     Assert.assertTrue("Image is not displayed",h.getImgFaded().isDisplayed());
	}

	@Then("User validates the product details")
	public void user_validates_the_product_details() {
		 LogoHomePagePojo h=new LogoHomePagePojo();
	     Assert.assertEquals("Faded Short Sleeve T-shirts",Text(h.getProdName())) ;
	     Assert.assertTrue("Description is displayed",h.getProdDescription().isDisplayed());
	     	}
	
	@Then("User validates links for Tweet Share Google+ and Pinterest are displayed")
	public void user_validates_links_for_Tweet_Share_Google_and_Pinterest_are_displayed() {
		LogoHomePagePojo h=new LogoHomePagePojo();
		Assert.assertTrue("Tweet Link is not displayed", h.getLnkTwitter().isDisplayed());
		Assert.assertTrue("FB Link is not displayed", h.getLnkFacebook().isEnabled());
		Assert.assertTrue("Google Link is not displayed", h.getLnkGoogle().isDisplayed());
		Assert.assertTrue("Google Link is not displayed", h.getLnkPinterest().isDisplayed());
	}

	@Then("User validates data sheet of the product")
	public void userValidatesDataSheetOfTheProduct() {
		LogoHomePagePojo h=new LogoHomePagePojo();
		Assert.assertEquals("Cotton", Text(h.getTxtData2()));
		Assert.assertEquals("Casual", Text(h.getTxtData4()));
		Assert.assertEquals("Short Sleeve", Text(h.getTxtData6()));
	}
	@Then("User validates More Info content is displayed")
	public void user_validates_More_Info_content_is_displayed() {
		LogoHomePagePojo h=new LogoHomePagePojo();
		Assert.assertTrue("Description is displayed",h.getTxtInfo().isDisplayed());
	}
	
	@Then("User validates placeholder text in Search textbox")
	public void userValidatesPlaceholderTextInSearchTextbox() {
		LogoLoginPagePojo l=new LogoLoginPagePojo();
		Assert.assertEquals("Search",Attribute(l.getTxtSearch()));
	}
	
	}
