import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_Example6 {

    @Test
    public void main() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Goncalo\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
        driver.findElement(By.partialLinkText("Partial")).click();
        String Submit = driver.findElement(By.tagName("button")).toString();
        System.out.println(Submit);
        driver.findElement(By.linkText("Link Test")).click();
        System.out.println("Link Test Pass");
        driver.close();


        // Right Click

        /*Actions act = new Actions(driver); // where driver is WebDriver type
        act.moveToElement(webElement).perform();
        act.contextClick().perform();*/

        //Drag and Drop
        /*Actions act = new Actions(driver);
         WebElement source = driver.findElement(By.xpath(“ -----”)); //source ele which you want to drag
         WebElement target = driver.findElement(By.xpath(“ -----”)); //target where you want to drop
         act.dragAndDrop(source,target).perform();
         */
    }
}
