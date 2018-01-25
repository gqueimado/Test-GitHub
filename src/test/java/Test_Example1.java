import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class Test_Example1 extends BasePage {
    @Test

    public void main() {

        driver.get("https://www.google.pt/");
        System.out.print(driver.getTitle());
        WebElement google = driver.findElement(By.id("lst-ib"));
        google.sendKeys("alten uk");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='sbqs_c' and text()='alten uk']//ancestor::div[@id='sbse0']")).click();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='ALTEN - Technology consulting and engineering']")).click();
        driver.findElement(By.className("logo")).isDisplayed();
        driver.findElement(By.id("footer")).isDisplayed();
        String ex = driver.findElement(By.id("footer")).getText();
        System.out.print(ex);
        /*WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com"); */

    }
}
