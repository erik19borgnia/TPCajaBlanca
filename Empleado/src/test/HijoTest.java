package test;

import modelo.Hijo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;

public class HijoTest
{
    Hijo hijo;
    
    public HijoTest()
    {
        hijo = new Hijo("12345678",2000,1,21);
    }

    public static void main(String[] args)
    {
        String[] args2 =
        {
            HijoTest.class.getName()
        };
        JUnitCore.main(args2);
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
     * @see modelo.Hijo#getEdad()
     */
    @Test
    public void testGetEdad()
    {
        double resultadoReal = hijo.getEdad();
        double resultadoEsperado = 19;
        Assert.assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
}
