package incorrect_method;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class PassTest2 {
@org.junit.Test
public void test0() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,5,6,2,10,3,2,5,3,11,2));
assertEquals(-1, new Class1().run(list,28,2,0,11));
}

@org.junit.Test
public void test1() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,7,1,10,9,2,1));
assertEquals(0, new Class1().run(list,24,1,2,14));
}

@org.junit.Test
public void test2() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,4,4,7,9,8,5,10,3,5));
assertEquals(-1, new Class1().run(list,5,1,4,5));
}

@org.junit.Test
public void test3() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,7,6,5,11,7,6,5,4,3,10));
assertEquals(-1, new Class1().run(list,23,1,5,12));
}

@org.junit.Test
public void test4() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,1,10,3,8,10,2,7,7,3,4,7));
assertEquals(-1, new Class1().run(list,21,1,3,3));
}

}
