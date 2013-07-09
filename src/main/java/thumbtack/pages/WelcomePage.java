package thumbtack.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://tt-lem.dev.thumbtack.net/accounts/register/thankyou")
public class WelcomePage extends PageObject {

    @FindBy(id="subheader")
    private WebElement term ;
    @FindBy(id="content")
    private WebElement Welcome ;
    public WelcomePage(WebDriver driver) {
        super(driver);
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


