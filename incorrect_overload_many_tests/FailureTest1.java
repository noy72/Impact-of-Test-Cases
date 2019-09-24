package incorrect_overload_many_tests;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class FailureTest1 {
@org.junit.Test
public void test1() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,5,9,10,7,3,2,10,3,1,8,5,1,2));
assertEquals(40320, new Class1().run(list,11,1,3,13));
}

@org.junit.Test
public void test3() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,1,1,2,8,2,8,11,6,11,3,8,9));
assertEquals(0, new Class1().run(list,17,1,6,8));
}

@org.junit.Test
public void test6() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,11,5,4,6,8,6,5));
assertEquals(39958704, new Class1().run(list,15,1,4,15));
}

@org.junit.Test
public void test19() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,8,1,3,9,1,8,11,8,9,10));
assertEquals(0, new Class1().run(list,16,1,7,8));
}

@org.junit.Test
public void test20() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,5,7,1,10,5,9,2,10,7,2,8,11,10));
assertEquals(2, new Class1().run(list,10,1,2,2));
}

}
