package non_null_check;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class PassTest1 {
@org.junit.Test
public void test3() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,1,4,4,10,3,2,8,10));
assertEquals(0, new Class1().run(list,30,1,9,11));
}

}
