package fonctionnels;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestEditerEtCreerSatge {
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
  public void testEditerEtCreerSatge() throws Exception {
    driver.get("http://localhost:8080/login");
    Thread.sleep(2000);
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("999");
    driver.findElement(By.name("password")).clear();
    Thread.sleep(1000);
    driver.findElement(By.name("password")).sendKeys("999");
    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
    Thread.sleep(2000);
    driver.findElement(By.linkText("Stage")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//input[@value='deconnexion']")).click();
    Thread.sleep(2000);
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).clear();
    Thread.sleep(2000);
    driver.findElement(By.name("username")).sendKeys("2211");
    driver.findElement(By.name("password")).clear();
    Thread.sleep(2000);
    driver.findElement(By.name("password")).sendKeys("2211");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(2000);
    driver.findElement(By.name("username")).sendKeys("2211");
    driver.findElement(By.name("password")).clear();
    Thread.sleep(2000);
    driver.findElement(By.name("password")).sendKeys("2211");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Stage")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Créer un stage")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("sujet")).click();
    driver.findElement(By.id("sujet")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("sujet")).sendKeys("Dev");
    driver.findElement(By.id("nomEntreprise")).clear();
    driver.findElement(By.id("nomEntreprise")).sendKeys("Sopra");
    Thread.sleep(1000);
    driver.findElement(By.id("dateDebut")).clear();
    driver.findElement(By.id("dateDebut")).sendKeys("2017/12/18");
    Thread.sleep(1000);
    driver.findElement(By.id("dateFin")).clear();
    driver.findElement(By.id("dateFin")).sendKeys("2017/12/18");
    Thread.sleep(2000);
    driver.findElement(By.id("usernameEnseignantReferant")).clear();
    driver.findElement(By.id("usernameEnseignantReferant")).sendKeys("999");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@value='Edit']")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Stage")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Editer un stage")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("dateDebut")).click();
    driver.findElement(By.id("sujet")).click();
    driver.findElement(By.id("sujet")).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("sujet")).sendKeys("Dev WeB");
    Thread.sleep(3000);
    driver.findElement(By.id("nomEntreprise")).click();
    driver.findElement(By.id("nomEntreprise")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("nomEntreprise")).sendKeys("Sopra Steria");
    Thread.sleep(1000);
    driver.findElement(By.id("dateDebut")).click();
    driver.findElement(By.id("dateDebut")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("dateDebut")).sendKeys("2017/12/18");
    driver.findElement(By.id("dateFin")).click();
    driver.findElement(By.id("dateFin")).clear();
    Thread.sleep(1000);
    driver.findElement(By.id("dateFin")).sendKeys("2018/12/18");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@value='Edit']")).click();
    driver.findElement(By.linkText("Stage")).click();
    driver.findElement(By.linkText("Retour à l'accueil")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@value='deconnexion']")).click();
    Thread.sleep(1000);
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).clear();
    Thread.sleep(1000);
    driver.findElement(By.name("username")).sendKeys("999");
    Thread.sleep(1000);
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("999");
    Thread.sleep(2000);
    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).clear();
    Thread.sleep(2000);
    driver.findElement(By.name("username")).sendKeys("999");
    Thread.sleep(1000);
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("999");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Stage")).click();
    Thread.sleep(4000);
    driver.findElement(By.linkText("Retour à l'accueil")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@value='deconnexion']")).click();
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
