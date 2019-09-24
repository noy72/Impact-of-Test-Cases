package incorrect_overload;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class FailureTest1 {
@org.junit.Test
public void test1() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,2,7,8,4,3,1,11));
assertEquals(0, new Class1().run(list,3,1,8,12));
}

}
