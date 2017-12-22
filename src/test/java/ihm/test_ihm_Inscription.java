package ihm;

//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test_ihm_Inscription {

	//@Ignore
	@Test
	public void test() {
		System.setProperty("webdriver.gecko.driver", "src\\test\\ressources\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8080/inscription");
		write_file_test wr=new write_file_test();
		String firstname = null,lastname = null,mail = null,statut1 = null,statut2=null,statut3=null,photo=null,
		username=null,password=null,Form = null,footer = null,button = null,nav = null,titre=null;
		try {
		if(driver.findElement(By.id("firstNam")) != null) {
			firstname= "champs firstname en position";
			
		}}
		catch (Exception e) {
			firstname= "champs Firstname introuvable";
		}
		try {
		if(driver.findElement(By.id("lastName")) != null) {
		lastname="champs lastname en position";
			
		}}
		catch (Exception e) {
			lastname="Formulaires lastname introuvable";
		} 
		
		try {
	
		if(driver.findElement(By.id("mail")) != null) {
			mail="champs mail en position";
			
		}}
		catch (Exception e) {
			mail="champs mail en introuvable";
		}
		try {
		if(driver.findElement(By.id("statut1")) != null) {
			statut1="champs Student  en position";
			
		}}
		catch (Exception e) {
			statut1="champs Student introuvable";
		}
		try {
			if(driver.findElement(By.id("statut2")) != null) {
				statut2="champs Teacher  en position";
				
			}}
			catch (Exception e) {
				statut2="champs Teacher introuvable";
			}
		
		try {
			if(driver.findElement(By.id("statut3")) != null) {
				statut3="champs Adminstrator en position";
				
			}}
			catch (Exception e) {
				statut3="champs Teacher introuvable";
			}
		try {
		if(driver.findElement(By.id("photo")) != null) {
			photo="Formulaires photo en position";
			
		}}
		catch (Exception e) {
			photo="champs photo en position";
		} 
		
		try {
		if(driver.findElement(By.id("username")) != null) {
			username="champs username en position";
			
		}}
		catch (Exception e) {
			 username="champs username en position";
		}
		
		try {
		if(driver.findElement(By.id("password")) != null) {
			password="champs password en position";
			
		}}
		catch (Exception e) {
			password="champs password introuvable";
		} 
		
		try {
			if( driver.findElement(By.tagName("footer")) != null) {
				footer="footer en position";
			}}
			catch (Exception e) {
				footer="footer introuvable";
			} 
			
			try {
			if( driver.findElement(By.tagName("button")) != null) {
				button="Bouton Submit en position ";
			}}
			catch (Exception e) {
				button="Bouton Submit introuvable";
			} 
			
			try {
			if( driver.findElement(By.tagName("Nav")) != null) {
				nav="Navbar en position ";
			}}
			catch (Exception e) { nav="Navbar introuvable";}
			
			try {
			if( driver.findElement(By.tagName("h1")) != null) {
				titre="Titre existe ";
			}
			}catch (Exception e)
			{
				titre=" Titre introuvable ";	
			}
			System.out.println(firstname);
			System.out.println(lastname);
			System.out.println(mail);
			System.out.println(statut1);
			System.out.println(statut2);
			System.out.println(statut3);
			System.out.println(photo);
			System.out.println(username);
			
			System.out.println(footer);
			System.out.println(button);
			wr.openfile2();
			wr.write_file2(firstname,lastname,mail,statut1,statut2,statut3,photo,username,password,footer,button,nav,titre);
		    wr.close2();
  
}
}