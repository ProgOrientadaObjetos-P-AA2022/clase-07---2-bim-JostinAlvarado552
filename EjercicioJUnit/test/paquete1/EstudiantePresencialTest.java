/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package paquete1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DET PC
 */
public class EstudiantePresencialTest {

    EstudiantePresencial instance = new EstudiantePresencial();

    public EstudiantePresencialTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of establecerNumeroCreditos method, of class EstudiantePresencial.
     */
    @Test
    public void testEstablecerNumeroCreditos() {
        System.out.println("establecerNumeroCreditos");
        int numero = 10;

        instance.establecerNumeroCreditos(numero);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of establecerCostoCredito method, of class EstudiantePresencial.
     */
    @Test
    public void testEstablecerCostoCredito() {
        System.out.println("establecerCostoCredito");
        double valor = 100;

        instance.establecerCostoCredito(valor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcularMatriculaPresencial method, of class
     * EstudiantePresencial.
     */
    @Test
    public void testCalcularMatriculaPresencial() {
        System.out.println("calcularMatriculaPresencial");

        instance.calcularMatriculaPresencial();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerNumeroCreditos method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerNumeroCreditos() {
        System.out.println("obtenerNumeroCreditos");

        int expResult = 10;
        instance.establecerNumeroCreditos(10);
        int result = instance.obtenerNumeroCreditos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCostoCredito method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerCostoCredito() {
        System.out.println("obtenerCostoCredito");

        double expResult = 100;
        instance.establecerCostoCredito(100);
        double result = instance.obtenerCostoCredito();
        assertEquals(expResult, result,0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testObtenerMatriculaPresencial() {
        System.out.println("obtenerMatriculaPresencial");
        
        double expResult = 1000;
        instance.establecerCostoCredito(100);
        instance.establecerNumeroCreditos(10);
        instance.calcularMatriculaPresencial();
        double result = instance.obtenerMatriculaPresencial();
        assertEquals(expResult, result, 0);

    }

}
