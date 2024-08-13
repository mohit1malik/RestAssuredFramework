package POM_freamework.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1 {

    public static void main(String args[]){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://reqres.in/");
        driver.findElement(By.id("trigger-pro")).click();
        boolean visible = driver.findElement(By.xpath("//input[@id='mce-EMAIL']")).isEnabled();
        System.out.printf(String.valueOf(visible));
        driver.quit();

    }
}
