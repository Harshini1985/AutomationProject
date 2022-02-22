package org.logo.pages;

import org.logo.stepdef.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoLoginPagePojo {
public LogoLoginPagePojo() {
	PageFactory.initElements(Hooks.driver, this);
}
@FindBy(id="email")
private WebElement txtEmail;

@FindBy(id="passwd")
private WebElement txtPass;

@FindBy(id="SubmitLogin")
private WebElement btnSubmit;

public WebElement getTxtEmail() {
	return txtEmail;
}

public WebElement getTxtPass() {
	return txtPass;
}

public WebElement getBtnSubmit() {
	return btnSubmit;
}

@FindBy(xpath="//a[text()='Ecommerce software by PrestaShop™']")
private WebElement scrollText;

@FindBy(xpath="//h4[text()='Categories']")
private WebElement title1;

@FindBy(xpath="//h4[text()='Information']")
private WebElement title2;

@FindBy(xpath="//a[text()='My account']")
private WebElement title3;

public WebElement getTitle2() {
	return title2;
}

public WebElement getTitle3() {
	return title3;
}
@FindBy(xpath="//img[@alt=\"My Store\"]")
private WebElement imgLogo;

public WebElement getScrollText() {
	return scrollText;
}

public WebElement getTitle1() {
	return title1;
}

public WebElement getImgLogo() {
	return imgLogo;
}

@FindBy(xpath="//a[contains(@title,'You will find here')]")
private WebElement subLink1;

@FindBy(xpath="//a[@title='Specials']")
private WebElement subLink2;

@FindBy(xpath="//a[@title='New products']")
private WebElement subLink3;
		
@FindBy(xpath="//a[@title='Best sellers']")
private WebElement subLink4;

@FindBy(xpath="//a[@title='Our stores']")
private WebElement subLink5;

@FindBy(xpath="//a[@title='Contact us']")
private WebElement subLink6;

@FindBy(xpath="//a[@title='Terms and conditions of use']")
private WebElement subLink7;		

@FindBy(xpath="//a[@title='About us']")
private WebElement subLink8;					
		
@FindBy(xpath="//a[@title='Sitemap']")
private WebElement subLink9;			
						
@FindBy(xpath="//a[@title='My orders']")
private WebElement subLink10;									
					
						
@FindBy(xpath="//a[@title='My credit slips']")
private WebElement subLink11;									
										
@FindBy(xpath="//a[@title='My addresses']")
private WebElement subLink12;																							
												
@FindBy(xpath="//a[@title='Manage my personal information']")
private WebElement subLink13;																
														
@FindBy(xpath="//a[@title='Sign out']")
private WebElement subLink14;

public WebElement getSubLink3() {
	return subLink3;
}

public WebElement getSubLink4() {
	return subLink4;
}

public WebElement getSubLink5() {
	return subLink5;
}

public WebElement getSubLink6() {
	return subLink6;
}

public WebElement getSubLink7() {
	return subLink7;
}

public WebElement getSubLink8() {
	return subLink8;
}

public WebElement getSubLink9() {
	return subLink9;
}

public WebElement getSubLink10() {
	return subLink10;
}

public WebElement getSubLink11() {
	return subLink11;
}

public WebElement getSubLink12() {
	return subLink12;
}

public WebElement getSubLink13() {
	return subLink13;
}

public WebElement getSubLink14() {
	return subLink14;
}

public WebElement getSubLink1() {
	return subLink1;
}

public WebElement getSubLink2() {
	return subLink2;
}

@FindBy(id="search_query_top")
private WebElement txtSearch;

public WebElement getTxtSearch() {
	return txtSearch;
}

}
