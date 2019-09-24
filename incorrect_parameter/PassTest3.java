package incorrect_parameter;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class PassTest3 {
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

@org.junit.Test
public void test8() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,5,2,4,2,5,10,7,10,2,11,5,6));
assertEquals(-1, new Class1().run(list,20,1,7,11));
}

@org.junit.Test
public void test9() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,5,8,6,11,10,2,1,6,7));
assertEquals(-1, new Class1().run(list,18,2,8,12));
}

@org.junit.Test
public void test10() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,9,7,7,2,5));
assertEquals(-1, new Class1().run(list,14,2,4,8));
}

@org.junit.Test
public void test12() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,1,5,5,9));
assertEquals(-1, new Class1().run(list,11,1,8,14));
}

@org.junit.Test
public void test13() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,5,10,11,6,3,4));
assertEquals(-1, new Class1().run(list,40,2,5,8));
}

}
