package io.sspinc.browserstacktest;

import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicationTest {

    @Test
    public void testIsYourPredictedSizeTrue() {
        Assert.assertEquals("Text should be: Calculate Your Size", "Calculate your size", driver.findElement(By.cssSelector(ELEMENTTEXT)).getAttribute("innerText"));
    }

}