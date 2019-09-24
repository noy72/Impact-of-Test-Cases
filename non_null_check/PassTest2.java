package non_null_check;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class PassTest2 {
@org.junit.Test
public void test3() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,1,4,4,10,3,2,8,10));
assertEquals(0, new Class1().run(list,30,1,9,11));
}

@org.junit.Test
public void test4() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,3,3,5,5,8,9));
assertEquals(120, new Class1().run(list,26,1,3,7));
}

@org.junit.Test
public void test9() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,1,2,4,8,9,3,1,1,10,4,2,9,7));
assertEquals(0, new Class1().run(list,32,1,6,12));
}

@org.junit.Test
public void test17() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,2,7,10,3,10,10,1,1,6,1,4,9,6,4));
assertEquals(0, new Class1().run(list,9,1,8,8));
}

@org.junit.Test
public void test18() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,2,6,5,8,8,3,3,8,3,9,2));
assertEquals(0, new Class1().run(list,17,1,9,13));
}

}
