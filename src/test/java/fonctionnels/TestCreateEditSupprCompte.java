package fonctionnels;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCreateEditSupprCompte {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.gecko.driver","src\\test\\ressources\\geckodriver.exe");
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
  }

  //@Ignore
  @Test
  public void testCreateEtEditeCompte() throws Exception {
    driver.get("http://localhost:8080/login");
    driver.findElement(By.linkText("Create an account")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("firstName")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("firstName")).clear();
    driver.findElement(By.id("firstName")).sendKeys("Dupont");
    Thread.sleep(2000);
    driver.findElement(By.id("lastName")).clear();
    driver.findElement(By.id("lastName")).sendKeys("Junior");
    Thread.sleep(2000);
    driver.findElement(By.id("mail")).click();
    driver.findElement(By.id("mail")).clear();
    driver.findElement(By.id("mail")).sendKeys("dupontjunior@isty.com");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//form[@action='/inscription']")).click();
    driver.findElement(By.id("statut2")).click();
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("111");
    Thread.sleep(2000);
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("111");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("111");
    Thread.sleep(2000);
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("111");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div")).click();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Editer")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("firstName")).click();
    driver.findElement(By.id("firstName")).click();
    driver.findElement(By.id("firstName")).clear();
    driver.findElement(By.id("firstName")).sendKeys("DUPONT HENRY");
    Thread.sleep(1000);
    driver.findElement(By.id("lastName")).clear();
    driver.findElement(By.id("lastName")).sendKeys("Junior Idriss");
    Thread.sleep(1000);
    driver.findElement(By.id("mail")).clear();
    driver.findElement(By.id("mail")).sendKeys("dupontidriss@uvsq.isty.com");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@value='Edit']")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Supprimer")).click();
    Thread.sleep(2000);
  }

  @After
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