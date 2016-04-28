package edu.towson.cis.cosc603.project5.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CoffeeMakerTest</code> contains tests for the class <code>{@link CoffeeMaker}</code>.
 *
 * @generatedBy CodePro at 4/27/16 10:07 PM
 * @author newsha
 * @version $Revision: 1.0 $
 */
public class CoffeeMakerTest {
	
	private CoffeeMaker cm;
	private Inventory i;
	private Recipe r1;
	/**
	 * Run the CoffeeMaker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testCoffeeMaker_1()
		throws Exception {

		CoffeeMaker result = new CoffeeMaker();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CoffeeMaker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testCoffeeMaker_2()
		throws Exception {

		CoffeeMaker result = new CoffeeMaker();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 * test addInventory for - value
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testAddInventory1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 0;
		int amtChocolate = -1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 * test addInventory
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testAddInventory3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 0;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		assertEquals(true, result);
	}


	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testAddInventory_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = -1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testAddInventory_5()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void TestAddRecipe1()
		throws Exception {
		
		
		assertTrue(cm.addRecipe(r1));
	}

	/**
	 * Test repeated name
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void TestAddRecipe2()
		throws Exception {
	
		assertTrue(cm.addRecipe(r1));
		Recipe r2 = new Recipe();
		r2.setName("Coffee");
		r2.setPrice(2);
		r2.setAmtCoffee(2);
		r2.setAmtMilk(1);
		r2.setAmtSugar(1);
		r2.setAmtChocolate(0);
		assertFalse(cm.addRecipe(r2));
	}


	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testAddRecipe_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.addRecipe(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Inventory checkInventory() method test.
	 * test check inventory before any addInventory or makeCoffe
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testCheckInventory1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Inventory result = fixture.checkInventory();
		
		assertNotNull(result);
		assertEquals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n", result.toString());
		assertEquals(15, result.getMilk());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getChocolate());
	}
	
	/**
	 * Run the Inventory checkInventory() method test.
	 * test check inventory after makeCoffe
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testCheckInventory2()
		throws Exception {
		
		CoffeeMaker purchase = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();
		int amtPaid = 1;

		int purchaseResult = purchase.makeCoffee(r, amtPaid);
		
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Inventory result = fixture.checkInventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n", result.toString());
		assertEquals(15, result.getMilk());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getChocolate());
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 * Test delete
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testDeleteRecipe_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.deleteRecipe(r);

		assertEquals(false, result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testDeleteRecipe_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testDeleteRecipe_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testDeleteRecipe_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = null;

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 * Test edit
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testEditRecipe1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe oldRecipe = RecipeFactory.createRecipe();
		Recipe newRecipe = RecipeFactory.createRecipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 * Test edit to change sugar amount
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testEditRecipe2()
		throws Exception {
		
		cm.addRecipe(r1);
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		newRecipe.setAmtSugar(2);
		
		assertTrue(cm.editRecipe(r1, newRecipe));
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 * Test if name can be update?
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testEditRecipe3()
		throws Exception {
		cm.addRecipe(r1);
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		newRecipe.setName("Tea");
		// i guess this should return false :?
		assertTrue(cm.editRecipe(r1, newRecipe));
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testEditRecipe_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe oldRecipe = RecipeFactory.createRecipe();
		Recipe newRecipe = RecipeFactory.createRecipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testEditRecipe_5()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe oldRecipe = RecipeFactory.createRecipe();
		Recipe newRecipe = RecipeFactory.createRecipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testGetRecipeForName_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getPrice());
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtMilk());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testGetRecipeForName_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getPrice());
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtMilk());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testGetRecipeForName_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getPrice());
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtMilk());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testGetRecipeForName_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getPrice());
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtMilk());
	}

	/**
	 * Run the Recipe[] getRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testGetRecipes_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();

		Recipe[] result = fixture.getRecipes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertNotNull(result[0]);
		assertEquals(0, result[0].getPrice());
		assertEquals(null, result[0].toString());
		assertEquals(null, result[0].getName());
		assertEquals(0, result[0].getAmtSugar());
		assertEquals(0, result[0].getAmtChocolate());
		assertEquals(0, result[0].getAmtCoffee());
		assertEquals(0, result[0].getAmtMilk());
		assertNotNull(result[1]);
		assertEquals(0, result[1].getPrice());
		assertEquals(null, result[1].toString());
		assertEquals(null, result[1].getName());
		assertEquals(0, result[1].getAmtSugar());
		assertEquals(0, result[1].getAmtChocolate());
		assertEquals(0, result[1].getAmtCoffee());
		assertEquals(0, result[1].getAmtMilk());
		assertNotNull(result[2]);
		assertEquals(0, result[2].getPrice());
		assertEquals(null, result[2].toString());
		assertEquals(null, result[2].getName());
		assertEquals(0, result[2].getAmtSugar());
		assertEquals(0, result[2].getAmtChocolate());
		assertEquals(0, result[2].getAmtCoffee());
		assertEquals(0, result[2].getAmtMilk());
		assertNotNull(result[3]);
		assertEquals(0, result[3].getPrice());
		assertEquals(null, result[3].toString());
		assertEquals(null, result[3].getName());
		assertEquals(0, result[3].getAmtSugar());
		assertEquals(0, result[3].getAmtChocolate());
		assertEquals(0, result[3].getAmtCoffee());
		assertEquals(0, result[3].getAmtMilk());
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test to check correct change
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testPurchaseBeverage1()
		throws Exception {
		int amtPaid = 10;

		int result = cm.makeCoffee(r1, amtPaid); // amtPaid>price

		assertEquals(2, result);
	}
	

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 * Test if amount paid is less than price
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testPurchaseBeverage2()
		throws Exception {
		int amtPaid = 5;

		int result = cm.makeCoffee(r1, amtPaid);

		assertEquals(5, result);
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 * Test when inventory is not enough and money is returned
	 * @throws Exception
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testPurchaseBeverage3()
		throws Exception {
		int amtPaid = 10;

		int result = cm.makeCoffee(r1, amtPaid);
		i.setSugar(0);
		assertNotEquals(10, result);
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	@Test
	public void testMakeCoffee_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();
		int amtPaid = 1;

		int result = fixture.makeCoffee(r, amtPaid);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/27/16 10:07 PM
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
	 * @generatedBy CodePro at 4/27/16 10:07 PM
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
	 * @generatedBy CodePro at 4/27/16 10:07 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CoffeeMakerTest.class);
	}
}