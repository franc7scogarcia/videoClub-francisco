/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matias
 */
public class ClientesCRUDTest {
    
    public ClientesCRUDTest() {
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
     * Test of getInstance method, of class ClientesCRUD.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        ClientesCRUD expResult = null;
        ClientesCRUD result = ClientesCRUD.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddClientes method, of class ClientesCRUD.
     */
    @Test
    public void testAddClientes() {
        System.out.println("AddClientes");
        ClientesDatos nuevoCliente = null;
        ClientesCRUD instance = null;
        boolean expResult = false;
        boolean result = instance.AddClientes(nuevoCliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SearchClient method, of class ClientesCRUD.
     */
    @Test
    public void testSearchClient_0args() {
        System.out.println("SearchClient");
        ClientesCRUD instance = null;
        List<ClientesDatos> expResult = null;
        List<ClientesDatos> result = instance.SearchClient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SearchClient method, of class ClientesCRUD.
     */
    @Test
    public void testSearchClient_int() {
        System.out.println("SearchClient");
        int DNI = 0;
        ClientesCRUD instance = null;
        int expResult = 0;
        int result = instance.SearchClient(DNI);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SearchClient method, of class ClientesCRUD.
     */
    @Test
    public void testSearchClient_String() {
        System.out.println("SearchClient");
        String apellido = "";
        ClientesCRUD instance = null;
        List<ClientesDatos> expResult = null;
        List<ClientesDatos> result = instance.SearchClient(apellido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
