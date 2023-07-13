import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.Set;


import java.sql.Time;
import java.time.Duration;

public class main {

    public static void main(String[] args){

        FirefoxDriver driver = new FirefoxDriver();

        driver.get("insert url here");

        driver.findElement(By.cssSelector("insert button id here")).click();


        try{
            Thread.sleep(10000);
        }
        catch (InterruptedException e){

            e.printStackTrace();
        }

        driver.findElement(By.cssSelector("insert button id here")).click();

        String parentWindow = driver.getWindowHandle(); // Get the handle of the parent window
        Set<String> windowHandles = driver.getWindowHandles(); // Get all available window handles




        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(parentWindow)) {

                driver.switchTo().window(windowHandle);

                try{
                    Thread.sleep(2500);
                }
                catch (InterruptedException e){

                    e.printStackTrace();
                }
                driver.findElement(By.id("enter id here")).sendKeys("enter email here");
                break;
            }
        }


    }
}




