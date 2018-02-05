import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Example5 extends BasePage {
    @Test

    public void main() {


        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
        driver.findElement(By.name("firstname")).sendKeys("Goncalo");
        driver.findElement(By.name("lastname")).sendKeys("Zé");
        driver.findElement(By.id("submit")).click();
        driver.close();

    }
}
