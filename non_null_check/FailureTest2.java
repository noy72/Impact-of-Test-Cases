package non_null_check;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class FailureTest2 {
@org.junit.Test
public void test0() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,4,9,7,9,4,8,1,1,4,5));
assertEquals(-1, new Class1().run(list,24,2,0,0));
}

@org.junit.Test
public void test1() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,11,3,9,2,1,10,5,9,11,1,1,8,11,2));
assertEquals(-1, new Class1().run(list,26,2,2,5));
}

@org.junit.Test
public void test2() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,7,9,3,9,3,2));
assertEquals(-1, new Class1().run(list,1,8,4,8));
}

@org.junit.Test
public void test5() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,2,2,9,10,8,8));
assertEquals(-1, new Class1().run(list,37,1,3,10));
}

@org.junit.Test
public void test6() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,10,9,4,10,7,4,7,6,1));
assertEquals(-1, new Class1().run(list,1,12,2,9));
}

}
