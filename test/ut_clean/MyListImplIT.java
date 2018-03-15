/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut_clean;

import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
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
public class MyListImplIT
{
    
    public MyListImplIT()
    {
    }
    //========= OBJECTS ALLOCATIONS to test before, afterclass and before, after
    //The class object to test
    private static MyList<Integer> sut;
    //The original size type integer
    private static int expectedSize;
    //The properties object
    private static Properties prop;
    //The list object of the numbers that it will set to our class
    private static List<Integer> testSet;
    //The properties object file
    private static FileInputStream propFile;
    //==========================================================================
    
    //This method is lanced before the first test
    @BeforeClass
    public static void setUpClass() throws Exception
    {
        //Objects initializations or Instantiations
        prop = new Properties();
        testSet = new LinkedList<Integer>();
        //Load the properties file 
        propFile = new FileInputStream("test/ut_clean/config.properties");
        prop.load(propFile);
        //Do a parse to integer on size in the config file
        expectedSize = Integer.parseInt(prop.getProperty("size"));
        //Capture the numbers to put at list
        String numbers = prop.getProperty("numbers");
        //Capture each number and jump the spaces (split method)
        for (String i : numbers.split(" "))
        {
            //trim() method returns the string himself that the space was
            //removed or without space at start or end of string
            //Save at list as integer
            testSet.add(Integer.parseInt(i.trim()));
        }
        //The class instanciated to test
        sut = new MyListImpl<Integer>();
    }
    
    //This method is lanced after the last test
    @AfterClass
    public static void tearDownClass() throws Exception
    {
        //Close the file when the tests ends
        propFile.close();
    }
    
    //This method is lanced before each test
    @Before
    public void setUp() throws Exception
    {
        //Add the numbers before each test
        for (int i : testSet)
        {
            sut.add(new Integer(i));
        }
    }
    
    //This method is lanced after each test
    @After
    public void tearDown() throws Exception
    {
        //Reset the numbers at the end of each test, reset the list
        sut.reset();
    }

    /**
     * Test of add method, of class MyListImpl. But this method is void, so
     * it have to test the classes, fields or others methods that it can change
     * and if it does your work. We test the lists sizes, if the sizes are
     * equals it adds correctly
     */
    @Test
    public void testAdd()
    {
        //It test if are equal and if the add does your work correctly
        assertEquals(expectedSize, sut.getSize());
        //Add a new integer to ensure that the test static could change
        sut.add(new Integer(8));
        //New check
        assertEquals(expectedSize + 1, sut.getSize());
        //To know if the elements are presents one by one in the list
        for (int i = 0; i < testSet.size(); i++)
        {
            assertEquals(testSet.get(i), sut.getAt(i));
        }
    }

    /**
     * Test of removeAt method, of class MyListImpl.
     */
    @Test
    public void testRemoveAt()
    {
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeItem method, of class MyListImpl.
     */
    @Test
    public void testRemoveItem()
    {
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAt method, of class MyListImpl.
     */
    @Test
    public void testSetAt()
    {
        fail("The test case is a prototype.");
    }

}
