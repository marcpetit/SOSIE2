package fonctionnels;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCreerUE {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.gecko.driver","src\\test\\ressources\\geckodriver.exe");
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  //@Ignore
  @Test
  public void testCreerUE() throws Exception {
    driver.get("http://localhost:8080/login");
    Thread.sleep(2000);
    driver.findElement(By.linkText("Create an account")).click();
    driver.findElement(By.id("firstName")).click();
    driver.findElement(By.id("firstName")).clear();
    driver.findElement(By.id("firstName")).sendKeys("FEUKWA");
    Thread.sleep(2000);
    driver.findElement(By.id("lastName")).clear();
    driver.findElement(By.id("lastName")).sendKeys("marcel");
    Thread.sleep(1000);
    driver.findElement(By.id("mail")).clear();
    driver.findElement(By.id("mail")).sendKeys("marcelfeukwa@ens.uvsq.fr");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.id("statut1")).click();
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("username")).sendKeys("111");
    driver.findElement(By.id("password")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("password")).sendKeys("111");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("Create an account")).click();
    driver.findElement(By.id("firstName")).click();
    driver.findElement(By.id("firstName")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("firstName")).sendKeys("PETIT");
    Thread.sleep(2000);
    driver.findElement(By.id("lastName")).clear();
    driver.findElement(By.id("lastName")).sendKeys("Marc");
    driver.findElement(By.id("mail")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("mail")).sendKeys("marcpetit@uvsq.fr");
    driver.findElement(By.id("statut2")).click();
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("username")).sendKeys("222");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("222");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).clear();
    Thread.sleep(1000);
    driver.findElement(By.name("username")).sendKeys("111");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("111");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Unité d'enseignement")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@value='Ajouter']")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("identifiant")).click();
    driver.findElement(By.id("identifiant")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("identifiant")).sendKeys("ARLO");
    driver.findElement(By.id("nom")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("nom")).sendKeys("archi logicielle");
    driver.findElement(By.id("firstname")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("firstname")).sendKeys("PETIT");
    driver.findElement(By.id("lastname")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("lastname")).sendKeys("Marc");
    Thread.sleep(2000);
    driver.findElement(By.id("description")).clear();
    driver.findElement(By.id("description")).sendKeys("archi logicielle IATIC5");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Del")).click();
    driver.findElement(By.linkText("Profile")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Supprimer")).click();
    Thread.sleep(2000);
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).clear();
    Thread.sleep(2000);
    driver.findElement(By.name("username")).sendKeys("222");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("222");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Supprimer")).click();
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
