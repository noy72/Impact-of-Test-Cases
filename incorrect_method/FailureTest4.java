package incorrect_method;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class FailureTest4 {
@org.junit.Test
public void test8() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,6,2,9,5,8,4,2,9,3,5,1));
assertEquals(404066, new Class1().run(list,31,1,0,14));
}

@org.junit.Test
public void test14() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,9,11,11,9,10,2,2,8,10,11,4,6,11,9));
assertEquals(3991680, new Class1().run(list,23,1,8,14));
}

@org.junit.Test
public void test24() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,5,11,5,8,5,10,10,3,1,4,6,9,10,10));
assertEquals(720, new Class1().run(list,12,1,6,9));
}

@org.junit.Test
public void test39() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,1,1,8,3));
assertEquals(40320, new Class1().run(list,29,1,6,11));
}

@org.junit.Test
public void test59() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,2,5,4,7,4,10,9));
assertEquals(3634010, new Class1().run(list,7,1,2,10));
}

@org.junit.Test
public void test65() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,4,3,11,11,3,5,1,11,10,3,1,10,2,10));
assertEquals(127008000, new Class1().run(list,29,1,8,12));
}

@org.junit.Test
public void test76() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,5,7,10,7,4,11,2,3,8,7,1,7));
assertEquals(43545600, new Class1().run(list,9,1,8,12));
}

@org.junit.Test
public void test78() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,6,7,7,9,10,4,2,10,5));
assertEquals(7631306, new Class1().run(list,39,1,2,13));
}

@org.junit.Test
public void test84() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,6,7,7,9,4,8,6,7,3,4));
assertEquals(367920, new Class1().run(list,27,1,7,12));
}

@org.junit.Test
public void test92() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,6,1,11,6,11,2));
assertEquals(720, new Class1().run(list,5,1,2,11));
}

@org.junit.Test
public void test96() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,11,10,2,2,10,11,7,6));
assertEquals(43585920, new Class1().run(list,21,1,4,15));
}

@org.junit.Test
public void test104() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,6,9,4,4,5,4,2,3,6,5,2));
assertEquals(48, new Class1().run(list,17,1,2,4));
}

@org.junit.Test
public void test108() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,6,10,4,10,10,3,7,7));
assertEquals(10886400, new Class1().run(list,17,1,8,10));
}

@org.junit.Test
public void test110() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,5,4,3,5,5,8,10,5));
assertEquals(40320, new Class1().run(list,25,1,7,13));
}

@org.junit.Test
public void test118() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,8,6,9,3,11,10,11,9,7,2));
assertEquals(3991680, new Class1().run(list,20,1,7,10));
}

@org.junit.Test
public void test140() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,8,8,7,11,10,5,2));
assertEquals(43545600, new Class1().run(list,38,1,0,12));
}

@org.junit.Test
public void test142() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,3,2,10,2,4,7,1,7,9,2,2,2,7,9));
assertEquals(3628800, new Class1().run(list,26,1,10,14));
}

@org.junit.Test
public void test146() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,4,8,6,8,7,11,9,10,5,4,9,5,7,3));
assertEquals(44316984, new Class1().run(list,13,1,4,15));
}

@org.junit.Test
public void test159() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,2,8,6,3,10,11,8,3,10,2,1));
assertEquals(7257600, new Class1().run(list,10,1,10,10));
}

@org.junit.Test
public void test168() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,9,5,7,1,1,10,8,8,5,8,11,1,6,11));
assertEquals(3628800, new Class1().run(list,8,1,10,14));
}

}
