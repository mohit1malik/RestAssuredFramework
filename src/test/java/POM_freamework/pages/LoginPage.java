package POM_freamework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage{

    @FindBy(xpath = "//input[@name ='email']")
    WebElement emailTextbox;


    @FindBy(xpath = "//div[contains(text(),'Login')]")
    WebElement LoginButton;
}
