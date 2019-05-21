import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WebCromeDriverTest {
    WebDriver driver;
    String pagetitle;
    String baseURL ="http://www.google.com";

    @BeforeTest
    public void setupBase(){
      driver = new ChromeDriver();
      driver.get(baseURL);
    }
     @Test
     public void verifySearchWithCrome() {
     // System.setProperty("webdriver.chrome.driver", "SYSTEM PATH");
      //System.setProperty("webdriver.chrome.driver", "D:\\Google\\ChromeDriver\\chromedriver.exe");
      WebElement element = driver.findElement(By.name("q"));
      element.sendKeys("Cheese!\n");
      element.submit();

       // wait until the google page shows the result
     WebElement myDynamicElement = (new WebDriverWait(driver, 10))
     .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));

          List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));

          // this are all the links you like to visit
          for (WebElement webElement : findElements)
          {
          System.out.println(webElement.getAttribute("href"));
          }
     }
     @AfterTest
     public void tearDown(){
      driver.quit();
     }
   }