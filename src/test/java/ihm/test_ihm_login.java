package ihm;

//import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;

//import org.junit.jupiter.api.Test;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test_ihm_login {

	//@Ignore
	@Test
	public void test() {
		write_file_test wr=new write_file_test();
		String Form = null,footer = null,button = null,nav = null,titre=null;
		System.setProperty("webdriver.gecko.driver", "src\\test\\ressources\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8080/login");
		try {
		if(driver.findElement(By.className("form-control")) != null) {
			Form="Formulaires Login/Mot de passe en position";
			
		}}
		catch (Exception e) {
			 Form=" Formulaires introuvables";
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
		System.out.println(Form);
		System.out.println(footer);
		System.out.println(button);
		System.out.println(nav);
		System.out.println(titre);
		wr.openfile1();
		wr.write_file1(Form, footer, button, nav, titre);
		wr.close1();
		
	}
}
	

	
	
	
	

