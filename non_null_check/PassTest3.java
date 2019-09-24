package non_null_check;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class PassTest3 {
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

@org.junit.Test
public void test33() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,11,10,11,6,4,9));
assertEquals(3628800, new Class1().run(list,18,1,3,10));
}

@org.junit.Test
public void test40() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,2,4,7,4,4,6,1,8));
assertEquals(74, new Class1().run(list,33,1,1,4));
}

@org.junit.Test
public void test49() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,11,1,7,9,11,5));
assertEquals(0, new Class1().run(list,26,1,6,8));
}

@org.junit.Test
public void test61() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,8,1,4,10,10,8,5,8,8,11,1,1,7,3));
assertEquals(80760, new Class1().run(list,39,1,2,11));
}

@org.junit.Test
public void test66() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,3,9,8,2,10,6,3,7,9,10,2,8,8));
assertEquals(0, new Class1().run(list,12,1,5,5));
}

}
