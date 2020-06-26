package Reg;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test1A {

    private WebDriver driver;

    @Test
    public void Sign_Up() throws MalformedURLException, InterruptedException {

        String sauceUserName = System.getenv("ennymax");
        String sauceAccessKey = System.getenv("a341d50b-8ba3-431b-a7e9-1923916cf85b");
        String URL = "https://ennymax:a341d50b-8ba3-431b-a7e9-1923916cf85b@ondemand.us-west-1.saucelabs.com:443/wd/hub";

        ChromeOptions chromeOpts = new ChromeOptions();
        chromeOpts.setExperimentalOption("w3c", true);

        MutableCapabilities sauceOptions = new MutableCapabilities();
        sauceOptions.setCapability("username", sauceUserName);
        sauceOptions.setCapability("accessKey", sauceAccessKey);
        sauceOptions.setCapability("seleniumVersion", "3.141.59");
        sauceOptions.setCapability("name", "headless-chrome-test-java");
        sauceOptions.setCapability("build", "Sample Headless Tests");

        MutableCapabilities caps = new MutableCapabilities();
        caps.setCapability("goog:chromeOptions", chromeOpts);
        caps.setCapability("browserName", "chrome");
        caps.setCapability("browserVersion", "73");
        caps.setCapability("platformName", "windows 10");
        caps.setCapability("sauce:options", sauceOptions);
        driver = new RemoteWebDriver(new URL(URL), caps);

        driver.get("http://www.cicod.com/lyte");


        Thread.sleep(2000);
        System.out.println("\n********************Email Box Fumctionaliyt********************");
        WebElement lmore1 = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div[3]/form/div[1]/input")));
        if(lmore1.isDisplayed()){
            System.out.println("Email Address box is Displayed");
        }
        else{
            System.out.println("Email address box is not Displayed");
        }

        if(lmore1.isEnabled()){
            System.out.println("Email address box  IS ENABLED");
            lmore1.clear();
            lmore1.sendKeys("tolanii8080@gmail.com"); // Provide a valid Email
        }
        else {
            System.out.println("Email Address box IS NOT ENABLED");
        }

        Thread.sleep(2000);
        System.out.println("\n********************Store Name Field********************");
        WebElement clicker11v = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div[3]/form/div[2]/div/input")));
        if(clicker11v.isDisplayed()){
            System.out.println("Store Name box is Displayed");
        }
        else{
            System.out.println("Store Name box is not Displayed");
        }

        if(clicker11v.isEnabled()){
            System.out.println("Store Name box  IS ENABLED");
            clicker11v.clear();
            clicker11v.sendKeys("toanii"); // Shop Name
        }
        else {
            System.out.println("Store Name box IS NOT ENABLED");

        }

        WebElement clicker11vv = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div[3]/form/div[2]/button")));
        //clicker11vv.click();

        Thread.sleep(2000);
        System.out.println("********************Test01A Execution Completed********************");
    }

    @AfterMethod
    public void cleanUpAfterTestMethod( ) {
        driver.quit();
    }
}
