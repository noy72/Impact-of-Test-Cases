package non_null_check;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class FailureTest4 {
@org.junit.Test
public void test0() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,4,9,7,9,4,8,1,1,4,5));
assertEquals(-1, new Class1().run(list,24,2,0,0));
}

@org.junit.Test
public void test1() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,11,3,9,2,1,10,5,9,11,1,1,8,11,2));
assertEquals(-1, new Class1().run(list,26,2,2,5));
}

@org.junit.Test
public void test2() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,7,9,3,9,3,2));
assertEquals(-1, new Class1().run(list,1,8,4,8));
}

@org.junit.Test
public void test5() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,2,2,9,10,8,8));
assertEquals(-1, new Class1().run(list,37,1,3,10));
}

@org.junit.Test
public void test6() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,10,9,4,10,7,4,7,6,1));
assertEquals(-1, new Class1().run(list,1,12,2,9));
}

@org.junit.Test
public void test7() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,4,3,7,8,3,3,8));
assertEquals(-1, new Class1().run(list,28,2,8,9));
}

@org.junit.Test
public void test8() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,9,4,6,4,4,11));
assertEquals(-1, new Class1().run(list,7,2,8,14));
}

@org.junit.Test
public void test10() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,9,1,3,6,4,1,2,5,11,1,4));
assertEquals(-1, new Class1().run(list,32,2,10,15));
}

@org.junit.Test
public void test11() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,4,9,11,3,9,7,3,3,5,9,11,6));
assertEquals(-1, new Class1().run(list,14,2,5,8));
}

@org.junit.Test
public void test12() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,7,5,9,7,5,11,11,4));
assertEquals(-1, new Class1().run(list,4,2,1,12));
}

@org.junit.Test
public void test13() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,7,1,8,2,5,10,1,4,9,10,11,5,8,11));
assertEquals(-1, new Class1().run(list,5,2,8,12));
}

@org.junit.Test
public void test14() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,5,6,4,11,1,10,8,5,4,5,5,4,7));
assertEquals(-1, new Class1().run(list,14,1,7,12));
}

@org.junit.Test
public void test15() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,6,1,8,11,7,11,11,1,2,1));
assertEquals(-1, new Class1().run(list,13,1,2,4));
}

@org.junit.Test
public void test16() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,4,7,4,9,10,1,5,10,4,2,2,1,3));
assertEquals(-1, new Class1().run(list,31,2,5,12));
}

@org.junit.Test
public void test19() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,5,7,2,8,4,9,9,8,4,6,3,7));
assertEquals(-1, new Class1().run(list,6,1,2,14));
}

@org.junit.Test
public void test20() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,4,2,10,10,4,5));
assertEquals(-1, new Class1().run(list,40,1,10,14));
}

@org.junit.Test
public void test21() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,1,9,2,7,8,1,4,1,11,11,2));
assertEquals(-1, new Class1().run(list,14,2,9,14));
}

@org.junit.Test
public void test22() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,7,2,5,5,5,8,1,10,8,1,1,4));
assertEquals(-1, new Class1().run(list,2,2,4,15));
}

@org.junit.Test
public void test23() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,7,4,8,11,3));
assertEquals(-1, new Class1().run(list,4,2,3,11));
}

@org.junit.Test
public void test24() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,7,9,8,5,6));
assertEquals(-1, new Class1().run(list,30,1,1,3));
}

}
