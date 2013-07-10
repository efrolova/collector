package thumbtack.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import thumbtack.pages.*;

public class UserLoginSteps extends ScenarioSteps {

   	public UserLoginSteps(Pages pages) {
		super(pages);
	}


    @Step
    public void doOpenLoginPage() {
        onLandingPage().pressBtnLogin();
    }
    @Step
      public void inputEmail(String emailTxt) {
        onLoginPage().setEmailTxt("user7@thumbtack.net");
    }
    @Step
       public void inputPassword(String pass) {
        onLoginPage().setPassTxt("userpass");
    }
    @Step
    public void pressLogin() {
        onLoginPage().pressBtnLogin();
    }
    @Step
    public void searchWellcome(String txtWellcome) {
        onDashboardPage().getTxtWelcome("Wellcome");
    }
    @Step
    public void doLogout() {
        onLandingPage().pressUserDropDown();

    }
    private LandingPage onLandingPage() {
        return getPages().currentPageAt(LandingPage.class);
    }
    private LoginPage onLoginPage() {
        return getPages().currentPageAt(LoginPage.class);
    }

    private DashboardPage onDashboardPage() {
        return getPages().currentPageAt(DashboardPage.class);
    }


    private DashboardPage DashboardPage() {
        return getPages().currentPageAt(DashboardPage.class);
    }

    @Step
    public void loginSuccess(String emailTxt,String pass) {
        doOpenLoginPage();
        inputEmail(emailTxt);
        inputPassword(pass);
        pressLogin();
    }
        @Step
        public void  should_see_dashboard(String txtWellcome)      {
            searchWellcome (txtWellcome);
        }
    @Step
    public void  logout()      {
       doLogout();
    }
    }

