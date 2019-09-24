package incorrect_method;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class PassTest1 {
@org.junit.Test
public void test0() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,5,6,2,10,3,2,5,3,11,2));
assertEquals(-1, new Class1().run(list,28,2,0,11));
}

}
