package non_null_check_many_tests;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class PassTest4 {
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

@org.junit.Test
public void test226() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,10,3,2,2,4,7));
assertEquals(3628824, new Class1().run(list,20,1,4,11));
}

@org.junit.Test
public void test228() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,7,8,3,10,9,1,6,1));
assertEquals(4037766, new Class1().run(list,29,1,3,14));
}

@org.junit.Test
public void test232() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,8,6,10,8,3,11,8,1,2,6,8,7,5));
assertEquals(0, new Class1().run(list,11,1,9,12));
}

@org.junit.Test
public void test236() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,10,9,3,6,3,11,5,7,11,2,3));
assertEquals(83831174, new Class1().run(list,11,1,1,11));
}

@org.junit.Test
public void test237() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,2,5,10,7));
assertEquals(3628922, new Class1().run(list,24,1,0,10));
}

@org.junit.Test
public void test240() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,11,3,4,1,4,4));
assertEquals(39916800, new Class1().run(list,13,1,8,13));
}

@org.junit.Test
public void test246() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,1,8,10,6,7,1,3,8,3,9,5));
assertEquals(0, new Class1().run(list,8,1,10,14));
}

@org.junit.Test
public void test248() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,10,3,10,7,4,10));
assertEquals(7262664, new Class1().run(list,34,1,4,12));
}

@org.junit.Test
public void test249() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,6,4,3,5,2,5,5,4,1,11,10,3,7,9));
assertEquals(3634968, new Class1().run(list,29,1,4,10));
}

@org.junit.Test
public void test263() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,8,10,8,8,6,1,1,11,3,2,7,11,2,10));
assertEquals(720, new Class1().run(list,13,1,4,6));
}

@org.junit.Test
public void test268() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,11,4,9,1,10,4,5,4,11,4,10));
assertEquals(43545600, new Class1().run(list,10,1,7,12));
}

@org.junit.Test
public void test270() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,9,10,2,1,5,3,7,10,10,8,3,6));
assertEquals(3628800, new Class1().run(list,9,1,9,15));
}

@org.junit.Test
public void test272() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,4,3,5,8,4,4,11,5,1,6,2));
assertEquals(6, new Class1().run(list,7,1,0,3));
}

@org.junit.Test
public void test275() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,9,8,3,2,2,3,9,9,2,9,6,10,8));
assertEquals(6, new Class1().run(list,18,1,1,4));
}

@org.junit.Test
public void test279() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,5,2,11,4,4,3,1));
assertEquals(0, new Class1().run(list,29,1,6,6));
}

@org.junit.Test
public void test282() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,8,1,2,3,6,5,11,10,7,10,6,2,5));
assertEquals(47181000, new Class1().run(list,12,1,5,13));
}

@org.junit.Test
public void test284() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,1,7,7,1,1));
assertEquals(10080, new Class1().run(list,17,1,5,13));
}

@org.junit.Test
public void test285() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,5,8,6,5,5,5,2,9,11,11,5,8));
assertEquals(0, new Class1().run(list,36,1,5,6));
}

@org.junit.Test
public void test290() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,5,7,11,10,6,2,3,9,4,3,11,10,6,8));
assertEquals(3628800, new Class1().run(list,8,1,9,10));
}

@org.junit.Test
public void test299() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,2,7,8,11,2,4,8,9,10,1,3,10));
assertEquals(40320, new Class1().run(list,17,1,6,10));
}

@org.junit.Test
public void test300() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,9,10,11,1,1,1,10,4,9,1,8,4,4,2));
assertEquals(4032000, new Class1().run(list,13,1,7,13));
}

@org.junit.Test
public void test301() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,5,11,11,2,5,4,10,9,11));
assertEquals(26, new Class1().run(list,32,1,2,4));
}

@org.junit.Test
public void test307() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,7,3,2,6,4,6,9,3));
assertEquals(0, new Class1().run(list,21,1,8,12));
}

@org.junit.Test
public void test310() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,2,7,2,5,9,1,2,8));
assertEquals(5160, new Class1().run(list,26,1,3,8));
}

@org.junit.Test
public void test319() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,5,6,5,6,9,4,11,7,2,11));
assertEquals(744, new Class1().run(list,20,1,4,6));
}

@org.junit.Test
public void test324() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,4,3,10,3,4,4));
assertEquals(0, new Class1().run(list,5,1,6,7));
}

@org.junit.Test
public void test327() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,7,1,1,4,4,5,2,6,2,7,2,10,4,11));
assertEquals(0, new Class1().run(list,7,1,9,15));
}

@org.junit.Test
public void test328() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,8,11,4,10,9,3));
assertEquals(3628800, new Class1().run(list,19,1,6,15));
}

@org.junit.Test
public void test339() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,4,9,2,7,11,6,2,1,4,10));
assertEquals(5040, new Class1().run(list,21,1,7,8));
}

@org.junit.Test
public void test368() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,8,8,7,1));
assertEquals(0, new Class1().run(list,9,1,2,6));
}

