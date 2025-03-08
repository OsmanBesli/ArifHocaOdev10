package base;

import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class TestBase {
    public WebDriver driver;
    LoginPage loginPage;
    public  WebDriverWait driverWait;


    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver,driverWait);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driverWait= new WebDriverWait(driver,Duration.ofSeconds(10));



    }
    @AfterClass
    public void  tearDown() {
            driver.quit();
    }
}
