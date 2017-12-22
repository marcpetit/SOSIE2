package fr.feukwa.test;

import java.io.Serializable;

import org.hamcrest.core.AllOf;
import org.hamcrest.core.AnyOf;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsInstanceOf;
import org.hamcrest.core.IsNot;
import org.hamcrest.core.IsNull;
import org.hamcrest.core.IsSame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import fr.feukwa.main.sources.ClassePrincipaleTest;

/**
 * 
 * @author JF45E37N
 *
 *cette classe pour les tests est destinée à centraliser le maximum d'outil utilisé dans un test JUnit standard
 */
public class TestClassePrincipale {
	
	/**
	 * cette méthode va s'exécuter AVANT tous les tests de la série
	 */
	@BeforeClass
	public static void testAvantTousLesTestsDeLaClasse(){
		System.out.println("--------**********-------");
        System.out.println(" \"AVANT\" TOUS LES TESTS");
	}
	
	/**
	 * cette méthode va s'exécuter APRES tous les tests de la série
	 */
	@AfterClass
	public static void testApresTousLesTestsDeLaClasse(){
		System.out.println("--------**********-------");
        System.out.println(" \"APRES\" TOUS LES TESTS");
	}
	
	
	/**
	 * Cette méthode est exécutée avant chaque test
	 */
	@Ignore
	@Before
	public void testAvantTousLesTets(){
		System.out.println("------------------------");
        System.out.println("Avant chaque Test");
	}
	
	@Ignore
	@After
	public void testApresChaqueTest(){
		System.out.println("------------------------");
        System.out.println("Après chaque Test");
	}
	
	/**
	 * @Ignore permet d'ignorer le test
	 */
	@Ignore
	@Test
	public void testPremierTest(){
		System.out.println("le premier test Test");
	}
	
	@Ignore
	@Test
	public void testUnSecondTest(){
		System.out.println("le second test Test");
	}
	
	
	
	/**
	 * Test d'assertion pour les doubles avec un Delta
	 */
	@Test
    public void testValeursExactementEgales() {
        final double lResultat = ClassePrincipaleTest.soustraire(5, 2.5);
        Assert.assertEquals(2.5, lResultat, 0);
    }

    @Test
    public void testValeursAvecUneLegereDifference() {
        final double lResultat = ClassePrincipaleTest.soustraire(71.19, 98);
        Assert.assertEquals(-26.81, lResultat, 0.005);
    }

    @Test
    public void testValeursAvecUneDifferenceTropImportante() {
        final double lResultat = ClassePrincipaleTest.soustraire(1, 2);
        Assert.assertEquals(-1, lResultat, 0);
    }
    
    /**
     * ASSERTION SUR UNE CONDITION DEFINIE PAR CONTRAT
     * Pour que l'assertion soit juste, il faut que le contrat soit vérifié.
     */
    
    /**
     * Assertion définie par contrat "IsSame"
     * Le contrat vérifie que l'instance passée en premier paramètre de l'assertion 
     * et celle passée en paramètre du contrat sont les mêmes.
     */
    @Test
    public void testPareil() {
        // Remarque : c'est la même instance à cause du cache
        Assert.assertThat("texte", IsSame.sameInstance("texte"));
    }
    
    @Ignore
    @Test
    public void testPasPareil() {
        // Remarque : ce n'est pas la même instance parce que new String() force une nouvelle instance.
        Assert.assertThat(new String("texte"), IsSame.sameInstance("texte"));
    }
    
    
    /**
     * Assertion définie par contrat "ISEqual" 
     * Le contrat vérifie que l'instance passée en premier paramètre de 
     * l'assertion et celle passée en paramètre du contrat sont égales.
     */
    @Test
    public void testEgal1() {
    	// Remarque: ici il ya égalité par utilisation du cache
        Assert.assertThat("texte", IsEqual.equalTo("texte"));
    }

    @Test
    public void testEgal2() {
        Assert.assertThat(new String("texte"), IsEqual.equalTo("texte"));
    }
    
