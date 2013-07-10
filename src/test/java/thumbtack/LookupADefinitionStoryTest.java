package thumbtack;

import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import thumbtack.pages.UserProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import thumbtack.requirements.Application;
import thumbtack.steps.UserHelpSteps;
import thumbtack.steps.UserRegistSteps;
import thumbtack.steps.UserLoginSteps;
import thumbtack.steps.UserRegistSteps;

import java.io.File;

@Story(Application.FreeRegistration.RegistrationPositive.class)

@RunWith(ThucydidesRunner.class)
public class LookupADefinitionStoryTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://tt-lem.dev.thumbtack.net")
     public Pages pages;

    @Steps
    public UserRegistSteps userRegistSteps;
    @Steps
    public UserLoginSteps userLoginSteps;
    @Steps
    public UserHelpSteps userHelpSteps;

    @Issue("Free_registrationSuccesful")
    @Test
    public void Free_registrationSuccesful() {
        userRegistSteps.is_the_opening_website();
        userRegistSteps.freeRegistration("user.fullName", "user.email", "user.pass", "user.re_pass");
        userRegistSteps.should_see_welcome_page("Successful");
        userLoginSteps.logout();
    }
    @Issue("Paid_Standart_registrationSuccesful")
    @Test
    public void PaidStandart_registrationSuccesful() {
        userRegistSteps.is_the_opening_website();
        userRegistSteps.paidRegistration("user.fullName", "user.email", "user.pass", "user.re_pass",
                "user.cardNum", "card.number","user.cardYear","user.secCode","user.adr1",
                "user.adr2","","","","");
        userRegistSteps.should_see_welcome_page("Successful");
    }
    @Issue("Paid_Plus_registrationSuccesful")
    @Test
    public void PaidPlus_registrationSuccesful() {
        userRegistSteps.is_the_opening_website();
        userRegistSteps.plusRegistration("user.fullName", "user.email", "user.pass", "user.re_pass",
                "user.cardNum", "card.number","user.cardYear","user.secCode","user.adr1",
                "user.adr2","","","","");
        userRegistSteps.should_see_welcome_page("Successful");
    }
    @Issue("Login_Succeful")
    @Test
    public void loginSuccess() {
        userRegistSteps.is_the_opening_website();
        userLoginSteps.loginSuccess("user.email", "user.pass");
        userLoginSteps.should_see_dashboard("Wellcome");
    }
    @Issue("Login_Logout")
    @Test
    //@WithDriver("chrome")
    public void loginSuccessLogout() {
        userRegistSteps.is_the_opening_website();
        userLoginSteps.loginSuccess("user.email", "user.pass");
        userLoginSteps.should_see_dashboard("Wellcome");
        userLoginSteps.logout();
    }
    @Issue("HelpPageRegisterUser")
    @Test
    //@WithDriver("chrome")
    public void checkHelpPage() {
        userRegistSteps.is_the_opening_website();
        userLoginSteps.loginSuccess("user.email", "user.pass");
        userLoginSteps.should_see_dashboard("Wellcome");
        userHelpSteps.openHelpPage();
        userHelpSteps.checkHelpPage("Help topics","Need more help?");
        userLoginSteps.logout();
    }
    @Issue("HelpPageUnRegisterUser")
    @Test
    public void checkHelpPageUnRegistr() {
        userRegistSteps.is_the_opening_website();
        userHelpSteps.openHelpPage();
        userHelpSteps.checkHelpPage("Help topics","Need more help?");
    }
    @Issue("checkCategoryUnregistr")
    @Test   public void checkCategory() {
        userRegistSteps.is_the_opening_website();

    }
//    @Test

//    public void slooking_up_the_definition_of_banana_should_display_the_corresponding_article() {
//        endUser.is_the_home_page();
//		endUser.looks_for("banana");
//		endUser.should_see_definition_containing_words("An elongated curved fruit");
//    }

//    @Pending @Test
//    public void searching_by_ambiguious_keyword_should_display_the_disambiguation_page() {
//    }
} 