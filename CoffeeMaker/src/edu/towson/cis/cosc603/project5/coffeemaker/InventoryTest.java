package edu.towson.cis.cosc603.project5.coffeemaker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * The class <code>InventoryTest</code> contains tests for the class {@link
 * <code>Inventory</code>}
 * @pattern JUnit Test Case
 * @generatedBy CodePro at 4/28/16 12:38 PM
 * @author newsha
 * @version $Revision$
 */
public class InventoryTest extends TestCase {

	private CoffeeMaker cm;
	private Inventory i;
	private Recipe r1;
	
	/**
	 * Run the Inventory() constructor test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testInventory_1()
		throws Exception {

		Inventory result = new Inventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n", result.toString());
		assertEquals(15, result.getMilk());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getChocolate());
	}
	
	/**
	 * Run the Inventory() constructor test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testInventory2()
		throws Exception {

		Inventory result = new Inventory();
		assertEquals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n", result.toString());
		assertEquals(15, result.getMilk());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getChocolate());
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testEnoughIngredients_1()
		throws Exception {
		
		i.setChocolate(0);
		i.setCoffee(0);
		i.setMilk(0);
		i.setSugar(0);
		
		Recipe r2 = new Recipe();
		r2.setName("Special Coffee");
		r2.setPrice(8);
		r2.setAmtCoffee(20);
		r2.setAmtMilk(7);
		r2.setAmtSugar(8);
		r2.setAmtChocolate(10);
		
		boolean result = i.enoughIngredients(r2);

		assertEquals(false, result);
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testEnoughIngredients_2()
		throws Exception {
		
		i.setChocolate(0);
		boolean result = i.enoughIngredients(r1);

		assertEquals(true, result);
	}

	/**
	 * Run the int getChocolate() method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testGetChocolate_1()
		throws Exception {		
		assertEquals(15, i.getChocolate());
	}
	/**
	 * Run the int getChocolate() method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testGetChocolate2()
		throws Exception {		
		i.setChocolate(-1);
		assertEquals(0, i.getChocolate());
	}
	
	/**
	 * Run the int getCoffee() method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testGetCoffee_1()
		throws Exception {
	
		int result = i.getCoffee();

		assertEquals(15, result);
	}

	/**
	 * Run the int getMilk() method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testGetMilk_1()
		throws Exception {
	

		int result = i.getMilk();

		assertEquals(15, result);
	}

	/**
	 * Run the int getSugar() method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testGetSugar_1()
		throws Exception {
		

		int result = i.getSugar();

		assertEquals(15, result);
	}

	/**
	 * Run the void setChocolate(int) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetChocolate_1()
		throws Exception {
	
		int chocolate = -1;

		i.setChocolate(chocolate);

		assertEquals(0, i.getChocolate());
	}

	/**
	 * Run the void setChocolate(int) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetChocolate_2()
		throws Exception {
		
		int chocolate = 1;

		i.setChocolate(chocolate);

		assertEquals(1, i.getChocolate());
	}
	
	/**
	 * Run the void setChocolate(int) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetChocolate3()
		throws Exception {
		
		int chocolate = 0;

		i.setChocolate(chocolate);

		assertEquals(0, i.getChocolate());
	}

	/**
	 * Run the void setCoffee(int) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetCoffee_1()
		throws Exception {
	
		int coffee = -1;

		i.setCoffee(coffee);

		assertEquals(0, i.getCoffee());
	}

	/**
	 * Run the void setCoffee(int) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetCoffee_2()
		throws Exception {
		
		int coffee = 1;

		i.setCoffee(coffee);

		assertEquals(1, i.getCoffee());
	}
	
	/**
	 * Run the void setCoffee(int) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetCoffee3()
		throws Exception {
		
		int coffee = 0;

		i.setCoffee(coffee);

		assertEquals(0, i.getCoffee());
	}


	/**
	 * Run the void setMilk(int) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetMilk_1()
		throws Exception {
	
		int milk = -1;

		i.setMilk(milk);

		assertEquals(0, i.getMilk());
	}

	/**
	 * Run the void setMilk(int) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetMilk_2()
		throws Exception {
		

		int milk = 1;

		i.setMilk(milk);

		assertEquals(1, i.getMilk());
	}

	/**
	 * Run the void setMilk(int) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetMilk3()
		throws Exception {
	
		int milk = 0;

		i.setMilk(milk);

		assertEquals(0, i.getMilk());
	}

	/**
	 * Run the void setSugar(int) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetSugar_1()
		throws Exception {

		int sugar = -1;

		i.setSugar(sugar);

		assertEquals(0, i.getSugar());
	}

	/**
	 * Run the void setSugar(int) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetSugar_2()
		throws Exception {
		
		int sugar = 1;

		i.setSugar(sugar);

		assertEquals(1, i.getSugar());
	}
	
	/**
	 * Run the void setSugar(int) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetSugar3()
		throws Exception {

		int sugar = 0;

		i.setSugar(sugar);

		assertEquals(0, i.getSugar());
	}
	

	/**
	 * Run the String toString() method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {

		// add additional test code here
		assertEquals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n", i.toString());
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
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		
		cm = null;
		i = null;
		r1 = null;
	}

}