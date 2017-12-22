package fr.feukwa.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import fr.feukwa.main.sources.CasDeTestAvecParametres;

/**
 * 
 * @author JF45E37N
 *
 *Les tests paramétrés permettent d'exécuter plusieurs fois un cas de tests avec des valeurs différentes. 
 *Le cas de test doit être annoté avec @RunWith avec pour valeur Parameterized (c'est à dire @RunWith(parameterized.class). 
 *Les paramètres sont indiqués par une méthode annotée avec @Parameters retournant une Collection. 
 *Le cas de tests paramétrés doit comporter un constructeur correspondant aux paramètres
 */
@RunWith(Parameterized.class)
public class TestCasDeTestAvecParametres {
    private long resultatAddition;
    private long resultatMultiplication;
    private long[] nombres;
	
	/**
	 * Cette méthode(qui est obligatoire et anotée avec @Parameters) permet d'initialiser tous les paramètres des tests
	 * @return une collection d'object
	 */
    @Parameters
    public static List<Object[]> getParametres() {
        return Arrays.asList(new Object[][] {
                { 10L, 0L, new long[] { 10L, 0L } },
                { 30L, 200L, new long[] { 10L, 20L } },
                { 7936L, 1125899906842624L, new long[] { 256L, 512L, 1024L, 2048L, 4096L } }, 
        });
    }
    
    
    /**
     *Le constructeur de la classe est obligatoire et correspond aux paramètres
     * 
     * @param pResultatAddition
     * @param pResultatMultiplication
     * @param pNombres
     */
    public TestCasDeTestAvecParametres(long pResultatAddition, long pResultatMultiplication, long[] pNombres) {
        setResultatAddition(pResultatAddition);
        setResultatMultiplication(pResultatMultiplication);
        setNombres(pNombres);
    }
    
    @Test
    public void testAddition() {
    	System.out.println("addition :      - attendu : " + getResultatAddition() + 
                         "\n                - nombres : " + Arrays.toString(getNombres()));
        final long lAddition = CasDeTestAvecParametres.additionner(getNombres());
        Assert.assertEquals(getResultatAddition(), lAddition);
    }

    @Test
    public void testMutiplication() {
    	System.out.println("mutiplication : - attendu : " + getResultatMultiplication() + 
                         "\n                - nombres : " + Arrays.toString(getNombres()));
        final long lMultiplication = CasDeTestAvecParametres.multiplier(getNombres());
        Assert.assertEquals(getResultatMultiplication(), lMultiplication);
    }


	public long getResultatAddition() {
		return resultatAddition;
	}


	public void setResultatAddition(long resultatAddition) {
		this.resultatAddition = resultatAddition;
	}


	public long getResultatMultiplication() {
		return resultatMultiplication;
	}


	public void setResultatMultiplication(long resultatMultiplication) {
		this.resultatMultiplication = resultatMultiplication;
	}


	public long[] getNombres() {
		return nombres;
	}


	public void setNombres(long[] nombres) {
		this.nombres = nombres;
	}

}
