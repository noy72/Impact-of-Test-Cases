package non_null_check;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class PassTest4 {
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

@org.junit.Test
public void test68() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,7,9,6,10,11,2,3,5,5,2,11));
assertEquals(43545840, new Class1().run(list,10,1,5,15));
}

@org.junit.Test
public void test75() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,3,2,4,5,6,3,10,2,6,8,5));
assertEquals(0, new Class1().run(list,29,1,10,15));
}

@org.junit.Test
public void test87() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,4,5,4,4,3,3,9,10,3));
assertEquals(0, new Class1().run(list,39,1,6,8));
}

@org.junit.Test
public void test91() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,10,1,4,8,1,5));
assertEquals(0, new Class1().run(list,32,1,8,14));
}

@org.junit.Test
public void test94() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,9,10,1,5,11,1));
assertEquals(0, new Class1().run(list,31,1,1,6));
}

@org.junit.Test
public void test100() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,1,11,7,2,9,7,9,9,6,6,3));
assertEquals(40289760, new Class1().run(list,31,1,3,15));
}

@org.junit.Test
public void test103() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,11,2,3,4,7,6,6));
assertEquals(32, new Class1().run(list,37,1,0,6));
}

@org.junit.Test
public void test109() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,2,6,4,11,11,4,4));
assertEquals(0, new Class1().run(list,23,1,10,10));
}

@org.junit.Test
public void test112() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,3,5,1,9,9,8,11,6,7,8,2,8,7,9));
assertEquals(5042, new Class1().run(list,27,1,0,7));
}

@org.junit.Test
public void test115() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,8,7,6,1,4,10));
assertEquals(0, new Class1().run(list,39,1,4,5));
}

}
