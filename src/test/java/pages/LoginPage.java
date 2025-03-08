package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SuiteRunner;

import java.time.Duration;

public class LoginPage extends TestBase {
   // private WebDriver driver;

    private final By usernameLocator = By.id("user-name");
    private final By passwordlocator = By.id("password");
    private final By loginButtonLocator = By.id("login-button");

    private String products="Epic sadface: Username and password do not match any user in this service";

    @FindBy(xpath = "//h3[text()='Epic sadface: Username and password do not match any user in this service']")
    public WebElement outputext;

    public LoginPage(WebDriver driver, WebDriverWait driverWait){
        this.driverWait=driverWait;
        this.driver = driver;
    }
    public  void  enterUsername(String username){
        driver.findElement(usernameLocator).click();
        driver.findElement(usernameLocator).sendKeys(username);
    }
    public void  enterPassword(String password){
        driver.findElement(passwordlocator).click();
        driver.findElement(passwordlocator).sendKeys(password);
    }
    public void clickSubmitButton(){
        driver.findElement(loginButtonLocator).click();
    }
    public void assertResultText(){
        WebElement outputext = driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']")));
        String result= outputext.getText();
        Assert.assertTrue(products.contains(result));
    }
}
