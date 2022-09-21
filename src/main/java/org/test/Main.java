package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pages.FormSeleniumTest;

import java.time.Duration;

public class Main {
    static FormSeleniumTest formSeleniumTest;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Selenium POC!");

        System.setProperty("webdriver.chrome.driver", "D:\\WorkTools\\ChromeWebDriverV105\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

        formSeleniumTest = new FormSeleniumTest(driver);

        formSeleniumTest.setFirstName_txtF("efra");
        formSeleniumTest.setLastName_txtF("calderon");
        formSeleniumTest.setPhone_txtF("789456123");
        formSeleniumTest.setCountry_txtF("Costa Rica");
        formSeleniumTest.setCity_txtF("Heredia");
        formSeleniumTest.setEmailAddress_txtF("prueba@gmail.com");

        formSeleniumTest.setGenderM_radBtn();

        formSeleniumTest.setMonday_chkBox();

        formSeleniumTest.setTime_list(2);

        formSeleniumTest.clickSubmit();

//        formSeleniumTest.setUpload_file("C:\\Users\\Efra\\Pictures\\DMB.jpg");

//        driver.quit();

    }
}