package thumbtack.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://tt-lem.dev.thumbtack.net/accounts/register")
public class PaidRegistrationPage extends PageObject {

    @FindBy(id="id_create")
    private WebElement btnPlaceOrder;

    @FindBy(id="id_1-cc_number")
    private WebElement cardNumberTxt  ;

    @FindBy(id="id_1-exp_date_0")
    private WebElement selectMonth  ;

    @FindBy(id="id_1-exp_date_1")
    private WebElement selectYear  ;

    @FindBy(id="id_1-cvv2")
    private WebElement securityCode  ;

    @FindBy(id="id_1-address_line1")
    private WebElement adress1txt ;

    @FindBy(id="id_1-address_line2")
    private WebElement adress2txt ;

    @FindBy(id="id_1-city")
    private WebElement cityTxt ;

    @FindBy(id="id_1-state")
    private WebElement stateCheckBox ;
    @FindBy(id="id_1-zip_code")
    private WebElement zipCodeTxt ;
    @FindBy(id="id_1-country")
    private WebElement countryCheckBox ;

    public PaidRegistrationPage(WebDriver driver) {
        super(driver);
    }


    public void setCardNumberTxt(String cardNumber) {
        element(cardNumberTxt).type("5436922913724033");
    }
    public void setMonthCard(String month) {
        element(selectMonth).selectByValue("5");
    }
    public void setYearCard(String yearCard) {
        element(selectYear).selectByValue("2018");
    }
    public void setSecurityCode(String secCode) {
        element(securityCode).type("777");
    }

    public void setAdress1(String adress1) {
        element(adress1txt).type("NewStreet1");;
    }
    public void setAdress2(String adress2) {
        element(adress2txt).type("NewStreet2");;
    }
    public void setCity(String city) {
        element(cityTxt).type("NewCity");;
    }
    public void setState(String state) {
        element(stateCheckBox).selectByValue("CA");
    }
    public void setZipCodeTxt(String zipCode) {
        element(zipCodeTxt).type("101111");;
    }
    public void setCountry(String country) {
        element(countryCheckBox).selectByValue("US");
    }
    public void pressPlaceOrder() {
        element(btnPlaceOrder).click();
    }


    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
}


