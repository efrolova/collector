package thumbtack

import thumbtack.steps.UserRegistSteps
import thumbtack.steps.UserLoginSteps
import thumbtack.requirements.Application.FreeRegistration.RegistrationPositive

using "thucydides"

thucydides.uses_default_base_url "http://tt-lem.dev.thumbtack.net"
thucydides.uses_steps_from UserRegistSteps
thucydides.uses_steps_from UserLoginSteps
thucydides.tests_story RegistrationPositive


scenario "Free registration ", {
    given "the user is on the Landing  page", {
        userRegistSteps.is_the_opening_website()
    }
    when "the end user looks up the definition of the word 'user4' 'user4@thumbtack.net''user1pass''user1pass'", {
        userRegistSteps.freeRegistration "user1","user1@thumbtack.net","user1pass","user1pass"
    }
    then "they should see welcome page of 'Successful Registration!", {
       userRegistSteps.should_see_welcome_page "Successful Registration!"
    }
 scenario "Login ", {
        given "the user is on the Landing  page", {
            userRegistSteps.is_the_opening_website()
        }
        when "the user login in website 'user4' 'user4@thumbtack.net'", {
           userLoginSteps.loginSuccess "user1@thumbtack.net","user1pass"
        }
        then "they should see welcome page of 'Successful Registration!", {
            userLoginSteps.should_see_dashboard "Wellcome"
        }
          }
  scenario "RegPositivePaid ", {
                given "the user is on the Landing  page", {
                    userRegistSteps.is_the_opening_website()
                }
                when "the user registration in website 'user.fullName' 'user.email' 'user.pass' 'user.re_pass' 'user.cardNum' 'card.number' 'user.cardYear' 'user.secCode' 'user.adr1' 'user.adr2' '' '' '' ''", {
                   userRegistSteps.paidRegistration "user.fullName", "user.email", "user.pass", "user.re_pass", "user.cardNum", "card.number","user.cardYear","user.secCode","user.adr1", "user.adr2"," "," "," "," "
                }
                then "they should see welcome page of 'Successful Registration!", {
                    userRegistSteps.should_see_welcome_page "Successful Registration!"
                }
}
}
