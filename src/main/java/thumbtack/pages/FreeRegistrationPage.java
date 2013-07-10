package thumbtack.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://tt-lem.dev.thumbtack.net/accounts/register")

public class FreeRegistrationPage extends PageObject {

    @FindBy(id="id_1-full_name")
    private WebElement fullNameTxt;

    @FindBy(id="id_1-email")
    private WebElement emailTxt  ;

    @FindBy(id="id_1-password1")
    private WebElement passTxt  ;

    @FindBy(id="id_1-password2")
    private WebElement reEnterPassTxt  ;

    @FindBy(id="id_1-tos")
    private WebElement agreeTearms  ;

    @FindBy(className="btn-bmedium")
    private WebElement btnJoin ;

    @FindBy(id="subheader")
    private WebElement term ;

    public FreeRegistrationPage(WebDriver driver) {
        super(driver);
    }


    public void clickFullNameTxt() {
        element(fullNameTxt).click();
    }
    public void setFullNameTxt(String fullName) {
        element(fullNameTxt).type("user14");
    }
    public void setEmailTxt(String email) {
        element(emailTxt).type("user14@thumbtack.net");
    }
    public void setPassTxt(String pass) {
        element(passTxt).type("userpass");
    }
    public void setReEnterPassTxt(String re_pass) {
        element(reEnterPassTxt).type("userpass");
    }

    public void setAgreeTearms() {
        element(agreeTearms).click();
    }
    public void setBtnJoin() {
        element(btnJoin).click();
    }
    public void getDefinitions(String termTxt) {
        element(term).shouldContainText("Successful Registration!");
    }


    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
}


