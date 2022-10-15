import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OptimalTest {
    private Optimal optimal;

    @BeforeEach
    public void setup(){
        optimal = new Optimal();
    }

    @Test
    public void test_add(){
        int result = optimal.add(1 ,2, 3 );
    }

    private void add(int result) {
        Assertions.assertEquals(result, 6);
    }

}