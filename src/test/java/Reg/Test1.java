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

public class Test1 {

    private WebDriver driver;

    @Test
    public void main() throws MalformedURLException, InterruptedException {

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


        driver.get("http://www.cicod.com/login?tenant=kemiport");

        Thread.sleep(2000);
        System.out.println("\n *************Domain Name*************");
        WebElement clicker11v1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/section[1]/div/div/div/div/div[2]/div/div[1]/div[1]/form/div[1]/input")));
       // WebElement clicker11v1 = driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div/div/div[2]/div/div[1]/div[1]/form/div[1]/input"));
        String veri = clicker11v1.getText();
        String veer1 = "kemiport";
        if(veer1.equalsIgnoreCase(veri)) {
            System.out.println("Domain Name is Prefilled");
        }
        else {
            System.out.println("Domain name is not Prefilled");
        }

        Thread.sleep(2000);
        System.out.println("\n *************Email Box*************");
        WebElement lmore111 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/section[1]/div/div/div/div/div[2]/div/div[1]/div[1]/form/div[2]/input")));
        if(lmore111.isDisplayed()){
            System.out.println("Email box is Displayed");
        }
        else{
            System.out.println("Email box is not Displayed");
        }

        if(lmore111.isEnabled()){
            System.out.println("Email  box  IS ENABLED");
            lmore111.clear();
            lmore111.sendKeys("kemiport8080@gmail.com"); // Shop Name
        }
        else {
            System.out.println("Email box IS NOT ENABLED");
        }

        Thread.sleep(2000);
        System.out.println("\n *************New Password Box*************");
        WebElement lmore1111 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/section[1]/div/div/div/div/div[2]/div/div[1]/div[1]/form/div[3]/input")));
        if(lmore1111.isDisplayed()){
            System.out.println("New Password  is  Displayed");
        }
        else{
            System.out.println("New Password  is not Displayed");
        }

        if(lmore1111.isEnabled()){
            System.out.println("New Password  box  IS ENABLED");
            lmore1111.clear();
            lmore1111.sendKeys("cOUMF"); // Shop Name
        }
        else {
            System.out.println("New Password  IS NOT ENABLED");
        }

        Thread.sleep(2000);
        System.out.println("\n *************Redirect Successful*************");
        WebElement bbb = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/section[1]/div/div/div/div/div[2]/div/div[1]/div[1]/form/div[4]/button")));
        bbb.click();
        System.out.println("Redirect was Successful");

        Thread.sleep(2000);
        System.out.println("\n *************User is able to Enter default Password*************");
        WebElement lmore11111 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div/div/div/div[2]/div/div/form/div[1]/input")));
        lmore11111.clear();
        lmore11111.sendKeys("cOUMF");

        Thread.sleep(2000);
        System.out.println("\n *************User is able to change their  Password*************");
        WebElement l = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div/div/div/div[2]/div/div/form/div[2]/input")));
        l.clear();
        l.sendKeys("@E1cOUMF");

        Thread.sleep(2000);
        System.out.println("\n *************User is able to change their Password*************");
        WebElement kk = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div/div/div/div[2]/div/div/form/div[2]/input")));
        kk.clear();
        kk.sendKeys("@E1cOUMF");



        Thread.sleep(2000);
        System.out.println("\n *************Change of Password was Successful*************");
        WebElement kkk = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div/div/div/div[2]/div/div/form/button")));
        // kkk.click();

        Thread.sleep(2000);
        System.out.println("\n ********************Tes01bt Execution Completed********************");
    }

    @AfterMethod
    public void cleanUpAfterTestMethod( ) {
        driver.quit();
    }
}
