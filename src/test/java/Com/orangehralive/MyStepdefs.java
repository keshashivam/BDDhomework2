package Com.orangehralive;

import com.sun.org.apache.bcel.internal.generic.Select;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by user on 4/27/2017.
 */
public class MyStepdefs
{

    WebDriver driver;


        @Given("^I am on login panel page of orange hrm website$")
        public void iAmOnLoginPanelPageOfOrangeHrmWebsite()
        {
            driver= new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get("https://enterprise-demo.orangehrmlive.com/pim/viewPimModule");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         }

       @When("^I  cai enter Username in username field$")
       public void iCaiEnterUsernameInUsernameField()
       {
           driver.findElement(By.cssSelector("span.form-hint")).click();
           driver.findElement(By.id("txtUsername")).clear();
           driver.findElement(By.id("txtUsername")).sendKeys("admin");
       }

      @And("^I enter password in password field$")
       public void iEnterPasswordInPasswordField()
      {
          driver.findElement(By.id("txtPassword")).clear();
          driver.findElement(By.id("txtPassword")).sendKeys("admin");
      }

      @And("^I click on login button$")
     public void iClickOnLoginButton()
     {
         driver.findElement(By.id("btnLogin")).click();
     }

      @Then("^I login successfully with message welcome admin$")
     public void iLoginSuccessfullyWithMessageWelcomeAdmin()
     {
         driver.findElement(By.cssSelector("#menu_pim_viewPimModule > b")).click();
     }

     @Given("^I am on homepage$")
     public void iAmOnHomepage()
     {

     }

    @When("^I click on pim tab$")
    public void iClickOnPimTab()
    {
        driver.findElement(By.cssSelector("#menu_pim_viewPimModule > b")).click();
        driver.findElement(By.id("menu_pim_addEmployee")).click();
    }

    @And("^I click on add employee$")
    public void iClickOnAddEmployee()
    {
        driver.findElement(By.id("firstName")).click();
        driver.findElement(By.id("firstName")).clear();
        driver.findElement(By.id("firstName")).sendKeys("Kavita");
        driver.findElement(By.id("middleName")).click();
        driver.findElement(By.id("middleName")).clear();
        driver.findElement(By.id("middleName")).sendKeys("H");
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys("Shah");
        driver.findElement(By.id("photofile")).click();
        driver.findElement(By.id("location")).click();
        driver.findElement(By.id("location")).sendKeys("Indian Development Center");
        driver.findElement(By.cssSelector("option[value=\"13\"]")).click();
        driver.findElement(By.id("btnSave")).click();
    }

    @Then("^I should navigate to add employee page sucessfully$")
    public void iShouldNavigateToAddEmployeePageSucessfully()
    {
        driver.findElement(By.xpath("//div[@id='pdMainContainer']/div[2]/div")).click();
    }

}


