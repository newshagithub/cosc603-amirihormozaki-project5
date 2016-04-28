package edu.towson.cis.cosc603.project5.coffeemaker;

import org.junit.*;

import junit.framework.TestCase;

/**
 * The class <code>RecipeTest</code> contains tests for the class <code>{@link Recipe}</code>.
 *
 * @generatedBy CodePro at 4/27/16 10:08 PM
 * @author newsha
 * @version $Revision: 1.0 $
 */
public class RecipeTest extends TestCase{
	
	private CoffeeMaker cm;
	private Recipe r1;
	
	/**
	 * Run the boolean equals(Recipe) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		
		Recipe r2 = new Recipe();
		boolean result = cm.equals(r2);

		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Recipe) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		
		boolean result = cm.equals(r1);

		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		
		r1.setName(null);
		boolean result = cm.equals(r1);

		assertEquals(false, result);
	}
	
	/**
	 * Run the int getAmtChocolate() method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testGetAmtChocolate2()
		throws Exception {

		assertEquals(0, r1.getAmtChocolate());
	}
	/**
	 * Run the int getAmtChocolate() method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testGetAmtChocolate1()
		throws Exception {
		
		
		r1.setAmtChocolate(-1);

		assertEquals(0, r1.getAmtChocolate());
	}
	/**
	 * Run the int getAmtChocolate() method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testGetAmtChocolate3()
		throws Exception {
		
		
		r1.setAmtChocolate(5);

		assertEquals(5, r1.getAmtChocolate());
	}
	
	/**
	 * Run the int getAmtCoffee() method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testGetAmtCoffee1()
		throws Exception {
		
		assertEquals(3, r1.getAmtCoffee());
	}

	/**
	 * Run the int getAmtMilk() method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testGetAmtMilk1()
		throws Exception {
		
		assertEquals(1, r1.getAmtMilk());
	}

	/**
	 * Run the int getAmtSugar() method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testGetAmtSugar1()
		throws Exception {
		
		assertEquals(1, r1.getAmtSugar());
	}

	/**
	 * Run the String getName() method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testGetName1()
		throws Exception {
		r1.setName(null);
		String result = r1.getName();

		assertEquals(null, result);
	}
	
	/**
	 * Run the String getName() method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testGetName2()
		throws Exception {
		
		assertEquals("Coffee", r1.getName());
	}
	

	/**
	 * Run the int getPrice() method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testGetPrice1()
		throws Exception {
		
		assertEquals(8, r1.getPrice());
	}

	/**
	 * Run the void setAmtChocolate(int) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtChocolate_1()
		throws Exception {
		int amtChocolate = -1;

		r1.setAmtChocolate(amtChocolate);

		assertEquals(0, r1.getAmtChocolate());
	}

	/**
	 * Run the void setAmtChocolate(int) method test.
	 * Test setAmtChocolate method
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtChocolate_2()
		throws Exception {
		int amtChocolate = 1;

		r1.setAmtChocolate(amtChocolate);

		assertEquals(1, r1.getAmtChocolate());
	}

	/**
	 * Run the void setAmtChocolate(int) method test.
	 * Test setAmtChocolate method for 0
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtChocolate_3()
		throws Exception {
		int amtChocolate = 0;

		r1.setAmtChocolate(amtChocolate);

		assertEquals(0, r1.getAmtChocolate());
	}
	
	/**
	 * Run the void setAmtChocolate(int) method test.
	 * Test setAmtChocolate method for > 0
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtChocolate_4()
		throws Exception {
		
		int amtChocolate = 5;

		r1.setAmtChocolate(amtChocolate);

		assertEquals(5, r1.getAmtChocolate());
	}

	/**
	 * Run the void setAmtCoffee(int) method test.
	 * Test setAmtCoffee method for negative value
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtCoffee_1()
		throws Exception {

		int amtCoffee = -1;

		r1.setAmtCoffee(amtCoffee);

		assertEquals(0, r1.getAmtCoffee());
	}

	/**
	 * Run the void setAmtCoffee(int) method test.
	 * Test setAmtCoffee method
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtCoffee_2()
		throws Exception {
		
		int amtCoffee = 1;

		r1.setAmtCoffee(amtCoffee);

		assertEquals(1, r1.getAmtCoffee());
	}

	/**
	 * Run the void setAmtMilk(int) method test for negative value.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtMilk_1()
		throws Exception {
	
		int amtMilk = -1;

		r1.setAmtMilk(amtMilk);

		assertEquals(0, r1.getAmtMilk());
		
	}

	/**
	 * Run the void setAmtMilk(int) method test.
	 * Test setAmtChocolate method
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtMilk_2()
		throws Exception {
		int amtMilk = 1;

		r1.setAmtMilk(amtMilk);

		assertEquals(1, r1.getAmtMilk());
	}

	/**
	 * Run the void setAmtSugar(int) method test for negative value
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtSugar_1()
		throws Exception {
		int amtSugar = -1;

		r1.setAmtSugar(amtSugar);

		assertEquals(0, r1.getAmtSugar());
	}

	/**
	 * Run the void setAmtSugar(int) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtSugar_2()
		throws Exception {
	
		int amtSugar = 1;

		r1.setAmtSugar(amtSugar);

		assertEquals(1, r1.getAmtSugar());
	}
	/**
	 * Run the void setAmtSugar(int) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtSugar3()
			throws Exception {

			int amtSugar = 0;

			r1.setAmtSugar(amtSugar);

			assertEquals(0, r1.getAmtSugar());
		}
	/**
	 * Run the void setAmtSugar(int) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtSugar_4()
			throws Exception {
			int amtSugar = 5;

			r1.setAmtSugar(amtSugar);

			assertEquals(5, r1.getAmtSugar());
		}
	
	/**
	 * Run the void setName(String) method test for empty value
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		String name = "";

		r1.setName(name);

		assertEquals("", r1.getName());
	}

	/**
	 * Run the void setPrice(int) method test for negative value
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetPrice_1()
		throws Exception {
		int price = -1;

		r1.setPrice(price);

		assertEquals(0, r1.getPrice());
	}

	/**
	 * Run the void setPrice(int) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetPrice_2()
		throws Exception {

		int price = 1;

		r1.setPrice(price);

		assertEquals(1, r1.getPrice());
	}

	/**
	 * Run the String toString() method test for null
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Recipe r2 = new Recipe();
		String result = r2.toString();

		assertEquals(null, result);
	}


	/**
	 * Run the String toString() method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testToString2()
		throws Exception {
		
		assertEquals("Coffee", r1.toString());
	}
	
	/**
	 * Perform pre-test initialization.
	 * @throws Exception
	 *         if the initialization fails for some reason
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		
		cm = new CoffeeMaker();

		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(8);
		r1.setAmtCoffee(3);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);

	}

	/**
	 * Perform post-test clean-up.
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		
		cm = null;
		r1 = null;
	}

}