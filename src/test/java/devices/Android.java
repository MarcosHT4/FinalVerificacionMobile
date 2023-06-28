package devices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.GetEnvironment;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Android implements IDevice{

    @Override
    public AppiumDriver create() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Marcos's Galaxy Note9");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", GetEnvironment.getInstance().getPackageValue());
        capabilities.setCapability("appActivity", GetEnvironment.getInstance().getActivityValue());
        AppiumDriver appiumDriver = null;
        try {
            appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return appiumDriver;
    }



}
