import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void test_1_plus_1(){checkMethod("1+1", 2.0);}
    @Test
    public void test_zero_plus_zero(){
        checkMethod("0+0", 0.0);
    }
    @Test
    public void test_zero_minus_one(){
        checkMethod("0-1", -1.0);
    }
    @Test
    public void test_one_multp_zero(){
        checkMethod("1*0", 0.0);
    }
    @Test
    public void test_divide_zero(){
        checkMethod("1/0", 0.0);
    }

    private static void checkMethod(String input, Double expected){
        Double actual = Calculator.execute(input);
       assertEquals(expected, actual);
    }
}
