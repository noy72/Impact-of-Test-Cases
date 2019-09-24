package incorrect_method;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class FailureTest1 {
@org.junit.Test
public void test8() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,6,2,9,5,8,4,2,9,3,5,1));
assertEquals(404066, new Class1().run(list,31,1,0,14));
}

}
