package POM_freamework.base;

import POM_freamework.utils.WebEventListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BaseClass {

    public static WebDriver driver;
    public static Properties prop;
    public static WebEventListener eventListener;


    public BaseClass(){
        try {
            try {
                prop = new Properties();
                FileInputStream ip = new FileInputStream("D:\\AutomationLearning\\RestAssuredFramework\\src\\test\\java\\POM_freamework\\utils\\config.properties");
                prop.load(ip);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void initiation(){
        String browserName= prop.getProperty("browser");

        if(browserName.equals("chrome")){
            driver = new ChromeDriver();
        } else if (browserName.equals("FF")) {
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));

    }
}
