import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public static   WebDriver driver ;
    @BeforeClass
    public static void Base () {

        /*driver = new ChromeDriver();*/

        /*System.setProperty("webdriver.ie.driver","C:\\Users\\Goncalo\\Desktop\\drivers\\IEDriverServer.exe");
        DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
        capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        capability.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);

        driver=new InternetExplorerDriver();
        */

        System.setProperty("webdriver.gecko.driver","C:\\Users\\goncalo.queimado\\Desktop\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

    }
    @AfterClass
    public static void Teardown() {

        driver.close();
    }
    
    public static void New(){
    }
    
    public static void ChangeTab() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Set<String> handles = driver.getWindowHandles();
        String currentHandle = driver.getWindowHandle();
        for (String handle : handles) {

            if (!handle .equals(currentHandle))
            {
                driver.switchTo().window(handle);
            }
        }
    }
}
