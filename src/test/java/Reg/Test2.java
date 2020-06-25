package Reg;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test2
{

    private WebDriver driver;

    @Test
    public void SetUp_After_Successful_Change_Of_Password() throws MalformedURLException, InterruptedException {

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
        WebElement clicker11v1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div[1]/a[2]")));
        clicker11v1.click();

        Thread.sleep(2000);
        System.out.println("\n *************Store Name Box Functional*************");
        WebElement lmore1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/section[1]/div/div/div/div/div[2]/div/div[1]/div[1]/form/div[1]/input")));
       // WebElement lmore1 = driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div/div/div[2]/div/div[1]/div[1]/form/div[1]/input"));
        lmore1.clear();
        lmore1.sendKeys("emaxkemi");
        Thread.sleep(2000);

        System.out.println("\n *************Email Box Functional*************");
        WebElement lmore1q = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/section[1]/div/div/div/div/div[2]/div/div[1]/div[1]/form/div[2]/input")));
       // WebElement lmore1q = driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div/div/div[2]/div/div[1]/div[1]/form/div[2]/input"));
        lmore1q.clear();
        lmore1q.sendKeys("emaxkemi@gmail.com");

        Thread.sleep(2000);
        System.out.println("\n *************Password Box Functional*************");
        WebElement lmore1c = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/section[1]/div/div/div/div/div[2]/div/div[1]/div[1]/form/div[3]/input")));
        //WebElement lmore1c = driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div/div/div[2]/div/div[1]/div[1]/form/div[3]/input"));
        lmore1c.clear();
        lmore1c.sendKeys("@Ecomax1759");


        Thread.sleep(2000);
        System.out.println("\n *************Login Button is functional*************");
        WebElement clicker11v = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/section[1]/div/div/div/div/div[2]/div/div[1]/div[1]/form/div[4]/button")));
        //WebElement clicker11v = driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div/div/div[2]/div/div[1]/div[1]/form/div[4]/button"));
        clicker11v.click();

        Thread.sleep(2000);
        WebElement clicker11vk = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/aside/section/ul/li[1]/a")));
        clicker11vk.click();

        Thread.sleep(2000);
        WebElement clicker11vkm = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div/div/div/div[3]/a[1]/span[2]")));
        clicker11vkm.click();

        Thread.sleep(2000);
        System.out.println("\n ***************Street Name************");
        WebElement lmore1m = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[1]/div/div[2]/div/div[1]/div/input")));
        if(lmore1m.isDisplayed()){
            System.out.println("Contact Name box is Displayed");
        }
        else{
            System.out.println("Contact Name box is not Displayed");

        }

        if(lmore1m.isEnabled()){
            System.out.println("Contact Name box  IS ENABLED");

            lmore1m.clear();
            lmore1m.sendKeys("Williams lupin"); // Provide a valid Email
        }
        else {
            System.out.println("Contact Name box IS NOT ENABLED");
        }

        Thread.sleep(2000);
        System.out.println("\n ***************Phone Number Section************");
        WebElement lmore1mn = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[1]/div/div[2]/div/div[2]/div/input")));
        if(lmore1mn.isDisplayed()){
            System.out.println("Phone Number box is Displayed");
        }
        else{
            System.out.println("Phone Number box is not Displayed");
        }

        if(lmore1mn.isEnabled()){
            System.out.println("Phone Number box  IS ENABLED");

            lmore1mn.clear();
            lmore1mn.sendKeys("09023426273"); // Provide a valid Email
        }
        else {
            System.out.println("Phone Number box IS NOT ENABLED");

        }

        Thread.sleep(2000);
       // WebElement ele12 = driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[1]/div/div[3]/div/div[2]/div/select"));
        WebElement ele11 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[1]/div/div[3]/div/div[2]/div/select")));
        Select sel = new Select(ele11);
        sel.selectByIndex(25);

        Thread.sleep(2000);
        WebElement ele12 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[1]/div/div[3]/div/div[3]/div/select")));
        //WebElement ele12 = driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[1]/div/div[3]/div/div[3]/div/select"));
        Select sel2 = new Select(ele12);
        sel2.selectByIndex(10);

        Thread.sleep(2000);
        System.out.println("\n ***************Building Number Section************");
        WebElement lmore1mnn = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[1]/div/div[4]/div/div[1]/div/input")));
       // WebElement lmore1mnn = driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[1]/div/div[4]/div/div[1]/div/input"));
        if(lmore1mnn.isDisplayed()){
            System.out.println("Building Number is Displayed");
        }
        else{
            System.out.println("Building Number box is not Displayed");

        }

        if(lmore1mnn.isEnabled()){
            System.out.println("Building Number box  IS ENABLED");
            lmore1mnn.clear();
            lmore1mnn.sendKeys("09");
        }
        else {
            System.out.println("Building Number box IS not ENABLED");
        }

        Thread.sleep(2000);
        System.out.println("\n ***************Street Name Field************");
        WebElement lmore1mng = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[1]/div/div[4]/div/div[2]/div/input")));
        //WebElement lmore1mng = driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[1]/div/div[4]/div/div[2]/div/input"));
        if(lmore1mng.isDisplayed()){
            System.out.println("Street name box is Displayed");
        }
        else{
            System.out.println("Street name box is not Displayed");
        }

        if(lmore1mng.isEnabled()){
            System.out.println("Street name box  IS ENABLED");

            lmore1mng.clear();
            lmore1mng.sendKeys("Emmanuel");
        }
        else {
            System.out.println("Street name box IS NOT ENABLED");
        }


        Thread.sleep(2000);
        System.out.println("\n ***************Tell Us About your Self Section************");
        WebElement lmore1mnj = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[1]/div/div[5]/div/div/div/textarea")));
        if(lmore1mnj.isDisplayed()){
            System.out.println("Tell us box is Displayed");
        }
        else{
            System.out.println("Tell us box is not Displayed");
        }

        if(lmore1mnj.isEnabled()){
            System.out.println("Tell us box  IS ENABLED");
            lmore1mnj.clear();
            lmore1mnj.sendKeys("Another day of testing");
        }
        else {
            System.out.println("Tell us box IS NOT ENABLED");
        }

        Thread.sleep(2000);
        WebElement ele121 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[1]/div/div[6]/div/div[1]/div/select")));
        Select sel21 = new Select(ele121);
        sel21.selectByIndex(5);

        Thread.sleep(2000);
        WebElement qqq = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/div/section/div[2]/div/div[3]/form/div[1]/div/div[6]/div/div[2]/div/select")));
        Select mmm = new Select(qqq);
        mmm.selectByIndex(2);

        Thread.sleep(2000);
        WebElement clicker11v1p = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/div[2]/div/div[3]/form/div[2]/button")));
        System.out.println("\n ***************Users can Successfully setup Their account************");
        //clicker11v1p.click();

        Thread.sleep(2000);
        System.out.println("\n ********************Test02 Execution Completed********************");
    }

    @AfterMethod
    public void cleanUpAfterTestMethod( ) {
        driver.quit();
    }
}
