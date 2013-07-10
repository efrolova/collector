package thumbtack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import net.thucydides.core.pages.PageObject;

/**
 * Created with IntelliJ IDEA.
 * User: efrolova
 * Date: 09.07.13
 * Time: 14:33
 * To change this template use File | Settings | File Templates.
 */

@DefaultUrl("http://tt-lem.dev.thumbtack.net/accounts/register")

public class RegistrationPage extends PageObject{
    @FindBy(className = "jcarousel-next")
    private WebElement btnNextRegistrRole;
    @FindBy(id="5|basic")
    private WebElement freeRegistration;

    @FindBy(id="6|paid")
    private WebElement standardRegistration;

    @FindBy(id="7|paid")
    private WebElement plusRegistration;


    public void setFreeRegistration() {
        element(freeRegistration).click();
    }
    public void chooseStandardRegistration() {
        element(standardRegistration).click();
    }
    public void chooseNextRegistrationRole() {
        element(btnNextRegistrRole).click();
    }
    public void choosePlusRegistration() {
        element(plusRegistration).click();
    }
    public RegistrationPage (WebDriver driver) {
        super(driver);
    }

}