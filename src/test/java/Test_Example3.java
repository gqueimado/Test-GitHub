import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Test_Example3 extends BasePage {
    @Test
    public void main() throws InterruptedException {
        //driver.manage().window().setSize(new Dimension(1366, 768));
        driver.get("http://www.alten.com");
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("(//a[text()='Sectors' and @href='#'])[1]"));
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//a[@href='http://www.alten.com/operations/the-technology-partner/telecoms']//ancestor::li[@id='menu-item-2897']"))).click().build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//h2[text()='Telecoms']")).isDisplayed();

    }
}
