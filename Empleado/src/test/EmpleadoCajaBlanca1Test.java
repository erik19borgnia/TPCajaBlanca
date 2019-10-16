package test;

import modelo.*;
import modelo.Empleado;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;

/**
 * Los métodos anotados @BeforeClass y @AfterClass
 * se ejecutarán exactamente una vez durante la
 * ejecución de la prueba, al principio y al final
 * de la prueba en conjunto, antes de ejecutar cualquier
 * otra cosa. De hecho, se ejecutan antes de que la
 * clase de prueba se construya, por lo que deben
 * declararse estáticas.Los métodos @Before y @After
 * se ejecutarán antes y después de cada caso de prueba,
 * por lo que probablemente se ejecutarán varias veces
 * durante una ejecución de prueba.
 */
public class EmpleadoCajaBlanca1Test
{
    Empleado empleado;
    
    public EmpleadoCajaBlanca1Test()
    {
        empleado = new Empleado("12345678");
    }

    @Before
    public void setUp() throws Exception
    {
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception
    {
    }

    /**
     * @see Empleado#getIncremento(double)
     */
    @Test
    public void testGetIncrementoClaseEquivalencia()
    {
        double resultadoReal = empleado.getIncremento(32000.00);
        double resultadoEsperado = 0.00;
        Assert.assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    
    @Test
    public void testGetIncrementoValoresLimites()
    {
    	double resultadoReal = empleado.getIncremento(100.00);
        double resultadoEsperado = 0.00;
        Assert.assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
}
