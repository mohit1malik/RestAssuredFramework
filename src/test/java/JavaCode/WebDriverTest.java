package JavaCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebDriverTest {

    public static void main(String args[]){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://reqres.in/");
        String homePageTitle = driver.getTitle();
        System.out.println("Homepage title is - " + homePageTitle);
        String actualHomepageTitle = "Reqres - A hosted REST-API ready to respond to your AJAX requests";
        Assert.assertEquals(actualHomepageTitle, homePageTitle);

        WebElement create = driver.findElement(By.xpath("//a[contains(text(),'Create')]"));
        System.out.println("clicking on Post call");
        driver.findElement(By.xpath("//a[contains(text(),'Create')]"));
        System.out.println("clicked on Post call");
        driver.close();
    }
}
