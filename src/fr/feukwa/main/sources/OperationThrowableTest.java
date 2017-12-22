package fr.feukwa.main.sources;

public class OperationThrowableTest {
    public static long diviser(final long...pNombres) {
        if(pNombres.length < 2) {
            throw new IllegalArgumentException(
                    "Il faut au moins deux nombres en entrée");
        }
        long lRetour = pNombres[0];
        for(int i=1;i<pNombres.length;i++) {
            lRetour /= pNombres[i];
        }
        return lRetour;
    }
    
}
