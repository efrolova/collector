package thumbtack.steps;

import thumbtack.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import java.io.FileInputStream;
import java.util.Properties;
import static ch.lambdaj.Lambda.join;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;

public class UserRegistSteps extends ScenarioSteps {

   	public UserRegistSteps(Pages pages) {
		super(pages);
	}

   ///free   registration

    @Step
    public void dolearnMore() {
        onLandingPage().setBtnLearnMore();
    }

    @Step
    public void dofreeRigistration() {
        onRegistrationPage().setFreeRegistration();
    }
    @Step
    public void doStandartRigistration() {
        onRegistrationPage().chooseStandardRegistration();
    }
    @Step
    public void inputName(String fullName) {
         onFreeRegistrationPage().clickFullNameTxt();
        onFreeRegistrationPage().setFullNameTxt(fullName);
    }
    @Step
    public void inputEmail(String emailTxt) {
        onFreeRegistrationPage().setEmailTxt(emailTxt);
    }
    @Step
    public void inputPass(String pass) {
        onFreeRegistrationPage().setPassTxt(pass);
    }
    @Step
    public void inputRePass(String re_pass) {
        onFreeRegistrationPage().setReEnterPassTxt(re_pass);
    }
    @Step
    public void agreeTearmsCol() {
        onFreeRegistrationPage().setAgreeTearms();
    }
    @Step
    public void btnRegistration() {
        onFreeRegistrationPage().setBtnJoin();    }
    @Step
    public void search_word(String termTxt) {
      onWelcomePage().getDefinitions(termTxt);

    }

    //paid   registration
    @Step
    public void doPressLinkBenefits() {
        onLandingPage().pressLinkBenefits();
    }
    @Step
    public void inputCardNumber (String cardNumber) {
        onPaidRegistrationPage().setCardNumberTxt(cardNumber);
    }
    @Step
    public void inputCardMonth(String month) {
        onPaidRegistrationPage().setMonthCard(month);
    }
    @Step
    public void inputCardYear(String yearCard) {
        onPaidRegistrationPage().setYearCard(yearCard);
    }
    @Step
    public void inputSecurityCode(String secCode) {
        onPaidRegistrationPage().setSecurityCode(secCode);
    }

    @Step
    public void inputAdr1(String adress1) {
        onPaidRegistrationPage().setAdress1(adress1);
    }
    @Step
    public void inputAdr2(String adress2) {
        onPaidRegistrationPage().setAdress2(adress2);
    }
    @Step
    public void inputCity(String city) {
        onPaidRegistrationPage().setCity(city);
    }
    @Step
    public void inputState(String state) {
        onPaidRegistrationPage().setState(state);
    }
    @Step
    public void inputZipCode(String zipCode) {
        onPaidRegistrationPage().setZipCodeTxt(zipCode);
    }
    @Step
    public void inputCountry(String country) {
        onPaidRegistrationPage().setCountry(country);
    }
    @Step
    public void pressPaidRegistr() {
        onPaidRegistrationPage().pressPlaceOrder();
    }
    @Step
    public void pressNextRegistrRole() {
        onRegistrationPage().chooseNextRegistrationRole();
    }
    @Step
    public void doPlusRegist() {
        onRegistrationPage().choosePlusRegistration();
    }
    private LandingPage onLandingPage() {
        return getPages().currentPageAt(LandingPage.class);
    }
    private RegistrationPage onRegistrationPage() {
        return getPages().currentPageAt(RegistrationPage.class);
    }
    private FreeRegistrationPage onFreeRegistrationPage() {
        return getPages().currentPageAt(FreeRegistrationPage.class);
    }
    private WelcomePage onWelcomePage() {
        return getPages().currentPageAt(WelcomePage.class);
    }
    private PaidRegistrationPage onPaidRegistrationPage() {
        return getPages().currentPageAt(PaidRegistrationPage.class);
    }
    // private LoginPage LoginPage() {
    //  return getPages().currentPageAt(LoginPage.class);
    // }


    @Step
    public void is_the_opening_website() {
        onLandingPage().open();
    }

    @Step
    public void freeRegistration(String fullName,String emailTxt,String pass, String re_pass) {
        dolearnMore();
        dofreeRigistration();
        inputName(fullName);
        inputEmail(emailTxt);
        inputPass(pass);
        inputRePass(re_pass);
        agreeTearmsCol();
        btnRegistration();
    }
        @Step
        public void  should_see_welcome_page(String termTxt)      {
            search_word (termTxt);
        }
    @Step
    public void paidRegistration(String fullName,String emailTxt,String pass, String re_pass,
                                 String cardNumber,String cardMonth,String cardYear,
                                 String securityCode, String adr1,String adr2, String city,String state,
                                 String zipCode,String country) {
        doPressLinkBenefits();
        doStandartRigistration();
        inputName(fullName);
        inputEmail(emailTxt);
        inputPass(pass);
        inputRePass(re_pass);
        agreeTearmsCol();
        inputCardNumber(cardNumber);
        inputCardMonth(cardMonth);
        inputCardYear(cardYear);
        inputSecurityCode(securityCode);
        inputAdr1(adr1);
        inputAdr2(adr2);
        inputCity(city);
        waitFor(1000).millisecond();
        inputState(state);
        inputZipCode(zipCode);
        inputCountry(country);
        waitFor(1000).millisecond();
        pressPaidRegistr();

    }
    @Step
    public void plusRegistration(String fullName,String emailTxt,String pass, String re_pass,
                                 String cardNumber,String cardMonth,String cardYear,
                                 String securityCode, String adr1,String adr2, String city,String state,
                                 String zipCode,String country){
        doPressLinkBenefits();
        pressNextRegistrRole();
        doPlusRegist();
        inputName(fullName);
        inputEmail(emailTxt);
        inputPass(pass);
        inputRePass(re_pass);
        agreeTearmsCol();
        inputCardNumber(cardNumber);
        inputCardMonth(cardMonth);
        inputCardYear(cardYear);
        inputSecurityCode(securityCode);
        inputAdr1(adr1);
        inputAdr2(adr2);
        inputCity(city);
        waitFor(1000).millisecond();
        inputState(state);
        inputZipCode(zipCode);
        inputCountry(country);
        waitFor(1000).millisecond();
        pressPaidRegistr();
    }
    }

