/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import recuperaciontest.Calculo;

/**
 *
 * @author FOLFO
 */
public class bateriaTest {
    
    public bateriaTest() {
    }
    
    private int no1, no2, expResult;
    Calculo calc;

    public bateriaTest(int num1, int num2, int result) {
        this.no1 = num1;
        this.no2 = num2;
        this.expResult = result;
    }

    @Before
    public void initialize() {
        calc = new Calculo();
    }

    /**
     * Test of main method, of class Controlador.
     */
    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
            {7, 5, 1},
            {10, 6, 8},
            {32, 16, 2},
            {7, 15, 9}
        });
    }

    @Test
    public void testMain() {
        System.out.println("Parameterized Number is : " + no1 + ", " + no2 + " ---> " + expResult);
        assertEquals(expResult,
                calc.obtenerMCD(no1, no2), 0.0);
    }
}
