package incorrect_parameter;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class PassTest4 {
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

@org.junit.Test
public void test14() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,6,2,5,2,5,7,1,7,7,2,2));
assertEquals(-1, new Class1().run(list,14,2,5,6));
}

@org.junit.Test
public void test15() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,3,10,7,1,1,4,9));
assertEquals(-1, new Class1().run(list,23,2,3,12));
}

@org.junit.Test
public void test16() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,11,5,2,3,11,1,5,4));
assertEquals(-1, new Class1().run(list,13,2,5,13));
}

@org.junit.Test
public void test17() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,3,4,10,5,10));
assertEquals(-1, new Class1().run(list,37,2,2,5));
}

@org.junit.Test
public void test18() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,7,4,2,4));
assertEquals(-1, new Class1().run(list,26,1,4,7));
}

@org.junit.Test
public void test19() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,9,7,9,8,4,5,7,5,6,2,10,1,5));
assertEquals(0, new Class1().run(list,24,1,10,12));
}

@org.junit.Test
public void test20() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,7,1,3,7,8,5,2,10,3,4,2));
assertEquals(-1, new Class1().run(list,21,1,6,12));
}

@org.junit.Test
public void test21() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,7,5,9,2,3,4,5,8,5,10,11,2,7,5));
assertEquals(-1, new Class1().run(list,10,2,8,14));
}

@org.junit.Test
public void test22() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,10,5,4,6,9,8,8,7));
assertEquals(-1, new Class1().run(list,24,2,6,11));
}

@org.junit.Test
public void test23() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,3,6,5,10,1));
assertEquals(0, new Class1().run(list,5,1,1,2));
}

}
