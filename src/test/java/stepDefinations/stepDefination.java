package stepDefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.SQLOutput;
import java.util.List;

public class stepDefination {
    @Given("user is on NetBanking page")
    public void user_is_on_net_banking_page() {
        System.out.println("user_is_on_net_banking_page");
        // Write code here that turns the phrase above into concrete actions
    }
    @When("User login into application with username and password")
    public void user_login_into_application_with_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user_login_into_application_with_username_and_password");

    }
    @Then("Home page is populated")
    public void home_page_is_populated() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("home_page_is_populated");
    }

    @Then("Cards are displayed")
    public void cards_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("cards_are_displayed");

    }
    @When("User login into application with {string} and password {string}")
    public void userLoginIntoApplicationWithAndPassword(String arg0, String arg1) {
        System.out.println(arg0);
        System.out.println(arg1);
    }

    @And("Cards are  not displayed")
    public void cardsAreNotDisplayed() {
    }

    @And("Cards are displayed are {string}")
    public void cardsAreDisplayedAre(String arg0) {
        System.out.println(arg0);
    }

    @When("Sign up with the following details")
    public void signUpWithTheFollowingDetails(DataTable data) {
        List<List<String>> obj = data.asLists();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));

    }

    @When("User login in to application with {} and {}")
    public void userLoginIntoApplicationWithAnd(String arg0, String arg1) {
        System.out.println(arg0);
        System.out.println(arg1);
    }

    @Given("validate the browser")
    public void validateTheBrowser() {
        System.out.println("validateTheBrowser");

    }
    @When("Browser is triggered")
    public void browserIsTriggered() {
        System.out.println("browserIsTriggered");
    }

    @Then("check if browser is displayed")
    public void checkIfBrowserIsDisplayed() {
        System.out.println("checkIfBrowserIsDisplayed");

    }
}

