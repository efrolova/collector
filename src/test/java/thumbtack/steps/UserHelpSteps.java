package thumbtack.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import thumbtack.pages.DashboardPage;
import thumbtack.pages.HelpPage;
import thumbtack.pages.LandingPage;
import thumbtack.pages.LoginPage;

public class UserHelpSteps extends ScenarioSteps {

   	public UserHelpSteps(Pages pages) {
		super(pages);
	}


    @Step
    public void doOpenHelpPage() {
        onLandingPage().helpPage();
    }
    @Step
    public void doCheckHelpTitle(String txtHelpTopics) {
        onHelpPage().getTitleHelpTopics(txtHelpTopics);
    }
    @Step
    public void doReturnHelpPage() {
        onHelpPage().returnHelpPage();
    }

    @Step
    public void doCheckHelpTopics() {
        onHelpPage().checkHelpsTopicsExists1();
        doReturnHelpPage();
        onHelpPage().checkHelpsTopicsExists2();
        doReturnHelpPage();
        onHelpPage().checkHelpsTopicsExists3();
        doReturnHelpPage();
        onHelpPage().checkHelpsTopicsExists4();
        doReturnHelpPage();
        onHelpPage().checkHelpsTopicsExists5();
        doReturnHelpPage();
        onHelpPage().checkHelpsTopicsExists6();
        doReturnHelpPage();
        onHelpPage().checkHelpsTopicsExists7();
        doReturnHelpPage();
        onHelpPage().checkHelpsTopicsExists8();
        doReturnHelpPage();
        onHelpPage().checkHelpsTopicsExists9();
        doReturnHelpPage();
        onHelpPage().checkHelpsTopicsExists10();
        doReturnHelpPage();
    }
    @Step
    public void doCheckHelpMore(String helpMore) {
        onHelpPage().checkInfoForNeedMoreHelp(helpMore);
    }
    private LandingPage onLandingPage() {
        return getPages().currentPageAt(LandingPage.class);
    }
    private HelpPage onHelpPage() {
        return getPages().currentPageAt(HelpPage.class);
    }


    @Step
    public void openHelpPage() {
        doOpenHelpPage();
    }
    @Step
    public void checkHelpPage(String txtHelpTopics,String helpMore) {
        doCheckHelpTitle(txtHelpTopics);

        doCheckHelpMore(helpMore);
        doCheckHelpTopics();

    }
    }

