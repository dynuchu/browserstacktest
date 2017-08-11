package io.sspinc.browserstacktest;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class Application {
    public static final String USERNAME = "trialtry1";
    public static final String AUTOMATE_KEY = "sv3NgNPXBZuKbqmyWF4Z";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    protected static final String FIT_PREDICTOR_LOGO = "span.fp-logo-text.ng-scope";
    protected static final String NEXT = "div.fp-btn-nav.fp-btn-next.fp-filled";
    protected static final String DONE = "div.fp-btn-nav fp-btn-done fp-filled";
    protected static final String EDIT = "div.fp-btn-nav.fp-btn-edit.fp-animation-disabled.fp-text-only";
    protected static final String REMOVE = "div.fp-btn-rem-seed";
    public static void main(String[] args) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName", "iPhone");
        caps.setCapability("platform", "MAC");
        caps.setCapability("device", "iPhone 6");
        caps.setCapability("browserstack.debug", "true");
        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://www.saksoff5th.com/main/ProductDetail.jsp?FOLDER%3C%3Efolder_id=2534374302023738&PRODUCT%3C%3Eprd_id=845524442282084&R=883166701840&P_name=Lafayette+148+New+York&N=302023738&bmUID=lT8uUMl");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(FIT_PREDICTOR_LOGO)));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,600)");
        driver.findElement(By.cssSelector(FIT_PREDICTOR_LOGO)).click();
        Select designers = new Select(
                driver.findElement(By
                        .cssSelector("select.fp-form-control.fp-select-brand.ng-pristine.ng-valid")));
        Select sizes = new Select(
                driver.findElement(By
                        .cssSelector("select.fp-form-control.fp-select-size.ng-pristine.ng-valid")));
        designers.selectByIndex(3);
        sizes.selectByIndex(3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(NEXT)));
        driver.findElement(By.cssSelector(NEXT)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(DONE)));
        driver.findElement(By.cssSelector(DONE)).click();
        driver.findElement(By.cssSelector(FIT_PREDICTOR_LOGO)).click();
        driver.findElement(By.cssSelector(EDIT)).click();
        driver.findElement(By.cssSelector(REMOVE)).click();
        driver.quit();
    }
}