@org.junit.Test
public void test375() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,9,10,3,6,2,9,11,3,11,9,7,1,8,7));
assertEquals(40279680, new Class1().run(list,38,1,8,14));
}

@org.junit.Test
public void test380() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,5,2,10,5,10,2,6,2,5,2,3,3,5));
assertEquals(7257600, new Class1().run(list,24,1,7,11));
}

@org.junit.Test
public void test381() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,11,1,11,4,9,11,3,1,6,10,1));
assertEquals(0, new Class1().run(list,17,1,8,10));
}

@org.junit.Test
public void test382() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,9,1,5,1,1,9,8,4,8,8));
assertEquals(403200, new Class1().run(list,31,1,6,11));
}

@org.junit.Test
public void test386() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,5,6,11,5,4,6,2,8,3,9,8,3,10));
assertEquals(39916800, new Class1().run(list,18,1,8,12));
}

@org.junit.Test
public void test392() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,8,8,1,5,8,6,11));
assertEquals(40320, new Class1().run(list,22,1,7,11));
}

@org.junit.Test
public void test407() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,10,5,10,6,3,2));
assertEquals(3628800, new Class1().run(list,18,1,8,11));
}

@org.junit.Test
public void test410() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,9,9,2,3,1,9,3,3));
assertEquals(0, new Class1().run(list,7,1,10,10));
}

@org.junit.Test
public void test416() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,8,5,3,7,6,9,9,5));
assertEquals(725760, new Class1().run(list,35,1,9,12));
}

@org.junit.Test
public void test417() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,11,10,9,5,5,4,2,6,7,3,7,3,1,8));
assertEquals(6030, new Class1().run(list,11,1,3,8));
}

@org.junit.Test
public void test431() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,10,11,6,5,1));
assertEquals(43546440, new Class1().run(list,35,1,5,15));
}

@org.junit.Test
public void test433() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,7,9,11,1,1,8));
assertEquals(0, new Class1().run(list,33,1,6,12));
}

@org.junit.Test
public void test435() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,5,5,7,8,2,11,1,2,9,1,11,6));
assertEquals(5040, new Class1().run(list,30,1,5,13));
}

@org.junit.Test
public void test437() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,2,10,9,11,2,1,6));
assertEquals(43545600, new Class1().run(list,31,1,10,14));
}

@org.junit.Test
public void test443() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,1,5,6,7));
assertEquals(120, new Class1().run(list,33,1,2,10));
}

@org.junit.Test
public void test450() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,8,4,7,1,11,1,9,9));
assertEquals(24, new Class1().run(list,15,1,4,5));
}

@org.junit.Test
public void test460() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,1,9,8,11,9,4));
assertEquals(40321, new Class1().run(list,20,1,0,8));
}

@org.junit.Test
public void test465() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,3,8,1,4,3,11,6,9));
assertEquals(39957120, new Class1().run(list,35,1,7,12));
}

@org.junit.Test
public void test468() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,10,3,5,11,9,3,11,3,4,7,11,1,9));
assertEquals(5064, new Class1().run(list,39,1,4,8));
}

@org.junit.Test
public void test473() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,5,11,9,10,5,9,1,2,7,3,8,3,1));
assertEquals(3991680, new Class1().run(list,40,1,9,15));
}

@org.junit.Test
public void test476() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,11,7,3,2,7));
assertEquals(39921846, new Class1().run(list,17,1,3,11));
}

@org.junit.Test
public void test477() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,6,5,4,7,8,1,3));
assertEquals(0, new Class1().run(list,37,1,9,9));
}

@org.junit.Test
public void test480() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,9,1,6,10,10,7,1,2));
assertEquals(362880, new Class1().run(list,35,1,9,9));
}

@org.junit.Test
public void test481() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,7,1,6,7,1,9,5,4,3,4,3,2));
assertEquals(0, new Class1().run(list,10,1,0,0));
}

@org.junit.Test
public void test485() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,11,3,9,1,7,5));
assertEquals(1, new Class1().run(list,5,1,0,12));
}

@org.junit.Test
public void test494() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,6,1,1,10,1,1,7,8,8,2,4,8,3,1));
assertEquals(5040, new Class1().run(list,38,1,4,8));
}

@org.junit.Test
public void test501() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,8,2,2,9,2,1,8,2,9,6,4,1,10,6));
assertEquals(1, new Class1().run(list,7,1,1,1));
}

@org.junit.Test
public void test503() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,6,6,1,11,9,7,6,1,5,1));
assertEquals(0, new Class1().run(list,18,1,10,12));
}

@org.junit.Test
public void test506() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,5,1,9,6,9,1,11,9,10,10,8,6,5,11));
assertEquals(1, new Class1().run(list,4,1,1,1));
}

@org.junit.Test
public void test511() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,9,8,6,9,10,1));
assertEquals(40320, new Class1().run(list,4,1,8,8));
}

}
