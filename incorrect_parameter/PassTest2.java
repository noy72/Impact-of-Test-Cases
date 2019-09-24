package incorrect_parameter;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class PassTest2 {
@org.junit.Test
public void test1() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,8,3,7,2));
assertEquals(-1, new Class1().run(list,22,2,5,6));
}

@org.junit.Test
public void test2() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,7,8,6,6,9,4,1,1,3,1,2));
assertEquals(-1, new Class1().run(list,38,2,1,9));
}

@org.junit.Test
public void test5() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,3,9,2,3,5,4,4,9,6,9,3,4,8,2));
assertEquals(-1, new Class1().run(list,29,2,9,10));
}

@org.junit.Test
public void test6() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,11,10,7,2,3,1,7));
assertEquals(-1, new Class1().run(list,13,2,10,14));
}

@org.junit.Test
public void test7() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,1,5,3,11,9,9,5,2,1,3,11,7,11,5));
assertEquals(-1, new Class1().run(list,36,1,1,8));
}

}
