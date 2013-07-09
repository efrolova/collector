package thumbtack.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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

    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
}


