package thumbtack.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://tt-lem.dev.thumbtack.net/catalogue/item/add")
public class AddItemPage extends PageObject {

    @FindBy(id="sidebar-right")
    private WebElement txtWelcome ;

    @FindBy(className="btn-bmedium")
    private WebElement btnAddItem;

    @FindBy(id="ufd-container")
    private WebElement itemsContainer ;
    @FindBy(id="ufd-id_category")
    private WebElement itemsCheckBox ;

    public AddItemPage(WebDriver driver) {
        super(driver);
    }

    public void getTxtWelcome(String txtWellcome) {
        element(txtWelcome).containsText("Welcome! You currently");
    }
    public void pressBtnAddItem() {
        element(btnAddItem).click();
    }
    public void ChoiseItem1() {
        element(itemsCheckBox).click();
        element(itemsContainer).selectByIndex(1);
    }
    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
}


