package testCalculadora;

import java.math.BigInteger;
import modelo.Controle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class testControle
{
    
    public testControle()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    
     @Test
     public void testar() 
     {
        Controle controle = new modelo.Controle();
        controle.numero1 = "5";
        controle.numero2 = "3";
        controle.operacao = "+";
        controle.executar();
     }
     
}
