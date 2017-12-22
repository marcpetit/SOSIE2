package fr.feukwa.test;

import org.junit.Ignore;
import org.junit.Test;

import fr.feukwa.main.sources.DureeLimiteTest;

/**
 * 
 * @author JF45E37N
 *
 *Permet de v�rifeir la dur�e de l'ex�cution d'un test
 */
public class TestDureeLimite {
	
	/**
	 * ce test passe car il se d�roule enti�rement en mois de 100ms
	 */
	@Test(timeout=100)
	public void testDureeRespectee(){
		System.out.print("la dur�e du test est respect�e");
	}
	
	/**
	 * ce test �choue car l'addition prend plus de 100ms (car un thread.sleep()) a �t� introduit dans 
	 * la m�thode additionner() de la classe DureeLimiteTest qui est appel�e au cours du test.
	 * 
	 * l'annotation @Ignore permet d'ignorer le test et de faire passer la suite des autres tests de la s�rie
	 * 
	 * @throws InterruptedException
	 */
	@Ignore
	@Test(timeout=100)
	public void testDureeDepassee() throws InterruptedException{
		DureeLimiteTest dlt=new DureeLimiteTest();
		dlt.additionner(1,2);
	}
}
