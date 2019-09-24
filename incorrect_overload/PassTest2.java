package incorrect_overload;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class PassTest2 {
@org.junit.Test
public void test0() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,2,7,9,2,7,9,5));
assertEquals(-1, new Class1().run(list,29,2,9,10));
}

@org.junit.Test
public void test7() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,4,2,10,7,9,7));
assertEquals(-1, new Class1().run(list,24,2,1,3));
}

@org.junit.Test
public void test8() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,10,6,11,5,3,10,4,5,8,1,11,10));
assertEquals(-1, new Class1().run(list,15,1,10,11));
}

@org.junit.Test
public void test9() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,7,2,5,8,6,11,9,11,1,11,3));
assertEquals(-1, new Class1().run(list,35,2,10,13));
}

@org.junit.Test
public void test10() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,7,7,10,8,4,4,5,3,10,3,11,7));
assertEquals(-1, new Class1().run(list,37,2,4,11));
}

}
