package fr.feukwa.main.sources;

public class OperationsSimpleTest {

    public static long additionner(final long...pNombres) {
        long lRetour = 0;
        for(final long lNombre : pNombres) {
            lRetour += lNombre;
        }
        return lRetour;
    }
    
    // Cette m�thode ne fonctionne pas correctement
    // Les tests vont le v�rifier 
    public static long multiplier(final long...pNombres) {
        long lRetour = 1;
        for(final long lNombre : pNombres) {
            lRetour = lRetour*lNombre;
        }
        return lRetour;
    }
    
}