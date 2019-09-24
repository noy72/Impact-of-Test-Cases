package non_null_check_many_tests;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class PassTest1 {
@org.junit.Test
public void test3() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,5,7,3,6,1,9,7));
assertEquals(362880, new Class1().run(list,39,1,9,15));
}

@org.junit.Test
public void test8() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,4,7,9,4,3,9,2,4,7,2,11,4,4,11));
assertEquals(362880, new Class1().run(list,8,1,5,15));
}

@org.junit.Test
public void test13() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,10,10,7,10,5,6,1,11,2,10));
assertEquals(3633840, new Class1().run(list,6,1,6,14));
}

@org.junit.Test
public void test23() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,8,7,8,11,11,10));
assertEquals(45360, new Class1().run(list,32,1,1,11));
}

@org.junit.Test
public void test24() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,5,1,7,6,8,8,6,3,6,2,2,10));
assertEquals(0, new Class1().run(list,12,1,9,9));
}

@org.junit.Test
public void test47() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,7,9,1,7,4,4,7,9,10,9,10,10,10));
assertEquals(3628800, new Class1().run(list,24,1,10,14));
}

@org.junit.Test
public void test51() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,5,3,7,1,9,1,10,3,10));
assertEquals(0, new Class1().run(list,38,1,2,5));
}

@org.junit.Test
public void test56() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,5,4,7,1,6,4,6,11,2,9));
assertEquals(5041, new Class1().run(list,38,1,0,8));
}

@org.junit.Test
public void test65() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,9,3,2,4,11,2,9,1,4,4,5,5,2));
assertEquals(0, new Class1().run(list,4,1,4,14));
}

@org.junit.Test
public void test68() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,1,9,7,8,3));
assertEquals(408242, new Class1().run(list,34,1,0,13));
}

}
