package POM_freamework.pages;

import POM_freamework.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

    @FindBy(xpath = "//span[contains(text(),'Log In')]")
    WebElement loginButton;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public String verifyHomePageTitle(){
        return driver.getTitle();
    }
}
