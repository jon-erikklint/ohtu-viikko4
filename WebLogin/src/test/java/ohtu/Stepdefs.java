package ohtu;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Stepdefs {
    WebDriver driver = new HtmlUnitDriver();
    String baseUrl = "http://localhost:4567";


    @Given("^login is selected$")
    public void login_selected() throws Throwable {
        driver.get(baseUrl);
        WebElement element = driver.findElement(By.linkText("login"));       
        element.click();          
    }
    
    @Given("^new user is selected$")
    public void new_user_is_selected() throws Throwable {
        driver.get(baseUrl);
        WebElement element = driver.findElement(By.linkText("register new user"));
        element.click();
    }
    
    @When("^correct username \"([^\"]*)\" and password \"([^\"]*)\" are given$")
    public void username_correct_and_password_are_given(String username, String password) throws Throwable {
        logInWith(username, password);
    }

    
    @When("^correct username \"([^\"]*)\" and incorrect password \"([^\"]*)\" are given$")
    public void username_and_incorrect_password_are_given(String username, String password) throws Throwable {
        logInWith(username, password);
    }
    
    @When("^incorrect username \"([^\"]*)\" and password \"([^\"]*)\" are given$")
    public void incorrect_username_and_password_are_given(String username, String password) throws Throwable {
        logInWith(username, password);
    }
    
    @Then("^user is logged in$")
    public void user_is_logged_in() throws Throwable {
        pageHasContent("Ohtu Application main page");
    }
    
    @Then("^user is not logged in and error message is given$")
    public void user_is_not_logged_in_and_error_message_is_given() throws Throwable {
        pageHasContent("invalid username or password");
        pageHasContent("Give your credentials to login");
    }

    @Then("^user is created$")
    public void user_is_created() throws Throwable {
        pageHasContent("Welcome to Ohtu Application!");
    }

    @Then("^user is not created and error \"([^\"]*)\" is reported$")
    public void user_is_not_created_and_error_is_reported(String report) throws Throwable {
        pageHasContent("Create username and give password");
        pageHasContent(report);
    }
    
    @When("^correct username \"([^\"]*)\" and correct password \"([^\"]*)\" are given to register$")
    public void correct_username_and_correct_password_are_given_to_register(String username, String password) throws Throwable {
        registerWith(username, password, password);
    }

    @When("^incorrect username \"([^\"]*)\" and password \"([^\"]*)\" are given to register$")
    public void incorrect_username_and_password_are_given_to_register(String username, String password) throws Throwable {
        registerWith(username, password, password);
    }

    @When("^correct username \"([^\"]*)\" and incorrect password \"([^\"]*)\" are given to register$")
    public void correct_username_and_incorrect_password_are_given_to_register(String username, String password) throws Throwable {
        registerWith(username, password, password);
    }

    @When("^correct username \"([^\"]*)\", correct password \"([^\"]*)\" and incorrect confirmation \"([^\"]*)\" are given to register$")
    public void correct_username_correct_password_and_incorrect_confirmation_are_given_to_register(String username, String password, String confirmation) throws Throwable {
        registerWith(username, password, confirmation);
    }
    
    @Given("^user with username \"([^\"]*)\" with password \"([^\"]*)\" is succesfully created$")
    public void user_with_username_with_password_is_succesfully_created(String username, String password) throws Throwable {
        tryRegisteringWith(username, password);
    }

    @Given("^user with username \"([^\"]*)\" and password \"([^\"]*)\" is unsuccesfully created$")
    public void user_with_username_and_password_is_unsuccesfully_created(String username, String password) throws Throwable {
        tryRegisteringWith(username, password);
    }


    @After
    public void tearDown(){
        driver.quit();
    }
        
 
    private void pageHasContent(String content) {
        assertTrue(driver.getPageSource().contains(content));
    }
    
    private void tryRegisteringWith(String username, String password) throws Throwable{
        new_user_is_selected();
        registerWith(username, password, password);
    }
    
    private void registerWith(String username, String password, String passwordConfirmation){
        assertTrue(driver.getPageSource().contains("Create username and give password"));
        
        WebElement element = driver.findElement(By.name("username"));
        element.sendKeys(username);
        element = driver.findElement(By.name("password"));
        element.sendKeys(password);
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys(passwordConfirmation);
        
        element = driver.findElement(By.name("signup"));
        element.submit();
    }
        
    private void logInWith(String username, String password) {
        assertTrue(driver.getPageSource().contains("Give your credentials to login"));
        WebElement element = driver.findElement(By.name("username"));
        element.sendKeys(username);
        element = driver.findElement(By.name("password"));
        element.sendKeys(password);
        element = driver.findElement(By.name("login"));
        element.submit();  
    } 
    
}