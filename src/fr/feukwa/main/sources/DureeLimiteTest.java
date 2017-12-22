package fr.feukwa.main.sources;

public class DureeLimiteTest {
	public  long additionner(final long...pNombres) throws InterruptedException {
        long lRetour = 0;
        for(final long lNombre : pNombres) {
            lRetour += lNombre;
        }
        Thread.sleep(1000);
        return lRetour;
    }
}
