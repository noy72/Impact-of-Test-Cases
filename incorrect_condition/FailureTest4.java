package incorrect_condition;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class FailureTest4 {
@org.junit.Test
public void test9() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,8,4,3,8,2,8,8,9,4,2,8,1,10));
assertEquals(161280, new Class1().run(list,26,1,8,8));
}

@org.junit.Test
public void test25() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,10,3,5,8,5,2,3,2,5,3,10,9));
assertEquals(40560, new Class1().run(list,24,1,4,13));
}

@org.junit.Test
public void test33() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,4,1,2,7,2,1,5,4,4,4));
assertEquals(5040, new Class1().run(list,20,1,7,8));
}

@org.junit.Test
public void test49() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,11,8,1,4,4,2,3,7,7,3,5,6));
assertEquals(48, new Class1().run(list,35,1,4,5));
}

@org.junit.Test
public void test52() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,3,8,9,2,6,11));
assertEquals(0, new Class1().run(list,17,1,10,13));
}

@org.junit.Test
public void test73() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,8,11,9,4,10,5,7,11,1,7,3));
assertEquals(3633840, new Class1().run(list,32,1,6,10));
}

@org.junit.Test
public void test76() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,8,1,5,6,2,5,5,11,2,4,8,5,6,4));
assertEquals(0, new Class1().run(list,38,1,8,13));
}

@org.junit.Test
public void test81() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,8,8,10,5,3,8));
assertEquals(3628800, new Class1().run(list,39,1,9,10));
}

@org.junit.Test
public void test84() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,10,7,7,1,6,6,5,8,4,6,9,6,3,3));
assertEquals(3024, new Class1().run(list,13,1,4,7));
}

@org.junit.Test
public void test92() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,2,9,2,4,11,9,10,1,3,5,9,5,8,7));
assertEquals(44271360, new Class1().run(list,13,1,8,13));
}

@org.junit.Test
public void test94() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,11,4,3,6,9));
assertEquals(39917544, new Class1().run(list,5,1,4,12));
}

@org.junit.Test
public void test100() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,9,5,3));
assertEquals(363000, new Class1().run(list,24,1,4,9));
}

@org.junit.Test
public void test117() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,10,4,3,1,4,8,5,4,11,1,9,2));
assertEquals(0, new Class1().run(list,12,1,6,6));
}

@org.junit.Test
public void test138() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,7,4,9,10,9,2,7,7,1,7,4));
assertEquals(0, new Class1().run(list,6,1,6,6));
}

@org.junit.Test
public void test139() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,5,6,10,9,7));
assertEquals(3628800, new Class1().run(list,17,1,10,14));
}

@org.junit.Test
public void test140() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,10,3,11,7,7,1,4,7));
assertEquals(43545600, new Class1().run(list,33,1,10,14));
}

@org.junit.Test
public void test145() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,11,9,10,2,2,8,5));
assertEquals(43908480, new Class1().run(list,28,1,8,11));
}

@org.junit.Test
public void test149() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,9,8,10,5,2,10,1,10,6,3));
assertEquals(7257600, new Class1().run(list,9,1,6,15));
}

@org.junit.Test
public void test160() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,4,4,11,1,9,6,6,1,7,3,5));
assertEquals(40279680, new Class1().run(list,19,1,8,14));
}

@org.junit.Test
public void test164() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,3,7,1,7,1,2,6,4,8));
assertEquals(5762, new Class1().run(list,8,1,2,15));
}

}
