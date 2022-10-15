import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathsTest {
    private Maths maths;


    @BeforeEach
    public void setup() {
        maths = new Maths();
    }

    @Test
    public void test_subtract() {
        int result = maths.subtract(10, 4, 6);
    }

    private void add(int result) {
        Assertions.assertEquals(result, 0);
    }
}