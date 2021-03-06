package edu.towson.cis.cosc603.project5.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InventoryTest</code> contains tests for the class <code>{@link Inventory}</code>.
 *
 * @generatedBy CodePro at 4/27/16 10:08 PM
 * @author newsha
 * @version $Revision: 1.0 $
 */
public class InventoryTest {
	
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
		Inventory fixture = InventoryFactory.createInventory();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testEnoughIngredients_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
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
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testGetCoffee_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		int result = fixture.getCoffee();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getMilk() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testGetMilk_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		int result = fixture.getMilk();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getSugar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testGetSugar_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		int result = fixture.getSugar();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetChocolate_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int chocolate = -1;

		fixture.setChocolate(chocolate);

		assertEquals(0, i.getChocolate());
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetChocolate_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int chocolate = 1;

		fixture.setChocolate(chocolate);

		assertEquals(1, i.getChocolate());
	}

	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetCoffee_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int coffee = -1;

		fixture.setCoffee(coffee);

		assertEquals(0, i.getCoffee());
	}

	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetCoffee_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int coffee = 1;

		fixture.setCoffee(coffee);

		assertEquals(1, i.getCoffee());
	}

	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetMilk_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int milk = -1;

		fixture.setMilk(milk);

		assertEquals(0, i.getMilk());
	}

	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetMilk_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int milk = 1;

		fixture.setMilk(milk);

		assertEquals(1, i.getMilk());
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetSugar_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int sugar = -1;

		fixture.setSugar(sugar);

		assertEquals(0, i.getSugar());
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:08 PM
	 */
	@Test
	public void testSetSugar_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int sugar = 1;

		fixture.setSugar(sugar);

		assertEquals(1, i.getSugar());
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
		Inventory fixture = InventoryFactory.createInventory();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n", result);
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
		new org.junit.runner.JUnitCore().run(InventoryTest.class);
	}
}