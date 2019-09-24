package incorrect_overload;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class PassTest3 {
@org.junit.Test
public void test0() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,2,7,9,2,7,9,5));
assertEquals(-1, new Class1().run(list,29,2,9,10));
}

@org.junit.Test
public void test7() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,4,2,10,7,9,7));
assertEquals(-1, new Class1().run(list,24,2,1,3));
}

@org.junit.Test
public void test8() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,10,6,11,5,3,10,4,5,8,1,11,10));
assertEquals(-1, new Class1().run(list,15,1,10,11));
}

@org.junit.Test
public void test9() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,7,2,5,8,6,11,9,11,1,11,3));
assertEquals(-1, new Class1().run(list,35,2,10,13));
}

@org.junit.Test
public void test10() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,7,7,10,8,4,4,5,3,10,3,11,7));
assertEquals(-1, new Class1().run(list,37,2,4,11));
}

@org.junit.Test
public void test11() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,5,11,4,3,1,2,11,7,11,2,4,11,5,1));
assertEquals(-1, new Class1().run(list,32,1,7,14));
}

@org.junit.Test
public void test12() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,7,7,6,2,10,6,7,3));
assertEquals(-1, new Class1().run(list,4,1,1,8));
}

@org.junit.Test
public void test13() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,6,7,1,8,8));
assertEquals(-1, new Class1().run(list,14,1,4,11));
}

@org.junit.Test
public void test14() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,5,4,1,7,1,4,11,11,3,9,10,3));
assertEquals(-1, new Class1().run(list,2,1,10,15));
}

@org.junit.Test
public void test15() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,11,8,2,2,6,4));
assertEquals(-1, new Class1().run(list,10,1,10,12));
}

}
