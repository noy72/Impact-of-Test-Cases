package incorrect_overload;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class FailureTest2 {
@org.junit.Test
public void test1() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,2,7,8,4,3,1,11));
assertEquals(0, new Class1().run(list,3,1,8,12));
}

@org.junit.Test
public void test2() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,6,7,6,4,11,11,6));
assertEquals(79840104, new Class1().run(list,15,1,1,13));
}

@org.junit.Test
public void test3() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,8,2,6,10,2,6,11,3,1,4,1));
assertEquals(0, new Class1().run(list,31,1,4,5));
}

@org.junit.Test
public void test4() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,9,3,1,6,11,5,4,10,7,5,1));
assertEquals(847, new Class1().run(list,7,1,0,8));
}

@org.junit.Test
public void test5() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,8,4,5,9));
assertEquals(40320, new Class1().run(list,24,1,7,8));
}

}