    @Ignore
    @Test
    public void testPasEgal1() {
    	//Remarque : "Texte" est différent de "texte"
        Assert.assertThat("Texte", IsEqual.equalTo("texte"));
    }
    
    @Ignore
    @Test
    public void testPasEgal2() {
    	//Remarque : "Texte" est différent de "texte" et aussi new string() force la création d'une nouvelle instance
        Assert.assertThat(new String("Texte"), IsEqual.equalTo("texte"));
    }
    
    /**
     * Assertion définie par contrat "IsInstanceOf" 
     * Le contrat vérifie que l'instance passée en premier paramètre de 
     * l'assertion est de la classe passée en paramètre du contrat.
     */
    @Test
    public void classeDeString() {
        Assert.assertThat("texte", IsInstanceOf.instanceOf(String.class));
    }

    @Test
    public void classeDeSerializable() {
        Assert.assertThat("texte", IsInstanceOf.instanceOf(Serializable.class));
    }

    @Test
    public void classeDeCharSequence() {
        Assert.assertThat("texte", IsInstanceOf.instanceOf(CharSequence.class));
    }
    
    @Ignore
    @Test
    public void classeDeInteger() {
    	//Remarque : "texte" n'est pas un objet de la classe "Integer"
        Assert.assertThat("texte", IsInstanceOf.instanceOf(Integer.class));
    }
    
    
    /**
     * Assertion définie par contrat "IsNull" 
     * Le contrat vérifie que la référence passée en premier paramètre de l'assertion est null ou n'est pas null.
     */
    @Test
    public void testValeurNull1(){
    	final String chaine=null;
    	Assert.assertThat(chaine,IsNull.nullValue());
    }
    
    @Ignore
    @Test
    public void testValeurNull2() {
    	//Remarque : "texte" est différent de "null
        final String chaine = "texte";
        Assert.assertThat(chaine, IsNull.nullValue());
    }
    
    @Ignore
    @Test
    public void testValeurPasNull1() {
    	//Remarque : "null" est bel et bien "null"
        final String chaine = null;
        Assert.assertThat(chaine, IsNull.notNullValue());
    }

    @Test
    public void testValeurPasNull2() {
        final String lTexte = "texte";
        Assert.assertThat(lTexte, IsNull.notNullValue());
    }
    
    
    /**
     * Assertion définie par contrat "Is"
     * Le contrat vérifie que l'instance passée en premier paramètre correspond à 
     * ce qui est passé (classe, valeur, autre contrat) en paramètre du contrat. 
     * Ce contrat n'apporte pas de nouveau type de contrat.
     */
    @Test
    @SuppressWarnings(value = { "deprecation" })
    public void testClasseDeString(){
    	Assert.assertThat("texte", Is.is(String.class));
    }
    
	@Test
    @SuppressWarnings("deprecation")
    public void testClassInteger(){
    	final int entier=12;
    	//Remarque : si on passe une classe, cela correspond à un contrat "classe de l'instance"
    	Assert.assertThat(entier, Is.is(Integer.class));
    }
    
    @Test
    public void testEgal() {
    	//Remarque : si on passe une valeur, cela correspond à un contrat "égalité"
        Assert.assertThat("texte", Is.is("texte"));
    }
    
    @Ignore
    @Test
    public void testPasEgal() {
    	//Remarque : contrat de type "égalité" mais  "Texte" est différent de "texte"
        Assert.assertThat("Texte", Is.is("texte"));
    }

    @Test
    public void testPareil2() {
        Assert.assertThat("texte", IsSame.sameInstance("texte"));
    }
    
    @Test
    public void testPareil2Bis() {
        Assert.assertThat("texte", Is.is(IsSame.sameInstance("texte")));
    }
    
