package incorrect_overload_many_tests;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class PassTest1 {
@org.junit.Test
public void test0() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,3,11,5,4,9,11,7,7,4,10,1));
assertEquals(-1, new Class1().run(list,8,2,5,14));
}

@org.junit.Test
public void test2() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,6,2,2,7,7,6));
assertEquals(-1, new Class1().run(list,4,2,0,5));
}

@org.junit.Test
public void test4() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,1,1,8,7,2,1,5,11,11,6,7,7,1));
assertEquals(-1, new Class1().run(list,11,2,3,9));
}

@org.junit.Test
public void test5() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,7,7,1,10,10));
assertEquals(-1, new Class1().run(list,2,2,2,13));
}

@org.junit.Test
public void test7() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,9,3,7,4,10));
assertEquals(-1, new Class1().run(list,36,1,5,5));
}

@org.junit.Test
public void test8() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,5,4,9,10,10,5,5));
assertEquals(-1, new Class1().run(list,2,1,5,5));
}

@org.junit.Test
public void test9() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,9,3,5,10,5,9,4,2,7));
assertEquals(-1, new Class1().run(list,23,2,2,3));
}

@org.junit.Test
public void test10() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,5,6,2,2,6,2,11));
assertEquals(-1, new Class1().run(list,12,2,1,3));
}

@org.junit.Test
public void test11() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,5,4,5,3));
assertEquals(-1, new Class1().run(list,34,2,8,10));
}

@org.junit.Test
public void test12() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,5,1,9,9,5));
assertEquals(-1, new Class1().run(list,21,1,3,14));
}

}
