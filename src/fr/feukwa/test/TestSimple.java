package fr.feukwa.test;

import org.junit.Assert;
import org.junit.Test;

import fr.feukwa.main.sources.OperationsSimpleTest;


public class TestSimple {

    @Test
    public void testAdditionAvecDeuxNombres() {
        final long lAddition = OperationsSimpleTest.additionner(10, 20);
        Assert.assertEquals(30, lAddition);
    }

    @Test
    public void testAdditionAvecCinqNombres() {
        final long lAddition = OperationsSimpleTest.additionner(256, 512, 1024, 2048, 4096);
        Assert.assertEquals(7936, lAddition);
    }

    @Test
    public void testMutiplicationAvecDeuxNombres() {
        final long lMultiplication = OperationsSimpleTest.multiplier(10, 20);
        Assert.assertEquals(200, lMultiplication);
    }
    
    @Test
    public void testMutiplicationAvecCinqNombres() {
        final long lMultiplication = OperationsSimpleTest.multiplier(1, 1, 2, 2, 2);
        Assert.assertEquals(8, lMultiplication);
    }
}