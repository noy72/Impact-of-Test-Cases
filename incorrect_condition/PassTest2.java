package incorrect_condition;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class PassTest2 {
@org.junit.Test
public void test0() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,9,6,10,7,3,4,1,9));
assertEquals(-1, new Class1().run(list,31,1,8,9));
}

@org.junit.Test
public void test1() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,7,8,11,11,1,1,7,1,1,10));
assertEquals(-1, new Class1().run(list,22,2,10,10));
}

@org.junit.Test
public void test2() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,5,10,10,8));
assertEquals(-1, new Class1().run(list,18,2,8,10));
}

@org.junit.Test
public void test3() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,10,9,7,4,10,4,2,9));
assertEquals(-1, new Class1().run(list,40,2,0,7));
}

@org.junit.Test
public void test4() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,8,3,3,3,11,6,5,6,5,8,11,9,5));
assertEquals(-1, new Class1().run(list,16,1,1,12));
}

}
