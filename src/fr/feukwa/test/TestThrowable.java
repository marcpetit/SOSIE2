package fr.feukwa.test;

import org.junit.Ignore;
import org.junit.Test;

import fr.feukwa.main.sources.OperationThrowableTest;

/**
 * 
 * @author JF45E37N
 * 
 *permet de v�rifeir qu'une m�thode l�ve l'exception attendue
 */
public class TestThrowable {
	
	/**
	 * ce test passe car il l�ve bien l'eceptoion sur le nombre d'argument comme
	 * attendue
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testDiviserAvecUnNombre(){
		OperationThrowableTest.diviser(1);
	}
	
	/**
	 * ce test passe car il y a bien une exception de l'ordre arithm�tique
	 */
	@Test(expected=ArithmeticException.class)
	public void testDiviserAvecdeuxBombresDontUnZero(){
		OperationThrowableTest.diviser(1,0);
	}
	
	/**
	 * ce test �choue car cette ex�cution n'engendre pas d'exception 
	 * ce qui �taitr attendue � travers "expected=ArithmeticException.class"
	 */
	@Ignore
	@Test(expected=ArithmeticException.class)
	public void divisionAvecDeuxNombres() {
		OperationThrowableTest.diviser(1,10);
	}
}
