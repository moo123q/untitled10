import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairwiseTest {

    @Test
    void percentage1() {
        Pairwise pairwise = new Pairwise();
        assertEquals(0.1, pairwise.percentage(1, 2499, 17, 999.6));
    }

    @Test
    void percentage2() {
        Pairwise pairwise = new Pairwise();
        assertEquals(1.1, pairwise.percentage(10000, 2500, 18, 100001));
    }

    @Test
    void percentage3() {
        Pairwise pairwise = new Pairwise();
        assertEquals(0, pairwise.percentage(10001, 2499, 17, 999.7));
    }

    @Test
    void percentage4() {
        Pairwise pairwise = new Pairwise();
        assertEquals(0.32, pairwise.percentage(100000, 2500, 18, 1000));
    }

    @Test
    void percentage5() {
        Pairwise pairwise = new Pairwise();
        assertEquals(0.1, pairwise.percentage(100001, 2500, 17, 1000.1));
    }

    @Test
    void percentage6() {
        Pairwise pairwise = new Pairwise();
        assertEquals(0.115, pairwise.percentage(200000, 2499, 18, 999.6));
    }
}