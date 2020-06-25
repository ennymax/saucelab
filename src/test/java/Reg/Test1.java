package Reg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

public class Test1 {

    public WebDriver driver = null;
    public static final String USERNAME = "ennymax";
    public static final String ACCESS_KEY = "a341d50b-8ba3-431b-a7e9-1923916cf85b";
    public static final String URL = "https://ennymax:a341d50b-8ba3-431b-a7e9-1923916cf85b@ondemand.us-west-1.saucelabs.com:443/wd/hub";

    @BeforeClass
    @Parameters({"browser", "version", "platform", "name"})
    public void setup(String br, String vr, String pf, String or) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", br);
        capabilities.setCapability("version", vr);
        capabilities.setCapability("platform", pf);
        capabilities.setCapability("name", or);
        driver = new RemoteWebDriver(new URL(URL), capabilities);
    }

    @Test
    public void LoginTest() {
        driver.navigate().to("https://www.saucedemo.com");
        String getTitle = driver.getTitle();
        System.out.println(getTitle);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}