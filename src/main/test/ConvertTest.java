package main.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.java.converter.PigLatin;

@RunWith(Parameterized.class)
public class ConvertTest {
	
	private static PigLatin pig;
	private String expected,input;
	/**
	 * 
	 * @param in
	 * @param exp
	 * Or we can replace constructor with
	 * //@Parameter // first data value (0) is default 
	 * public  (NOT private)  String input;
	 * @Parameter(1)
	 * public (NOT private) String expected;
	 * **/
	
	public ConvertTest(String in,String exp) {
		// TODO Auto-generated constructor stub
		input=in;
		expected=exp;
	}
	
	
  
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pig=new PigLatin();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		/**
		 * Prepare for Garbage Collector
		 */
		pig=null;
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("I am in a Test method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("I finished a Test method");
	}

	@Parameters
	public static Collection<Object []> inputData(){
		// order is important  input expected and should match constructor
		Object [][] data= {{ "donia", "oniaday" }, { "sami", "amisay" }, { "som", "omsay" }};
		List<Object[]> listOfArrays=Arrays.asList(data);
		return listOfArrays;
		
	}
	@Test
	public void conventionalTest() {
		assertEquals("oniaday", pig.convertWord("donia"));
	}
	@Test
	public void parametrizedTest() {
		assertEquals(expected,pig.convertWord(input));
		
	}
	

}
