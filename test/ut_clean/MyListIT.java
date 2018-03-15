/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut_clean;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sire_marcos
 */
public class MyListIT
{
    
    public MyListIT()
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

    /**
     * Test of add method, of class MyList.
     */
    @Test
    public void testAdd()
    {
        System.out.println("add");
        Object e = null;
        MyList instance = new MyListImpl();
        instance.add(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAt method, of class MyList.
     */
    @Test
    public void testRemoveAt()
    {
        System.out.println("removeAt");
        int pos = 0;
        MyList instance = new MyListImpl();
        Object expResult = null;
        Object result = instance.removeAt(pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeItem method, of class MyList.
     */
    @Test
    public void testRemoveItem()
    {
        System.out.println("removeItem");
        Object item = null;
        MyList instance = new MyListImpl();
        Object expResult = null;
        Object result = instance.removeItem(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAt method, of class MyList.
     */
    @Test
    public void testSetAt()
    {
        System.out.println("setAt");
        Object item = null;
        int pos = 0;
        MyList instance = new MyListImpl();
        instance.setAt(item, pos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAt method, of class MyList.
     */
    @Test
    public void testGetAt()
    {
        System.out.println("getAt");
        int pos = 0;
        MyList instance = new MyListImpl();
        Object expResult = null;
        Object result = instance.getAt(pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class MyList.
     */
    @Test
    public void testGetSize()
    {
        System.out.println("getSize");
        MyList instance = new MyListImpl();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class MyList.
     */
    @Test
    public void testReset()
    {
        System.out.println("reset");
        MyList instance = new MyListImpl();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MyListImpl implements MyList
    {

        public void add(T e)
        {
        }

        public T removeAt(int pos)
        {
            return null;
        }

        public T removeItem(T item)
        {
            return null;
        }

        public void setAt(T item, int pos)
        {
        }

        public T getAt(int pos)
        {
            return null;
        }

        public int getSize()
        {
            return 0;
        }

        public void reset()
        {
        }
    }
    
}
