package fr.feukwa.test;

import org.junit.Ignore;
import org.junit.Test;

import fr.feukwa.main.sources.DureeLimiteTest;

/**
 * 
 * @author JF45E37N
 *
 *Permet de vérifeir la durée de l'exécution d'un test
 */
public class TestDureeLimite {
	
	/**
	 * ce test passe car il se déroule entièrement en mois de 100ms
	 */
	@Test(timeout=100)
	public void testDureeRespectee(){
		System.out.print("la durée du test est respectée");
	}
	
	/**
	 * ce test échoue car l'addition prend plus de 100ms (car un thread.sleep()) a été introduit dans 
	 * la méthode additionner() de la classe DureeLimiteTest qui est appelée au cours du test.
	 * 
	 * l'annotation @Ignore permet d'ignorer le test et de faire passer la suite des autres tests de la série
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
