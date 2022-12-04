import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class TestBurger {
    private final Burger burger = new Burger();
    private final Bun bun = new Bun("Bun", 100);
    private final Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Sauce", 100);

    @Before
    public void setUp() throws Exception {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
    }

    @Test
    public void testGetPrice(){
        float expectedResult = 300;
        assertEquals(expectedResult, burger.getPrice(), 0);
    }

    @Test
    public void testGetReceipt(){
        assertTrue(burger.getReceipt().contains(bun.getName()));
        assertTrue(burger.getReceipt().contains(ingredient.getName()));
    }

    @Test
    public void testRemoveIngredient(){
        int expectedResult = 0;
        burger.removeIngredient(0);
        assertEquals(expectedResult, burger.ingredients.size());
    }

    @Test
    public void testMoveIngredient(){
        Ingredient newIngredient = new Ingredient(IngredientType.FILLING, "FILLING", 200);
        burger.addIngredient(newIngredient);
        burger.moveIngredient(0, 1);
        String expectedResult = "Sauce";
        assertEquals(expectedResult, burger.ingredients.get(1).getName());
    }
}
