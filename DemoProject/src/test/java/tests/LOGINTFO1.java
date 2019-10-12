package tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LOGINTFO1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
   // driver = new FirefoxDriver();
    //System.setProperty("webdriver.chrome.driver", "F:\\selenium class\\Software\\chromedriver.exe");
    //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\executable\\chromedriver_linux64\\chromedriver");
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver");  
	   driver =new ChromeDriver();
	   driver.manage().window().maximize();
   // baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    System.out.print("browser Launch");
  }

  @Test
  public void testLOGINTFO1() throws Exception {
    driver.get("http://52.66.204.99:8080/TradeFinOps/logout.jsf");
    System.out.print("Appication Launch");
    driver.findElement(By.linkText("Click here to login again")).click();
    driver.findElement(By.id("j_username")).click();
    driver.findElement(By.id("j_username")).clear();
    driver.findElement(By.id("j_username")).sendKeys("pmeuser");
    driver.findElement(By.id("j_password")).clear();
    driver.findElement(By.id("j_password")).sendKeys("pass");
    driver.findElement(By.id("login")).click();
    driver.findElement(By.name("userInfoForm:j_idt44")).click();
    new Select(driver.findElement(By.name("userInfoForm:j_idt44"))).selectByVisibleText("Purchase");
    driver.findElement(By.name("userInfoForm:j_idt44")).click();
    try {
      assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='TradeFinOps'])[1]/following::label[1]")).getText(), "Welcome pme User");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Logistics")).click();
    driver.findElement(By.linkText("Finance")).click();
    driver.findElement(By.linkText("Reports")).click();
    driver.findElement(By.linkText("Operation")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Welcome pme User'])[1]/following::img[2]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
