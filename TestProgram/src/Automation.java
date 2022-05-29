import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Automation {

    public static void login(AndroidDriver<AndroidElement> driver) throws InterruptedException {

        String email = "ciscolevi@outlook.com";
        String pswd = "testmm123";

        //login process
        Thread.sleep(10000);
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Login now");
        el1.click();

        Thread.sleep(2000);

        List<AndroidElement> elementsList = driver.findElements(By
                .className("android.widget.EditText"));
        for (int i = 0; i < elementsList.size();i++){
            elementsList.get(i).click();
            Thread.sleep(100);
            if (i == 0){
                elementsList.get(i).sendKeys(email);
            }else{
                elementsList.get(i).sendKeys(pswd);
            }
        }

        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Login");
        el5.click();
    }

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        String device = "emulator-5554";

        DesiredCapabilities ds = new DesiredCapabilities();

        ds.setCapability(MobileCapabilityType.DEVICE_NAME, device);
        ds.setCapability("platformName", "android");
        ds.setCapability("appPackage", "com.momcare.momcare");
        ds.setCapability("appActivity", "com.example.momcare.MainActivity");

        ds.setCapability("unicodeKeyboard", "true");
        ds.setCapability("resetKeyboard", "true");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),ds);

        login(driver);
    }
}
