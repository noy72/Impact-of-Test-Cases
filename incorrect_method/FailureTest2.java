package incorrect_method;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class FailureTest2 {
@org.junit.Test
public void test8() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,6,2,9,5,8,4,2,9,3,5,1));
assertEquals(404066, new Class1().run(list,31,1,0,14));
}

@org.junit.Test
public void test14() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,9,11,11,9,10,2,2,8,10,11,4,6,11,9));
assertEquals(3991680, new Class1().run(list,23,1,8,14));
}

@org.junit.Test
public void test24() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,5,11,5,8,5,10,10,3,1,4,6,9,10,10));
assertEquals(720, new Class1().run(list,12,1,6,9));
}

@org.junit.Test
public void test39() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,1,1,8,3));
assertEquals(40320, new Class1().run(list,29,1,6,11));
}

@org.junit.Test
public void test59() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,2,5,4,7,4,10,9));
assertEquals(3634010, new Class1().run(list,7,1,2,10));
}

}
