import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class EQKRTest {

    @Test
    void EQKRTest1() {
        EQKR eqkr = new EQKR();
        assertFalse(eqkr.EQKRTest(1050));
    }

    @Test
    void EQKRTest2() {
        EQKR eqkr = new EQKR();
        assertFalse(eqkr.EQKRTest(801));
    }

    @Test
    void EQKRTest3() {
        EQKR eqkr = new EQKR();
        assertTrue(eqkr.EQKRTest(800));
    }

    @Test
    void EQKRTest4() {
        EQKR eqkr = new EQKR();
        assertTrue(eqkr.EQKRTest(799));
    }

    @Test
    void EQKRTest5() {
        EQKR eqkr = new EQKR();
        assertTrue(eqkr.EQKRTest(450));
    }
}