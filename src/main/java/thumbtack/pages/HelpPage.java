package thumbtack.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://tt-lem.dev.thumbtack.net/help")
public class HelpPage extends PageObject {

    @FindBy(id="help")
    private WebElement helpBodyPage ;

    @FindBy(id="id_topic_1")
    private WebElement generalQuestions;
    @FindBy(id="id_topic_1_questions")
    private WebElement generalQuestions1;
    @FindBy(id="id_topic_2")
    private WebElement basicSubscriptionAccount;
    @FindBy(id="id_topic_2_questions")
    private WebElement basicSubscriptionAccount1;

    @FindBy(id="id_topic_3")
    private WebElement upgrToAPlusSubscription;
    @FindBy(id="id_topic_3_questions")
    private WebElement upgrToAPlusSubscription1;

    @FindBy(id="id_topic_4")
    private WebElement plusSubscriptionAccount;
    @FindBy(id="id_topic_4_questions")
    private WebElement plusSubscriptionAccount1;

    @FindBy(id="id_topic_5")
    private WebElement usingTheTolls;

    @FindBy(id="id_topic_5_questions")
    private WebElement usingTheTolls1;

    @FindBy(id="id_topic_6")
    private WebElement moneyBackGuarantee;
    @FindBy(id="id_topic_6_questions")
    private WebElement moneyBackGuarantee1;

    @FindBy(id="id_topic_7")
    private WebElement payAndBill;
    @FindBy(id="id_topic_7_questions")
    private WebElement payAndBill1;


    @FindBy(id="id_topic_8")
    private WebElement Privacy;
    @FindBy(id="id_topic_8_questions")
    private WebElement Privacy1;

    @FindBy(id="id_topic_9")
    private WebElement valetService;
    @FindBy(id="id_topic_9_questions")
    private WebElement valetService1;

    @FindBy(id="id_topic_10")
    private WebElement contactInformation;
    @FindBy(id="id_topic_10_questions")
    private WebElement contactInformation1;
    @FindBy(id="need-more-help")
    private WebElement infoForNeedMoreHelp;
    @FindBy(linkText ="back to Help topics")
    private WebElement returnOnHelpPage;

    public HelpPage(WebDriver driver) {
        super(driver);
    }

    public void getTitleHelpTopics(String txtHelpTopics) {
        element(helpBodyPage).shouldContainText("Help topics");
    }
    public void checkHelpsTopicsExists1() {
        element(generalQuestions).isVisible();
        element(generalQuestions).click();
        element(generalQuestions1).click();

    }
    public void checkHelpsTopicsExists2() {
        element(basicSubscriptionAccount).isVisible();
        element(basicSubscriptionAccount).click();
        element(basicSubscriptionAccount1).click();

    }  public void checkHelpsTopicsExists3() {
        element(upgrToAPlusSubscription).isVisible();
        element(upgrToAPlusSubscription).click();
        element(upgrToAPlusSubscription1).click();
    }
    public void checkHelpsTopicsExists4() {
        element(plusSubscriptionAccount).isVisible();
        element(plusSubscriptionAccount).click();
        element(plusSubscriptionAccount1).click();
    }
    public void checkHelpsTopicsExists5() {
        element(usingTheTolls).isVisible();
        element(usingTheTolls).click();
        element(usingTheTolls1).click();
    }
    public void checkHelpsTopicsExists6() {
        element(moneyBackGuarantee).isVisible();
        element(moneyBackGuarantee).click();
        element(moneyBackGuarantee1).click();
    }
    public void checkHelpsTopicsExists7() {
        element(payAndBill).isVisible();
        element(payAndBill).click();
       element(payAndBill1).click();

    }
    public void checkHelpsTopicsExists8() {

        element(Privacy).isVisible();
        element(Privacy).click();
        element(Privacy1).click();
    }

    public void checkHelpsTopicsExists9() {

        element(valetService).isVisible();
        element(valetService).click();
        element(valetService1).click();
    }

    public void checkHelpsTopicsExists10() {
        element(contactInformation).isVisible();
        element(contactInformation).click();
        element(contactInformation1).click();
    }

    public void checkInfoForNeedMoreHelp(String helpMore) {
        element(infoForNeedMoreHelp).shouldContainText("Need more help?");
    }
    public void returnHelpPage() {
        element(returnOnHelpPage).click();
    }
    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
}


