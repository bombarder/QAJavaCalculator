import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void test1(){
        checkMethod("1+1", 2.0);
    }
    @Test
    public void test2(){
        checkMethod("0+0", 0.0);
    }
    @Test
    public void test3(){
        checkMethod("0-1", -1.0);
    }
    @Test
    public void test4(){
        checkMethod("1*0", 0.0);
    }

    private static void checkMethod(String input, Double expected){
        Double actual = Calculator.evaluate(input);
       assertEquals(expected, actual);
    }
}
