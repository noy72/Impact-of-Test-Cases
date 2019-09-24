package incorrect_parameter;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class FailureTest3 {
@org.junit.Test
public void test0() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,5,7,7,3,8,11,10,6));
assertEquals(40320, new Class1().run(list,25,1,8,8));
}

@org.junit.Test
public void test3() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,3,8,9,4,11,3,7,9,10,4,7,4));
assertEquals(40647600, new Class1().run(list,22,1,7,11));
}

@org.junit.Test
public void test4() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,7,1,6,4,2,7,8,8,2,4,6,3,2));
assertEquals(1, new Class1().run(list,4,1,1,4));
}

@org.junit.Test
public void test11() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,10,2,1,5,10,9,4,8,4,7,5,8,9,4));
assertEquals(363024, new Class1().run(list,38,1,2,9));
}

@org.junit.Test
public void test24() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,11,3,1,10));
assertEquals(6, new Class1().run(list,29,1,3,8));
}

@org.junit.Test
public void test25() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,11,6,5,1,9,11,10,5,8,6,11));
assertEquals(39916800, new Class1().run(list,5,1,10,15));
}

@org.junit.Test
public void test32() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,2,4,2,4,11,3,2,3));
assertEquals(362880, new Class1().run(list,3,1,9,13));
}

@org.junit.Test
public void test41() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,5,8,8,3,6,7));
assertEquals(6, new Class1().run(list,12,1,3,11));
}

@org.junit.Test
public void test42() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,1,2,6,3));
assertEquals(720, new Class1().run(list,29,1,5,11));
}

@org.junit.Test
public void test48() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,7,7,1,7,9,4,9,7,2,11,1,10));
assertEquals(2, new Class1().run(list,10,1,0,5));
}

}
