import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EQKRTestTest {

    @Test
    void EQKRTest() {
        assertFalse(Product.EQKRTest(1050));
    }

    @Test
    void EQKRTest1() {
        assertFalse(Product.EQKRTest( 801));
    }

    @Test
    void EQKRTest2() {
        assertTrue(Product.EQKRTest(800));
    }

    @Test
    void EQKRTest3() {
        assertTrue(Product.EQKRTest(799.99));
    }

    @Test
    void EQKRTest4() {
        assertTrue(Product.EQKRTest(450));
    }
}