package devices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;



public class AndroidCloud implements IDevice{
    @Override
    public AppiumDriver create() {

        String user = "marcossimon_tR9hnT";
        String key = "69ynzdicLKy7zSXNgsd1";
        String app = "bs://15ec1fcfa640ceae22e29cb347ba6548da62928b";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device", "Samsung Galaxy S22 Ultra");
        capabilities.setCapability("os_version", "12.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", app);
        capabilities.setCapability("browserstack.user", user);
        capabilities.setCapability("browserstack.key", key);
        capabilities.setCapability("project", "UPB Test WhenDo");
        capabilities.setCapability("build", "build001");
        capabilities.setCapability("name", "WhenDoTest");

        AppiumDriver appiumDriver = null;
        try {
            appiumDriver = new AndroidDriver(new URL("http://" + user + ":" + key + "@hub-cloud.browserstack.com/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return appiumDriver;
    }
}
