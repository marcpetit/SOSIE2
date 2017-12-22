package fr.feukwa.main.sources;

/**
 *
 * @author JF45E37N
 *
 *Cette classe est faite pour centraliser les différentes méthodes qui vont être testées
 *dans la classe principale des test "TestClassePrincipale"
 */
public class ClassePrincipaleTest {
	
	/**
	 * Asserttion avec le Delta(intervalle où doit se trouver le résultat pour être considéré comme bon)
	 */
	public static double soustraire(final double...pNombres) {
        if(pNombres.length < 2) {
            throw new IllegalArgumentException(
                    "Il faut au moins deux nombres en entrée");
        }
        double lRetour = pNombres[0];
        for(int i=1;i<pNombres.length;i++) {
            lRetour -= pNombres[i];
        }
        return lRetour;
    }
    
	
}