    @Ignore
    @Test
    public void testPasPareil2() {
        Assert.assertThat(new String("texte"), Is.is(IsSame.sameInstance("texte")));
    }
    
    
    /**
     * Assertion définie par contrat "IsNot"
     * Le contrat vérifie que l'instance passée en premier paramètre ne correspond pas à ce qui 
     * est passé (valeur ou autre contrat) en paramètre du contrat. Ce contrat n'apporte pas de nouveau type de contrat 
     */
    @Ignore
    @Test
    public void testEgal3() {
    	//Remarque passage par valeur (test qui échoue comme attendu)
        Assert.assertThat("texte", IsNot.not("texte"));
    }
    
    @Ignore
    @Test
    public void testPasEgal3() {
        Assert.assertThat("Texte", IsNot.not("texte"));
    }
    
    @Ignore
    @Test
    public void testPareil3() {
    	// Remarque : passage par contrat en paramètre du contrat
        Assert.assertThat("texte", IsNot.not(IsSame.sameInstance("texte")));
    }

    @Test
    public void testPasPareil3() {
        Assert.assertThat(new String("texte"), IsNot.not(IsSame.sameInstance("texte")));
    }
    
    /**
     * Assertion définie avec le contrat "AllOf" 
     * Le contrat vérifie que TOUS les contrats passés en paramètre du contrat sont respectés.
     */
    @Test
    public void testClasseDeStringEtEgal(){
    	//Remarque : On vérifie que "texte" est un objet de la classe "String" et vaut "texte"
    	Assert.assertThat("texte", AllOf.allOf(IsInstanceOf.instanceOf(String.class),IsEqual.equalTo("texte")));
    }
    
    @Test
    public void testClasseIntegerEtEgal(){
    	final int entier=1;
    	Assert.assertThat(entier, AllOf.allOf(IsInstanceOf.instanceOf(Integer.class),IsEqual.equalTo(1)));
    }
    
    @Ignore
    @Test
    public void testClasseDeStringEtPasEgal() {
    	// Remarque : le premier contrat réussit (objet de "String") "Texte" est différent de "texte" (le test échoue comme prévueé)
        Assert.assertThat("texte", AllOf.allOf(
                IsInstanceOf.instanceOf(String.class), IsEqual.equalTo("Texte")
        ));
    }

    @Test
    public void tetClasseDePasIntegerEtEgal() {
        Assert.assertThat("texte", AllOf.allOf(
                IsNot.not(IsInstanceOf.instanceOf(Integer.class)), IsEqual.equalTo("texte")
        ));
    }

    @Test
    public void testClasseDeStringEtPasPasEgal() {
        Assert.assertThat("texte", AllOf.allOf(
                IsInstanceOf.instanceOf(String.class), IsNot.not(IsEqual.equalTo("Texte"))
        ));
    }
    
    /**
     * Assertion définie avec le contrat "AllOf" 
     * Le contrat vérifie que AU MOINS UN des contrats passés en paramètre du contrat sont respectés.
     */
    @SuppressWarnings("unchecked")
	@Test
    public void testClasseDeStringEtEgal2() {
        Assert.assertThat("texte", AnyOf.anyOf(
                IsInstanceOf.instanceOf(String.class), IsEqual.equalTo("texte")));
    }

    @SuppressWarnings("unchecked")
	@Test
    public void testClasseDeIntegerEtEgal() {
        Assert.assertThat("texte", AnyOf.anyOf(
                IsInstanceOf.instanceOf(Integer.class), IsEqual.equalTo("texte")
        ));
    }
    
    @SuppressWarnings("unchecked")
    @Test
    public void testClasseDeStringEtPasEgal2() {
        Assert.assertThat("texte", AnyOf.anyOf(
                IsInstanceOf.instanceOf(String.class), IsEqual.equalTo("Texte")
        ));
    }
    
    @Ignore
    @SuppressWarnings("unchecked")
    @Test
    public void testClasseDeIntegerEtPasEgal() {
    	// Remarque : ce test échoue comme prévue car "texte" n'est ni "Integer" ni égale à "Texte"
        Assert.assertThat("texte", AnyOf.anyOf(
                IsInstanceOf.instanceOf(Integer.class), IsEqual.equalTo("Texte")
        ));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
