package Reg;

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

public class Test8 {

    private WebDriver driver;

    @Test
    public void Bank_Details_SetUp_Individual() throws MalformedURLException, InterruptedException {
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

        Thread.sleep(1000);
        WebElement kkk = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div[1]/a[2]")));
        kkk.click();

        Thread.sleep(1000);
        WebElement lmore1 = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/section[1]/div/div/div/div/div[2]/div/div[1]/div[1]/form/div[1]/input")));
        lmore1.clear();
        lmore1.sendKeys("penoso");

        Thread.sleep(1000);
        WebElement jj = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/section[1]/div/div/div/div/div[2]/div/div[1]/div[1]/form/div[2]/input")));
        jj.clear();
        jj.sendKeys("penos57540@lefaqr5.com");

        Thread.sleep(2000);
        WebElement lmore1k = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/section[1]/div/div/div/div/div[2]/div/div[1]/div[1]/form/div[3]/input")));
        lmore1k.clear();
        lmore1k.sendKeys("@Ecomax1759");

        Thread.sleep(1000);
        WebElement lmore1kp = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/section[1]/div/div/div/div/div[2]/div/div[1]/div[1]/form/div[4]/button")));
        lmore1kp.click();

        Thread.sleep(2000);
        WebElement lmore1kpb = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div/div/div[1]/a[1]")));
        lmore1kpb.click();

        Thread.sleep(2000);
        WebElement lmore1kpbn = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"cProdToggler\"]")));
        lmore1kpbn.click();

        Thread.sleep(2000);
        WebElement lmore1kpbmn = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/header/nav/div/ul/li[1]/div/div/div/div[3]/a[1]")));
        lmore1kpbmn.click();

        Thread.sleep(2000);
        WebElement lmore1kpbmno = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div/div/div[1]/a[2]/div[1]")));
        lmore1kpbmno.click();


        System.out.println("********************Test08 Execution Completed********************");
    }

    @AfterMethod
    public void cleanUpAfterTestMethod( ) {
        driver.quit();
    }
}
