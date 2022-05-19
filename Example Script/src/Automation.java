import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Automation {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities ds = new DesiredCapabilities();

        ds.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        ds.setCapability("platformName", "android");
        ds.setCapability("appPackage", "com.momcare.momcare");
        ds.setCapability("appActivity", "com.example.momcare.MainActivity");

        ds.setCapability("unicodeKeyboard", "true");
        ds.setCapability("resetKeyboard", "true");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),ds);


        String email = "domukino@gmail.com";
        String pswd = "066811";


        //login process
        Thread.sleep(10000);
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Login now");
        el1.click();

        Thread.sleep(2000);
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
        el2.click();
        Thread.sleep(100);
        el2.sendKeys(email);

        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
        el3.click();
        Thread.sleep(100);
        el3.sendKeys(pswd);

        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Login");
        el5.click();


    }
}
