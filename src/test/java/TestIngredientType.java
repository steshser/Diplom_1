import org.junit.Test;
import praktikum.IngredientType;
import static org.junit.Assert.assertNotNull;

public class TestIngredientType {

    @Test
    public void testSauceIsNotNull() {
        assertNotNull(IngredientType.SAUCE);
    }

    @Test
    public void testFillingIsNotNull() {
        assertNotNull(IngredientType.FILLING);
    }
}
