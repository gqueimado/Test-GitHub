import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Example {
    @Test

    public void main() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Goncalo\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.pt/");
        driver.findElement(By.xpath("//body[@id='gsr']")).isDisplayed();
        driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("alten uk");
        String ex = driver.findElement(By.xpath("//div[@id='footer']")).getText();
        System.out.print(ex);
        driver.findElement(By.xpath("//input[@id='lst-ib']")).clear();
        driver.findElement(By.xpath("//input[@id='lst-ib']")).click();
        driver.close();
    }
}


