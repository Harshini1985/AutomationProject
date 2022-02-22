package org.logo.pages;

import org.logo.stepdef.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoHomePagePojo {
public LogoHomePagePojo() { 
PageFactory.initElements(Hooks.driver,this);
}
@FindBy(xpath="//span[text()='Ram Remo']")
private WebElement txtUserName;

@FindBy(xpath="//span[@class='shop-phone']")
private WebElement callImage;

@FindBy(xpath="//a[text()='Contact us']")
private WebElement tabContact;

@FindBy(xpath="//a[@title='Log me out']")
private WebElement tabSign;

@FindBy(xpath="(//a[@title='Dresses'])[2]")
private WebElement tabDresses;

@FindBy(xpath="//a[text()='Women']")
private WebElement tabWomen;

@FindBy(xpath="(//a[text()='T-shirts'])[2]")
private WebElement tabTshirt;

public WebElement getTabContact() {
	return tabContact;
}

public WebElement getTabSign() {
	return tabSign;
}

public WebElement getTabDresses() {
	return tabDresses;
}

public WebElement getTabWomen() {
	return tabWomen;
}

public WebElement getTabTshirt() {
	return tabTshirt;
}

public WebElement getTxtUserName() {
	return txtUserName;
}

public WebElement getCallImage() {
	return callImage;
}

@FindBy(xpath="//img[@alt='Faded Short Sleeve T-shirts']")
private WebElement imgFaded;

public WebElement getImgFaded() {
	return imgFaded;
}

@FindBy(xpath="//h1[text()='Faded Short Sleeve T-shirts']")
private WebElement prodName;

@FindBy(xpath="(//p[contains(text(),'t-shirt with high neckline')])[1]")
private WebElement prodDescription;

public WebElement getProdName() {
	return prodName;
}

public WebElement getProdDescription() {
	return prodDescription;
}

@FindBy(xpath="//button[@class='btn btn-default btn-twitter']")
private WebElement lnkTwitter;

public WebElement getLnkTwitter() {
	return lnkTwitter;
}

@FindBy(xpath="//button[@class='btn btn-default btn-facebook']")
private WebElement lnkFacebook;

@FindBy(xpath="//button[@class='btn btn-default btn-google-plus']")
private WebElement lnkGoogle;

@FindBy(xpath="//button[@class='btn btn-default btn-pinterest']")
private WebElement lnkPinterest;

public WebElement getLnkFacebook() {
	return lnkFacebook;
}

public WebElement getLnkGoogle() {
	return lnkGoogle;
}

public WebElement getLnkPinterest() {
	return lnkPinterest;
}

@FindBy(xpath="//p[contains(text(),'Fashion has been creating well-designed')]")
private WebElement txtInfo;

public WebElement getTxtInfo() {
	return txtInfo;
}

@FindBy(xpath="//td[text()='Compositions']")
private WebElement txtData1;

@FindBy(xpath="//td[text()='Cotton']")
private WebElement txtData2;

@FindBy(xpath="//td[text()='Styles']")
private WebElement txtData3;

@FindBy(xpath="//td[text()='Casual']")
private WebElement txtData4;

@FindBy(xpath="//td[text()='Properties']")
private WebElement txtData5;

@FindBy(xpath="//td[text()='Short Sleeve']")
private WebElement txtData6;

public WebElement getTxtData1() {
	return txtData1;
}

public WebElement getTxtData2() {
	return txtData2;
}

public WebElement getTxtData3() {
	return txtData3;
}

public WebElement getTxtData4() {
	return txtData4;
}

public WebElement getTxtData5() {
	return txtData5;
}

public WebElement getTxtData6() {
	return txtData6;
}




}



