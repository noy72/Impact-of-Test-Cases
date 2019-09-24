package incorrect_condition;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class FailureTest1 {
@org.junit.Test
public void test9() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,8,4,3,8,2,8,8,9,4,2,8,1,10));
assertEquals(161280, new Class1().run(list,26,1,8,8));
}

}
