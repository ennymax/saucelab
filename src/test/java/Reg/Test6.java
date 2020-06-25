package Reg;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Test6 {

    private WebDriver driver;

    @Test
    public void Bank_SetUP_Valid_Account() throws MalformedURLException, InterruptedException {
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
        WebElement lmore1kpb = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/p/a/strong")));
        lmore1kpb.click();

        Thread.sleep(1000);
        String ttlel=driver.getTitle();
        String eer11 = "CICOD";
        if(eer11.equalsIgnoreCase(ttlel)) {
            System.out.println("\n********************Bank Detail page was SuccessFul*********************");
        }
        else {
            System.out.println("\n********************Failed to load bank detail page*********************");
        }

        Thread.sleep(1000);
        WebElement lmore1j = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div/div/div/div/a/span[2]/span[2]")));
        lmore1j.click();


        Thread.sleep(1000);
        WebElement eee = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[1]/div[1]/label[1]/span[1]")));
        Actions action1 = new Actions(driver);
        action1.moveToElement(eee).perform();
        eee.click();

        Thread.sleep(1000);
        WebElement eeee = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[1]/div[1]/label[2]/span[1]")));
        Actions action11 = new Actions(driver);
        action11.moveToElement(eeee).perform();
        eeee.click();

        System.out.println("\n********************Invalid account Verification Begins*********************");


        Thread.sleep(1000);
        WebElement eeeb = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[1]/div[1]/label[2]/span[1]")));
        Actions action1b = new Actions(driver);
        action1b.moveToElement(eeeb).perform();
        eeeb.click();

        Thread.sleep(2000);
        WebElement ele2 = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[1]/div[2]/div[1]/div/div[1]/div/select")));
        Select sel1 = new Select(ele2);
        sel1.selectByIndex(19);

        Thread.sleep(2000);
        WebElement lmore1v = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[1]/div[2]/div[1]/div/div[2]/div/input")));
        lmore1v.clear();
        lmore1v.sendKeys("2031425041");

        Thread.sleep(7000);
        WebElement clicker098 = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[1]/div[2]/div[2]/div/div[1]/div/input")));
        String er1 = clicker098.getText();
        System.out.println(er1);
        String eer1 = "";
        if(eer1.equalsIgnoreCase(er1)) {
            System.out.println("\n********************Account Verification was successful*********************");
        }
        else {
            System.out.println("\n********************Account verification Failed*********************");
        }


        Thread.sleep(3000);
        System.out.println("\n********************AMemart Form Upload*********************");
        WebElement click_kbox = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[1]/div[2]/div[2]/div/div[2]/div/label")));
        if(click_kbox.isDisplayed()){
            System.out.println("Memart Form Upload Button is Displayed");
        }
        else{
            System.out.println("Memart Form Upload Button is not Displayed");
        }

        if(click_kbox.isEnabled()){
            System.out.println("Memart Form Upload Button is Enabled");

        }
        else {
            System.out.println("Memart Form Upload Button is not Displayed");
        }


        Thread.sleep(3000);
       /*
        System.out.println("\n********************Certificate Of incorporation Upload*********************");

        WebElement click_kboxa = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[1]/div[2]/div[3]/div/div[1]/div/label")));
        if(click_kboxa.isDisplayed()){
            System.out.println("Certificate of incorporation Upload Button is Displayed");
        }
        else{
            System.out.println("Certificate of incorporation Upload Button is not Displayed");
        }

        if(click_kboxa.isEnabled()){
            System.out.println("Certificate of incorporation Upload Button is Enabled");

        }
        else {
            System.out.println("Certificate of incorporation is not Displayed");
        }

*/
        Thread.sleep(3000);
        System.out.println("\n********************Means Of Identification Upload*********************");
        WebElement click_kboxaa = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[1]/div[2]/div[3]/div/div[2]/div/label")));
        if(click_kboxaa.isDisplayed()){
            System.out.println("Means of Identification Upload Button is Displayed");
        }
        else{
            System.out.println("Means of Identification Upload Button is not Displayed");
        }

        if(click_kboxaa.isEnabled()){
            System.out.println("Means of Identification Upload Button is Enabled");

        }
        else {
            System.out.println("Means of Identification is not Displayed");
        }


        Thread.sleep(1000);
        WebElement lmore1kpn = driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[2]/button"));
        // lmore1kpn.click();

        System.out.println("********************Test06 Execution Completed********************");
    }

    @AfterMethod
    public void cleanUpAfterTestMethod( ) {
        driver.quit();
    }

}
