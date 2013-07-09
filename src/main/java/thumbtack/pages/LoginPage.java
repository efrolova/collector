package thumbtack.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created with IntelliJ IDEA.
 * User: efrolova
 * Date: 09.07.13
 * Time: 14:32
 * To change this template use File | Settings | File Templates.
 */
@DefaultUrl("http://tt-lem.dev.thumbtack.net/accounts/login/")
public class LoginPage extends PageObject {
    @FindBy(id="id_username")
    private WebElement txtUserName;

    @FindBy(id="id_password")
    private WebElement txtPass;
    @FindBy(className="img")
    private WebElement btnLogin;

    public LoginPage (WebDriver driver) {
        super(driver);
    }
    public void setEmailTxt(String email) {
        element(txtUserName).type("user7@thumbtack.net");
    }
    public void setPassTxt(String pass) {
        element(txtPass).type("userpass");
    }
    public void pressBtnLogin() {
        element(btnLogin).click();
    }
}
