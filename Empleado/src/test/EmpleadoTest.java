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

public class EmpleadoTest
{
    Empleado empleado;
    
    public EmpleadoTest()
    {
        empleado = new Empleado("12345678");
    }

    public static void main(String[] args)
    {
        String[] args2 =
        {
            EmpleadoTest.class.getName()
        };
        JUnitCore.main(args);
    }

    @Before
    public void setUp() throws Exception
    {
        Hijo h1 = new Hijo("30123456", 2012, 1, 21);
        Hijo h2 = new Hijo("32001023", 2014, 4, 5);
        Hijo h3 = new Hijo("40000345", 2016, 9, 10);
        empleado.agregarHijo(h1);
        empleado.agregarHijo(h2);
        empleado.agregarHijo(h3);
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
        double resultadoEsperado = 4800.00;
        Assert.assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    
    @Test
    public void testGetIncrementoValoresLimites()
    {
    	double resultadoReal = empleado.getIncremento(100.00);
        double resultadoEsperado = 15;
        Assert.assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
}
