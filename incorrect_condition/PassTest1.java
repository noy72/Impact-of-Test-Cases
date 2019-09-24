package incorrect_condition;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class PassTest1 {
@org.junit.Test
public void test0() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,9,6,10,7,3,4,1,9));
assertEquals(-1, new Class1().run(list,31,1,8,9));
}

}
