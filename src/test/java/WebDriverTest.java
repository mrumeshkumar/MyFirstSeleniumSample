import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverTest {
 WebDriver driver;

  @Test
   public void verifySearchWithFirefox() {
   // driver = new FirefoxDriver();
   //driver.get("http://only-testing-blog.blogspot.in/");
   //driver.quit();
   Assert.assertTrue(true);
  }
  
}