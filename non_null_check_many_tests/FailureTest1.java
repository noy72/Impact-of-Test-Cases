package non_null_check_many_tests;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class FailureTest1 {
@org.junit.Test
public void test0() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,9,5,7,11,1,9,4,1,10,3,3));
assertEquals(-1, new Class1().run(list,15,1,7,14));
}

@org.junit.Test
public void test1() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,1,5,10,6,6,1,7,6,2,6,3,7,10));
assertEquals(-1, new Class1().run(list,33,2,6,8));
}

@org.junit.Test
public void test2() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,3,7,9,1,9,9,1,6,2,4,2,4));
assertEquals(-1, new Class1().run(list,31,1,1,2));
}

@org.junit.Test
public void test4() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,9,10,9,10,8,10,3,7,1,6));
assertEquals(-1, new Class1().run(list,25,1,4,12));
}

@org.junit.Test
public void test5() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,1,8,1,1,8,1,4,5,11,7,9,4,9));
assertEquals(-1, new Class1().run(list,24,2,0,8));
}

}
