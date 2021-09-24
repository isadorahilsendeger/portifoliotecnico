/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SESI_SENAI'
 */
public class CaesTest {
    Caes dog;
    String nome = "Julio";
    
    public CaesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dog = new Caes(nome, 6);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of falar method, of class Caes.
     */
    @Test
    public void testFalar() {
        System.out.println("falar");
        String mensagem = "auau";
        
        String expResult = "Meu nome é " + nome + ", " + mensagem;
        
        String result = dog.falar(mensagem);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of andar method, of class Caes.
     */
    @Test
    public void testAndar() {
        System.out.println("andar 1500 passos");
        boolean expResult = true;
        boolean result = dog.andar(1500);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of comer method, of class Caes.
     */
    @Test
    public void testComer() {
        System.out.println("comer");
        dog.comer();
         assertEquals("satisfeito", dog.humor);

    }

    /**
     * Test of dormir method, of class Caes.
     */
    @Test
    public void testDormir() {
        System.out.println("dormir");
        dog.humor = "cansado";
        boolean expResult = true;
        boolean result = dog.dormir();
        assertEquals(expResult, result);
    }
    
}
