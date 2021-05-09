import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {


    boolean f = false;
    boolean t = true;

    @Test
    void Test1() {
        Product product = new Product();
        assertFalse(product.weeklimietTest(f, t));
    }

    @Test
    void Test2() {
        Product product = new Product();
        assertFalse(product.weeklimietTest(t, f));
    }

    @Test
    void Test3() {
        Product product = new Product();
        assertTrue(product.weeklimietTest(t, t));
    }
}
