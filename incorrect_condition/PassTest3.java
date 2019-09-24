package incorrect_condition;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class PassTest3 {
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

@org.junit.Test
public void test5() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,3,3,9,8,2,1,7,4,10,10,10,11,7,3));
assertEquals(-1, new Class1().run(list,6,2,1,2));
}

@org.junit.Test
public void test6() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,4,10,6,2,4,2,4,9,7,1,1,2,7));
assertEquals(-1, new Class1().run(list,16,1,4,14));
}

@org.junit.Test
public void test7() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,3,10,5,3,1,2,11,9,5,3,6,1));
assertEquals(-1, new Class1().run(list,18,1,4,9));
}

@org.junit.Test
public void test8() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,2,7,3,10,1));
assertEquals(-1, new Class1().run(list,38,2,8,15));
}

@org.junit.Test
public void test10() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,1,4,4,8,5,1,8,4,1));
assertEquals(-1, new Class1().run(list,38,2,5,12));
}

}
