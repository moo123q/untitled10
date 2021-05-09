import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {


    boolean f = false;
    boolean t = true;


    @Test
    void Test1() {
        assertFalse(Product.weeklimietTest(f, t));
    }

    @Test
    void Test2() {
        assertFalse(Product.weeklimietTest(t, f));
    }

    @Test
    void Test3() {
        assertTrue(Product.weeklimietTest(t, t));
    }


}