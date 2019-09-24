package non_null_check;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class FailureTest1 {
@org.junit.Test
public void test0() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,4,9,7,9,4,8,1,1,4,5));
assertEquals(-1, new Class1().run(list,24,2,0,0));
}

}
