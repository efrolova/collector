package thumbtack.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;


@DefaultUrl("http://tt-lem.dev.thumbtack.net")

public class LandingPage extends PageObject {

    @FindBy(className="learn-more-now")
    private WebElement btnLearnMore;

    @FindBy(id="login")
    private WebElement btnLogin;

    @FindBy(id="benefits")
    private WebElement linkExclusiveBenefits;

       @FindBy(className = "name")
    private WebElement dropDownBoxUser;
    @FindBy(className = "about")
    private WebElement footerPage;
    @FindBy(linkText = "Help")
    private WebElement linkHelpPage;
    @FindBy(linkText = "Logout")
    private WebElement linkLogout;
    @FindBy(className = "down")
    private WebElement btnCategoryDown;


    public LandingPage (WebDriver driver) {
        super(driver);
    }


    public void setBtnLearnMore() {
        element(btnLearnMore).click();
    }
    public void pressBtnLogin() {
        element(btnLogin).click();
    }
    public void pressLinkBenefits() {
        element(linkExclusiveBenefits).click();
    }


//    public void selectFromDropdown(WebElement dropdown, String visibleLabel) {
//        super.selectFromDropdown(dropdown, visibleLabel);    //To change body of overridden methods use File | Settings | File Templates.
//    }

    public void pressUserDropDown () {

         openAt("http://tt-lem.dev.thumbtack.net/accounts/logout/");
//        element(dropDownBoxUser).click();
//        selectFromDropdown(dropDownBoxUser, "Logout");
//
//               //element(dropDownBoxUser).selectByValue("Logout").click();
//        waitFor(1500).millisecond();
//              element(linkLogout).waitUntilVisible().click();


      }
    public void helpPage() {

        element(linkHelpPage).click();
    }
    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
}


