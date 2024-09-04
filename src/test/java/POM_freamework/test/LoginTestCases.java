package POM_freamework.test;

import POM_freamework.base.BaseClass;
import POM_freamework.pages.HomePage;
import POM_freamework.pages.LoginPage;
import org.testng.annotations.BeforeMethod;

public class LoginTestCases extends BaseClass {
        LoginPage loginPage;
        HomePage homePage;

        public LoginTestCases(){
            super();
        }

        @BeforeMethod
    public void setUP(){
            initiation();
            loginPage = new LoginPage();

        }
}
