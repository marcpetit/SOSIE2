package fr.feukwa.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fr.feukwa.main.sources.SuiteDetestpartie1Test;
import fr.feukwa.main.sources.SuiteDetestpartie2Test;

/**
 * 
 * @author JF45E37N
 *
 *Cette classe est conçu uniquement pour permettre de lancer un enseimble de tests.
 *l'annotation @RunWith(Suite.class) permet de préciser que la classe est vide et 
 *n'est uliliser que pour lancer une suite de tests.
 */
@RunWith(Suite.class)
@SuiteClasses({SuiteDetestpartie1Test.class,SuiteDetestpartie2Test.class})
public class TestSuiteDeTest {
	
}
