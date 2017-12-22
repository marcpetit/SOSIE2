package fr.feukwa.test;

import org.junit.Ignore;
import org.junit.Test;

import fr.feukwa.main.sources.OperationThrowableTest;

/**
 * 
 * @author JF45E37N
 * 
 *permet de vérifeir qu'une méthode lève l'exception attendue
 */
public class TestThrowable {
	
	/**
	 * ce test passe car il lève bien l'eceptoion sur le nombre d'argument comme
	 * attendue
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testDiviserAvecUnNombre(){
		OperationThrowableTest.diviser(1);
	}
	
	/**
	 * ce test passe car il y a bien une exception de l'ordre arithmétique
	 */
	@Test(expected=ArithmeticException.class)
	public void testDiviserAvecdeuxBombresDontUnZero(){
		OperationThrowableTest.diviser(1,0);
	}
	
	/**
	 * ce test échoue car cette exécution n'engendre pas d'exception 
	 * ce qui étaitr attendue à travers "expected=ArithmeticException.class"
	 */
	@Ignore
	@Test(expected=ArithmeticException.class)
	public void divisionAvecDeuxNombres() {
		OperationThrowableTest.diviser(1,10);
	}
}
