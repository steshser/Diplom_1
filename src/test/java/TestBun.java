import static org.junit.Assert.assertEquals;
import org.junit.Test;
import praktikum.Bun;

public class TestBun {
    private final String NAME = "BunName";
    private final float PRICE = 100;


    @Test
    public void testGetName(){
        Bun bun = new Bun(NAME, PRICE);
        assertEquals(NAME, bun.getName());
    }

    @Test
    public void testGetPrice(){
        Bun bun = new Bun(NAME, PRICE);
        assertEquals(PRICE, bun.getPrice(), 0);
    }
}
