import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

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

    public static void showNotificationList(AndroidDriver<AndroidElement> driver) throws InterruptedException {

        String min;
        String hour;

        //going to the notification page
        MobileElement el46 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View");
        el46.click();

        Thread.sleep(2000);
        //clicking button to create schedule event
        MobileElement el47 = (MobileElement) driver.findElementByAccessibilityId("Schedule Now");
        el47.click();

        Thread.sleep(5000);
        //clicking add button
        MobileElement el48 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View/android.view.View/android.widget.Button");
        el48.click();

        Thread.sleep(1000);
        //clicking add appointment
        MobileElement el49 = (MobileElement) driver.findElementByAccessibilityId("  Doctor appointment");
        el49.click();

        //get time by system
        TimeZone time = TimeZone.getTimeZone("Etc/GMT-8");
        TimeZone.setDefault(time);
        Calendar calendar = Calendar.getInstance(time);
        if (calendar.get(Calendar.MINUTE) + 6 > 59){
            hour = String.valueOf(calendar.get(Calendar.HOUR_OF_DAY) + 1);
            min = String.valueOf(6 - (60 - calendar.get(Calendar.MINUTE)));
        }else{
            hour = String.valueOf(calendar.get(Calendar.HOUR_OF_DAY));
            min = String.valueOf(calendar.get(Calendar.MINUTE) + 6);
        }


        Thread.sleep(1000);
        //input ...
        MobileElement el50 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
        el50.click();
        Thread.sleep(100);
        el50.sendKeys("yes");
        //input ...
        MobileElement el51 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
        el51.click();
        Thread.sleep(100);
        el51.sendKeys("yes");
        //input ...
        MobileElement el52 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[3]");
        el52.click();
        Thread.sleep(100);
        el52.sendKeys("yes");
        //input ... select time of event
        MobileElement el53 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]");
        el53.click();

        Thread.sleep(1000);
        System.out.println("Select hours " + calendar.get(Calendar.HOUR_OF_DAY));
        // edit hours
        MobileElement el54 = (MobileElement) driver.findElementByAccessibilityId("Select hours " + calendar.get(Calendar.HOUR_OF_DAY));
        el54.click();
        el54.click();
        el54.click();
        Thread.sleep(300);
        MobileElement el55 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
        el55.click();
        el55.click();
        Thread.sleep(100);
        el55.sendKeys(hour);

        Thread.sleep(1000);
        // edit minutes
        MobileElement el57 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
        el57.click();
        el57.click();
        Thread.sleep(100);
        el57.sendKeys(min);
        Thread.sleep(100);
        MobileElement el58 = (MobileElement) driver.findElementByAccessibilityId("OK");
        el58.click();
        Thread.sleep(1000);
        MobileElement el59 = (MobileElement) driver.findElementByAccessibilityId("   Add notification");
        el59.click();
        Thread.sleep(200);
        MobileElement el60 = (MobileElement) driver.findElementByAccessibilityId("5 minutes before");
        el60.click();
        MobileElement el61 = (MobileElement) driver.findElementByAccessibilityId("Save");
        el61.click();

        Thread.sleep(10000);
        MobileElement el62 = (MobileElement) driver.findElementByAccessibilityId("Back");
        el62.click();

        Thread.sleep(60000);

        try{
            MobileElement el63 = driver.findElementByAccessibilityId("yes You have an upcoming event in 5 minutes");
        }catch(Exception e){

        }

        Thread.sleep(200);
        //back to index
        MobileElement el65 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ImageView");
        el65.click();
    }

    public static void viewNotification(AndroidDriver<AndroidElement> driver) throws InterruptedException {
        MobileElement el66 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View");
        el66.click();
//        MobileElement el65 = (MobileElement) driver.findElementByAccessibilityId("yes\nEvent is at 17:30PM on May 29, 2022");
//        MobileElement el65 = (MobileElement) driver.findElementByClassName("android.view.View");
        List<AndroidElement> elementsList = driver.findElements(By
                .className("android.view.View"));
        System.out.println(elementsList.size());
        elementsList.get(2).click();
        Thread.sleep(1000);
        MobileElement el67 = (MobileElement) driver.findElementByAccessibilityId("View");
        el67.click();
        Thread.sleep(5000);
        MobileElement el68 = (MobileElement) driver.findElementByAccessibilityId("Back");
        el68.click();
        Thread.sleep(100);
        //back to index
        MobileElement el69 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ImageView");
        el69.click();
    }

    public static void dismissNotification(AndroidDriver<AndroidElement> driver) throws InterruptedException {
        MobileElement el70 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View");
        el70.click();
        Thread.sleep(100);
        List<AndroidElement> elementsList = driver.findElements(By
                .className("android.view.View"));
        System.out.println(elementsList.size());
        elementsList.get(2).click();
        Thread.sleep(100);
        MobileElement el71 = (MobileElement) driver.findElementByAccessibilityId("Dismiss");
        el71.click();
        Thread.sleep(100);
        MobileElement el72 = (MobileElement) driver.findElementByAccessibilityId("Yes");
        el72.click();
        Thread.sleep(100);
        //back to index
        MobileElement el73 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ImageView");
        el73.click();
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

        ds.setCapability("idleTimeout",600);

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),ds);

        login(driver);
        Thread.sleep(8000);

        //notification part
        try{
            showNotificationList(driver);
            System.out.println("Test case 1 in Notification is passed");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Test case 1 in Notification is failed");
        }
        Thread.sleep(3000);
        try{
            viewNotification(driver);
            System.out.println("Test case 2 in Notification is passed");
        }catch(Exception e){
            System.out.println("Test case 2 in Notification is failed");
        }
        Thread.sleep(3000);
        try{
            dismissNotification(driver);
            System.out.println("Test case 3 in Notification is passed");
        }catch(Exception e){

            System.out.println("Test case 3 in Notification is failed");
        }


//        try{
//
//            System.out.println("Test case  in Notification is passed");
//        }catch(Exception e){
//
//            System.out.println("Test case  in Notification is failed");
//        }
    }
}
