import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class Test_Example2 extends BasePage {
    @Test
    public void main()   {

        driver.get("http://www.alten.com");
        WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
        search.sendKeys("Testing");
        search.clear();
        search.sendKeys("Testing");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//*[text()[contains(.,'Insights by ALTEN')]]")).click();
        driver.findElement(By.xpath("//a[text()='Back']")).click();
        driver.findElement(By.xpath("//*[text()[contains(.,'ALTEN becomes first ISTQB')]]")).click();
        ChangeTab();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//*[@id='plugin']")).isDisplayed();
        //driver.close();
        //driver.switchTo().window(currentHandle);


    }
}
