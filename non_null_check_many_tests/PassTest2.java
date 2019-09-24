package non_null_check_many_tests;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class PassTest2 {
@org.junit.Test
public void test3() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,5,7,3,6,1,9,7));
assertEquals(362880, new Class1().run(list,39,1,9,15));
}

@org.junit.Test
public void test8() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,4,7,9,4,3,9,2,4,7,2,11,4,4,11));
assertEquals(362880, new Class1().run(list,8,1,5,15));
}

@org.junit.Test
public void test13() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,10,10,7,10,5,6,1,11,2,10));
assertEquals(3633840, new Class1().run(list,6,1,6,14));
}

@org.junit.Test
public void test23() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,8,7,8,11,11,10));
assertEquals(45360, new Class1().run(list,32,1,1,11));
}

@org.junit.Test
public void test24() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,5,1,7,6,8,8,6,3,6,2,2,10));
assertEquals(0, new Class1().run(list,12,1,9,9));
}

@org.junit.Test
public void test47() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,7,9,1,7,4,4,7,9,10,9,10,10,10));
assertEquals(3628800, new Class1().run(list,24,1,10,14));
}

@org.junit.Test
public void test51() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,5,3,7,1,9,1,10,3,10));
assertEquals(0, new Class1().run(list,38,1,2,5));
}

@org.junit.Test
public void test56() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,5,4,7,1,6,4,6,11,2,9));
assertEquals(5041, new Class1().run(list,38,1,0,8));
}

@org.junit.Test
public void test65() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,9,3,2,4,11,2,9,1,4,4,5,5,2));
assertEquals(0, new Class1().run(list,4,1,4,14));
}

@org.junit.Test
public void test68() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,1,9,7,8,3));
assertEquals(408242, new Class1().run(list,34,1,0,13));
}

@org.junit.Test
public void test69() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,7,6,7,11,4,6,11,6,3,4,9));
assertEquals(39926880, new Class1().run(list,19,1,7,14));
}

@org.junit.Test
public void test70() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,2,4,8,8,6,1));
assertEquals(0, new Class1().run(list,38,1,7,9));
}

@org.junit.Test
public void test85() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,2,4,11,10,3));
assertEquals(43545600, new Class1().run(list,17,1,6,15));
}

@org.junit.Test
public void test86() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,1,10,6,8,4,2,10,5,2,4,1,7));
assertEquals(720, new Class1().run(list,4,1,6,9));
}

@org.junit.Test
public void test87() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,4,10,5,5,10,3,4,11,8));
assertEquals(24, new Class1().run(list,8,1,4,4));
}

@org.junit.Test
public void test88() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,4,8,5,4,6,2,10,2,4));
assertEquals(0, new Class1().run(list,18,1,7,13));
}

@org.junit.Test
public void test103() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,8,4,4,1,7,9,11,5,5,3,3));
assertEquals(0, new Class1().run(list,18,1,3,3));
}

@org.junit.Test
public void test110() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,8,3,4,7,10,9,1,8,2,2,10));
assertEquals(45360, new Class1().run(list,10,1,4,8));
}

@org.junit.Test
public void test111() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,10,10,6,11,2,8,8,10,8,2,6));
assertEquals(0, new Class1().run(list,22,1,6,7));
}

@org.junit.Test
public void test112() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,7,8,3,8,8,6,7,9,6));
assertEquals(86400, new Class1().run(list,18,1,2,15));
}

@org.junit.Test
public void test115() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,5,8,7,5,9,9,1,10,3,8,10));
assertEquals(4435200, new Class1().run(list,23,1,8,13));
}

@org.junit.Test
public void test121() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,9,4,5,5,10,7,5,6,1,2,8,2,6,7));
assertEquals(46320, new Class1().run(list,28,1,4,9));
}

@org.junit.Test
public void test133() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,9,7,2,10,5,5,2,6,9,7,9,4,9,5));
assertEquals(0, new Class1().run(list,19,1,4,5));
}

@org.junit.Test
public void test143() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,3,7,4,7,11,7,4,11,3,4,9));
assertEquals(79833600, new Class1().run(list,23,1,10,11));
}

@org.junit.Test
public void test146() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,4,7,6,6,6,8,9,5,7,7,4));
assertEquals(0, new Class1().run(list,6,1,10,10));
}

@org.junit.Test
public void test157() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,11,3,4,9,10,11,3));
assertEquals(83825280, new Class1().run(list,15,1,6,13));
}

@org.junit.Test
public void test162() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,11,6,6,6,5,11,11,11,4,7,4,8,6));
assertEquals(0, new Class1().run(list,38,1,0,0));
}

@org.junit.Test
public void test169() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,1,9,2,1,1,5,6));
assertEquals(362880, new Class1().run(list,39,1,9,9));
}

@org.junit.Test
public void test171() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,8,5,8,8,7,9,8,5,11,7,2));
assertEquals(131160, new Class1().run(list,6,1,0,12));
}

@org.junit.Test
public void test179() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,9,9,1,3,11,10,8));
assertEquals(725760, new Class1().run(list,27,1,3,12));
}

@org.junit.Test
public void test189() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,5,5,2,9,8,9,11,2));
assertEquals(39916800, new Class1().run(list,26,1,10,12));
}

@org.junit.Test
public void test196() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,5,1,10,11,4,5,5,11,10,8,5,3,3,5));
assertEquals(39916800, new Class1().run(list,38,1,10,14));
}

@org.junit.Test
public void test200() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,3,8,3,2,1,5));
assertEquals(0, new Class1().run(list,11,1,9,14));
}

@org.junit.Test
public void test201() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,10,7,10,3,8));
assertEquals(7257600, new Class1().run(list,11,1,10,10));
}

@org.junit.Test
public void test203() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,9,7,1,10,6,2,2));
assertEquals(3997440, new Class1().run(list,7,1,4,13));
}

@org.junit.Test
public void test208() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,6,5,3,10,9,4,1,3,10,11,10));
assertEquals(47538156, new Class1().run(list,11,1,3,12));
}

@org.junit.Test
public void test215() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,9,3,7,7,10,11,5,6,7,9,3,2));
assertEquals(44287200, new Class1().run(list,12,1,6,11));
}

@org.junit.Test
public void test216() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,2,9,11,9,10,4,6,1,3,5,8,4));
assertEquals(720, new Class1().run(list,11,1,6,6));
}

@org.junit.Test
public void test220() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,3,9,7,3,7,1,5,6,7,6,9,9));
assertEquals(0, new Class1().run(list,30,1,8,10));
}

@org.junit.Test
public void test222() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,3,2,9,5,11,9,2,3,1,8,1));
assertEquals(40279680, new Class1().run(list,34,1,8,11));
}

}
