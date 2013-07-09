package thumbtack.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://tt-lem.dev.thumbtack.net/catalogue")
public class BrowseItemPage extends PageObject {

    @FindBy(id="id_query")
    private WebElement searchBox ;

    @FindBy(className="btn-bmedium")
    private WebElement btnSearch ;

    @FindBy(id="id_collection_table")
    private WebElement itemsTable ;

    public BrowseItemPage(WebDriver driver) {
        super(driver);
    }

    public void inputSearchItem(String itemName) {
        element(searchBox).type("itemName");
    }
    public void doSearchItem(String itemName) {
        element(btnSearch).click();
    }
    public void searchItemTable(String itemName) {
        element(itemsTable).shouldContainText("itemName");
    }
    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
}


