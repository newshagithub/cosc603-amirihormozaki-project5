package edu.towson.cis.cosc603.project5.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RecipeTest</code> contains tests for the class <code>{@link Recipe}</code>.
 *
 * @generatedBy CodePro at 4/27/16 10:08 PM
 * @author newsha
 * @version $Revision: 1.0 $
 */
public class RecipeTest {
	
	private CoffeeMaker cm;
	private Inventory i;
	private Recipe r1;
	
	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.equals(r);

		// add additional test code here
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
	public void testEquals_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.equals(r);

		// add additional test code here
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
		Recipe fixture = RecipeFactory.createRecipe();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.equals(r);

		// add additional test code here
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
		Recipe fixture = RecipeFactory.createRecipe();

		String result = fixture.getName();

		// add additional test code here
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
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtChocolate_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtChocolate = -1;

		fixture.setAmtChocolate(amtChocolate);

		assertEquals(0, fixture.getAmtChocolate());
	}

	/**
	 * Run the void setAmtChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtChocolate_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtChocolate = 1;

		fixture.setAmtChocolate(amtChocolate);

		assertEquals(1, fixture.getAmtChocolate());
	}

	/**
	 * Run the void setAmtChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtChocolate_3()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtChocolate = 0;

		fixture.setAmtChocolate(amtChocolate);

		assertEquals(0, fixture.getAmtChocolate());
	}
	
	/**
	 * Run the void setAmtChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtChocolate_4()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtChocolate = 5;

		fixture.setAmtChocolate(amtChocolate);

		assertEquals(5, fixture.getAmtChocolate());
	}

	/**
	 * Run the void setAmtCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtCoffee_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtCoffee = -1;

		fixture.setAmtCoffee(amtCoffee);

		// add additional test code here
	}

	/**
	 * Run the void setAmtCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtCoffee_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtCoffee = 1;

		fixture.setAmtCoffee(amtCoffee);

		// add additional test code here
	}

	/**
	 * Run the void setAmtMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtMilk_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtMilk = -1;

		fixture.setAmtMilk(amtMilk);

		// add additional test code here
		
	}

	/**
	 * Run the void setAmtMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtMilk_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtMilk = 1;

		fixture.setAmtMilk(amtMilk);

		// add additional test code here
	}

	/**
	 * Run the void setAmtSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtSugar_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtSugar = -1;

		fixture.setAmtSugar(amtSugar);

		// add additional test code here
	}

	/**
	 * Run the void setAmtSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetAmtSugar_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtSugar = 1;

		fixture.setAmtSugar(amtSugar);

		// add additional test code here
	}

	public void testSetAmtSugar3()
			throws Exception {
			Recipe fixture = RecipeFactory.createRecipe();
			int amtSugar = 0;

			fixture.setAmtSugar(amtSugar);

			// add additional test code here
		}
	
	public void testSetAmtSugar_4()
			throws Exception {
			Recipe fixture = RecipeFactory.createRecipe();
			int amtSugar = 5;

			fixture.setAmtSugar(amtSugar);

			// add additional test code here
		}
	
	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setPrice(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetPrice_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int price = -1;

		fixture.setPrice(price);

		// add additional test code here
	}

	/**
	 * Run the void setPrice(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetPrice_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int price = 1;

		fixture.setPrice(price);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();

		String result = fixture.toString();

		// add additional test code here
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
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		
		cm = new CoffeeMaker();
		i = cm.checkInventory();

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
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		
		cm = null;
		i = null;
		r1 = null;
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RecipeTest.class);
	}
}