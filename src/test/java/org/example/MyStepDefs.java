package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {

    HomePage homePage = new HomePage();

    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    CommentPage commentPage = new CommentPage();


    @Given("I am on nopCommerce Homepage")
    public void i_am_on_nop_commerce_homepage() {

    }

    @When("I click on register button")
    public void i_click_on_register_button() {
        homePage.clickOnRegisterButton();

    }

    @When("I enter all required registration details")
    public void i_enter_all_required_registration_details() {
        registrationPage.enterRegistrationDetails();

    }

    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {
        registrationResultPage.verifyUserRegisrationSuccessfully();

    }

    @When("I hover the mouse on computer element")
    public void i_hover_the_mouse_on_computer_element() {
        homePage.mouseHoverComputer();

    }

    @Then("I can see the color of computer element changed")
    public void i_can_see_the_color_of_computer_element_changed() {
        homePage.coloroOfComputerElementAfterAction();

    }

    @When("I click on second Details button")
    public void i_click_on_second_details_button() {
        homePage.clickOnDetailsButton();
    }

    @When("I enter Title")
    public void i_enter_title() {
        commentPage.enterTitle();

    }

    @When("I enter comment")
    public void i_enter_comment() {
        commentPage.enterComment();

    }

    @When("I click on NEW COMMENT button")
    public void i_click_on_new_comment_button() {
        commentPage.clickOnNEWCOMMENTButton();

    }

    @Then("I can see news comment is successfully added")
    public void i_can_see_news_comment_is_successfully_added() {
        commentPage.verifyUserAddCommentSuccessfully();

    }

    @Then("I can see the comment is added at last")
    public void i_can_see_the_comment_is_added_at_last() {
        commentPage.verifyCommentAddedAtLast();

    }
}
















