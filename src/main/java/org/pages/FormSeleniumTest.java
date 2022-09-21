package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FormSeleniumTest {

    WebDriver driver;

    WebElement element;

    Actions actions;

    By firstName_txtF = By.name("RESULT_TextField-1");
    By lastName_txtF = By.name("RESULT_TextField-2");
    By phone_txtF = By.name("RESULT_TextField-3");
    By country_txtF = By.name("RESULT_TextField-4");
    By city_txtF = By.name("RESULT_TextField-5");
    By emailAddress_txtF = By.name("RESULT_TextField-6");

    By genderM_radBtn = By.id("RESULT_RadioButton-7_0");
    By genderF_radBtn = By.id("RESULT_RadioButton-7_1");

    By sunday_chkBox = By.id("RESULT_CheckBox-8_0");
    By monday_chkBox = By.id("RESULT_CheckBox-8_1");
    By tuesday_chkBox = By.id("RESULT_CheckBox-8_2");
    By wednesday_chkBox = By.id("RESULT_CheckBox-8_3");
    By thrusday_chkBox = By.id("RESULT_CheckBox-8_4");
    By friday_chkBox = By.id("RESULT_CheckBox-8_5");
    By saturday_chkBox = By.id("RESULT_CheckBox-8_6");

    By time_list = By.id("RESULT_RadioButton-9");

    By upload_file = By.name("RESULT_FileUpload-10");

    By submit_btn = By.name("Submit");

    public FormSeleniumTest(WebDriver driver) {
        this.driver = driver;
    }

    //  Add info in the Text Form
    public void setFirstName_txtF(String strFirstName) {
        driver.findElement(firstName_txtF).sendKeys(strFirstName);
    }

    public void setLastName_txtF(String strLastName) {
        driver.findElement(lastName_txtF).sendKeys(strLastName);
    }

    public void setPhone_txtF(String strPhone) {
        driver.findElement(phone_txtF).sendKeys(strPhone);
    }

    public void setCountry_txtF(String strCountry) {
        driver.findElement(country_txtF).sendKeys(strCountry);
    }

    public void setCity_txtF(String strCity) {
        driver.findElement(city_txtF).sendKeys(strCity);
    }

    public void setEmailAddress_txtF(String strEmailAddress) {
        driver.findElement(emailAddress_txtF).sendKeys(strEmailAddress);
    }

//  Click in Radio Button
    public void setGenderM_radBtn() {
        WebElement element = driver.findElement(genderM_radBtn);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public void setGenderF_radBtn() {
        element = driver.findElement(genderF_radBtn);
        actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

//  Click in the CheckBox
    public void setSunday_chkBox() {
        element = driver.findElement(sunday_chkBox);
        actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public void setMonday_chkBox() {
        element = driver.findElement(monday_chkBox);
        actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public void setTuesday_chkBox() {
        element = driver.findElement(tuesday_chkBox);
        actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public void setWednesday_chkBox() {
        element = driver.findElement(wednesday_chkBox);
        actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public void setThrusday_chkBox() {
        element = driver.findElement(thrusday_chkBox);
        actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public void setFriday_chkBox() {
        element = driver.findElement(friday_chkBox);
        actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public void setSaturday_chkBox() {
        element = driver.findElement(saturday_chkBox);
        actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

//  Click in Drop Down List
    public void setTime_list(int index) {
        Select select = new Select(driver.findElement(time_list));
        select.selectByIndex(index);
    }

//  Click in Upload File
    public void setUpload_file(String strFileRoute) {
        WebElement element = driver.findElement(upload_file);
//        element.click();
        element.sendKeys(strFileRoute);

    }

    //  Click in Submit
    public void clickSubmit() {
        driver.findElement(submit_btn).click();
    }

    public void sendFormSeleniumTest(String strFirstName, String strLastName, String strPhone, String strCountry, String strCity, String strEmailAddress, int index_TimeList,
                                     String strFileRoute) {
        this.setFirstName_txtF(strFirstName);
        this.setLastName_txtF(strLastName);
        this.setPhone_txtF(strPhone);
        this.setCountry_txtF(strCountry);
        this.setCity_txtF(strCity);
        this.setEmailAddress_txtF(strEmailAddress);
        this.setGenderM_radBtn();
        this.setGenderF_radBtn();
        this.setSunday_chkBox();
        this.setMonday_chkBox();
        this.setTuesday_chkBox();
        this.setWednesday_chkBox();
        this.setThrusday_chkBox();
        this.setFriday_chkBox();
        this.setSaturday_chkBox();
        this.setTime_list(index_TimeList);
        this.setUpload_file(strFileRoute);
        this.clickSubmit();
    }
}
