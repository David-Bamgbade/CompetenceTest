import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CornFlakes1Test {

    @Test
    void divideBy5() {
     CornFlakes1 test = new CornFlakes1();
     assertEquals(test.divideBy5(10), 3.1622776601683795);
    }

    @Test
    void investmentAccount() {
        CornFlakes1 test = new CornFlakes1();
        assertEquals(test.investmentAccount(1000, 1, 1), 2000.0);
    }


    @Test
    void onlyFloats() {
        CornFlakes1 test = new CornFlakes1();
        assertEquals(test.onlyFloats(10, 10.1), 1);
    }

    @Test
    void myDiscount() {
        CornFlakes1 test = new CornFlakes1();
        test.myDiscount(1000, 10);
        assertEquals(test.myDiscount(1000, 10), 900);
    }


}