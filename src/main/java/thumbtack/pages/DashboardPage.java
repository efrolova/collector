package thumbtack.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://tt-lem.dev.thumbtack.net/catalogue/dashboard")
public class DashboardPage extends PageObject {

    @FindBy(id="sidebar-right")
    private WebElement txtWelcome ;

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public void getTxtWelcome(String txtWellcome) {
        element(txtWelcome).containsText("Welcome! You currently");
    }
    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
}


