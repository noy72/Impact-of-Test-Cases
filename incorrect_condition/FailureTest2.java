package incorrect_condition;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class FailureTest2 {
@org.junit.Test
public void test9() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,8,4,3,8,2,8,8,9,4,2,8,1,10));
assertEquals(161280, new Class1().run(list,26,1,8,8));
}

@org.junit.Test
public void test25() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,10,3,5,8,5,2,3,2,5,3,10,9));
assertEquals(40560, new Class1().run(list,24,1,4,13));
}

@org.junit.Test
public void test33() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,4,1,2,7,2,1,5,4,4,4));
assertEquals(5040, new Class1().run(list,20,1,7,8));
}

@org.junit.Test
public void test49() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,11,8,1,4,4,2,3,7,7,3,5,6));
assertEquals(48, new Class1().run(list,35,1,4,5));
}

@org.junit.Test
public void test52() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,3,8,9,2,6,11));
assertEquals(0, new Class1().run(list,17,1,10,13));
}

}
