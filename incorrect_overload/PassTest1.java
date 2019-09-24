package incorrect_overload;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class PassTest1 {
@org.junit.Test
public void test0() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,2,7,9,2,7,9,5));
assertEquals(-1, new Class1().run(list,29,2,9,10));
}

}
