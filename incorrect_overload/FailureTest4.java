package incorrect_overload;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class FailureTest4 {
@org.junit.Test
public void test1() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,2,7,8,4,3,1,11));
assertEquals(0, new Class1().run(list,3,1,8,12));
}

@org.junit.Test
public void test2() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,6,7,6,4,11,11,6));
assertEquals(79840104, new Class1().run(list,15,1,1,13));
}

@org.junit.Test
public void test3() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,8,2,6,10,2,6,11,3,1,4,1));
assertEquals(0, new Class1().run(list,31,1,4,5));
}

@org.junit.Test
public void test4() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,9,3,1,6,11,5,4,10,7,5,1));
assertEquals(847, new Class1().run(list,7,1,0,8));
}

@org.junit.Test
public void test5() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,8,4,5,9));
assertEquals(40320, new Class1().run(list,24,1,7,8));
}

@org.junit.Test
public void test6() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,1,1,6,2,1,6,11,1,2,11));
assertEquals(4, new Class1().run(list,31,1,1,4));
}

@org.junit.Test
public void test17() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,11,9,6,6,3,1,10,7,9));
assertEquals(720, new Class1().run(list,8,1,5,8));
}

@org.junit.Test
public void test18() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,7,5,5,9,8,1,8,6,9));
assertEquals(443520, new Class1().run(list,28,1,7,11));
}

@org.junit.Test
public void test20() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,5,7,10,1,6,5,9,3));
assertEquals(0, new Class1().run(list,30,1,10,14));
}

@org.junit.Test
public void test21() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,11,8,8,10,10,4));
assertEquals(0, new Class1().run(list,12,1,0,7));
}

@org.junit.Test
public void test33() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,2,4,4,9,10,8,3));
assertEquals(3628800, new Class1().run(list,28,1,8,13));
}

@org.junit.Test
public void test37() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,7,5,7,6,5,5));
assertEquals(720, new Class1().run(list,20,1,6,6));
}

@org.junit.Test
public void test52() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,11,5,1,6,3,4,1,9,8,4,7,2,4));
assertEquals(362880, new Class1().run(list,12,1,9,9));
}

@org.junit.Test
public void test53() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,8,1,1,2,5,5,10,6,10,4,2,4,9,11));
assertEquals(840, new Class1().run(list,24,1,1,7));
}

@org.junit.Test
public void test54() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,6,11,3,2,6,9,10,11));
assertEquals(362880, new Class1().run(list,16,1,7,15));
}

@org.junit.Test
public void test56() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,10,5,7,10,3,5,11,5,5,3,10,9,2,3));
assertEquals(43545600, new Class1().run(list,8,1,9,13));
}

@org.junit.Test
public void test59() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,3,7,10,5,9,7,2,8,10,8,7,11,4,3));
assertEquals(45360, new Class1().run(list,9,1,6,8));
}

@org.junit.Test
public void test61() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,3,3,2,4,11,9));
assertEquals(39916838, new Class1().run(list,20,1,1,11));
}

@org.junit.Test
public void test67() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,9,8,6,4,7,6,3,10,4,10,6,1,2));
assertEquals(41040, new Class1().run(list,18,1,4,8));
}

@org.junit.Test
public void test69() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,5,11,3,11,10,7,8,4,7,3,7,11,6));
assertEquals(15150, new Class1().run(list,26,1,2,7));
}

}
