package POM_freamework.test;

import POM_freamework.base.BaseClass;
import POM_freamework.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTestCases extends BaseClass {

    HomePage homePage;


    public HomePageTestCases(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initiation();
        homePage = new HomePage();
    }

    @Test(priority = 0)
    public void verifyHomePageTitleTest(){
        String homepageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homepageTitle, "#1 Free CRM Software Power Up your Entire Business Free Forever");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
