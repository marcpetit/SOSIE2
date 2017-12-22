package ihm;

import java.io.File;
import java.io.FileWriter;
import java.util.*;
import org.junit.*;

public class write_file_test {
	private Formatter x1;
	private Formatter x2;
	
	public void openfile1() {
		try{
			x1=new Formatter("target\\test_ihm_login.txt");	
		}
		catch (Exception e) {
		 //  handle exception
		}
	}
	public void openfile2() {
		try{
			
			x2=new Formatter("target\\test_ihm_inscription.txt");
		}		
		catch (Exception e) {
			//  handle exception
		}
	}
	public void write_file1(String form,String footer,String button,String nav,String titre )
	{
		String t="Test IHM Login";
		x1.format("%s%s %s %s %s %s \n \n", "","","","","",t);
	    x1.format("%s \n %s \n %s \n %s \n %s", form,footer,button,nav,titre);
    }
	
	public void write_file2(String firstname,String lastname ,String mail ,String statut1,String statut2,String statut3,String photo,String username,String password ,String footer ,String button,String nav,String titre) 
	{
		String t="Test IHM INSCRIPTION";
		x2.format("%s %s %s %s %s %s \n \n", "","","","","",t);
    	x2.format("%s \n %s \n %s \n %s \n %s \n %s \n %s \n %s \n %s \n %s \n %s \n %s \n %s ", firstname,lastname,mail,statut1,statut2,statut3,photo,username,password,footer,button,nav,titre);
    }

	 public void close1()
	 {
		 x1.close();	
	 }
	 public void close2()
	 {
		 x2.close();
	 }
}
