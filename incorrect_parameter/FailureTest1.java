package incorrect_parameter;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class FailureTest1 {
@org.junit.Test
public void test0() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,5,7,7,3,8,11,10,6));
assertEquals(40320, new Class1().run(list,25,1,8,8));
}

}
