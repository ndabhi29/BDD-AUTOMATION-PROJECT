package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

    public class MyStepDefs  {
        HomePage homepage = new HomePage();
        RegisterPage registerPage = new RegisterPage();
        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();

        @Given("^user is on homepage$")
        public void user_is_on_homepage() {
        }
        @When("^user clicks on register button$")
        public void user_clicks_on_register_button() {
            homepage.ClickOnRegisterButton();
        }
        @When("^user enters all required registration details$")
        public void user_enters_all_required_registration_details() {
            registerPage.UserEnterRegistrationDetails();
        }
        @When("^user clicks on register-submit button$")
        public void user_clicks_on_register_submit_button(){
            registerPage.UserClickOnRegisterSubmitButton();
        }
        @Then("^user should able to register successfully$")
        public void user_should_able_to_register_successfully(){

            registerSuccessPage.UserShouldbeabletoregistersuccessfully();
        }











    }










