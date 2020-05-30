package AgileTP;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class ProductTest {
    
    public ProductTest() {
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
     * Test of isSubstituable method, of class Product.
     */
    @Test
    public void testIsSubstituable() {
        Product product1 = new Product("prod1","cat1",11);
        Product instance = new Product("prod2","cat1",10);
        boolean expResult = true;
        boolean result1 = instance.isSubstituable(product1);
        boolean result2 = product1.isSubstituable(instance);
        assertEquals(expResult, result1);
        assertEquals(expResult, result2);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
