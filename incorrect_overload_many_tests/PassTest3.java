package incorrect_overload_many_tests;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class PassTest3 {
@org.junit.Test
public void test0() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,3,11,5,4,9,11,7,7,4,10,1));
assertEquals(-1, new Class1().run(list,8,2,5,14));
}

@org.junit.Test
public void test2() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,6,2,2,7,7,6));
assertEquals(-1, new Class1().run(list,4,2,0,5));
}

@org.junit.Test
public void test4() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,1,1,8,7,2,1,5,11,11,6,7,7,1));
assertEquals(-1, new Class1().run(list,11,2,3,9));
}

@org.junit.Test
public void test5() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,7,7,1,10,10));
assertEquals(-1, new Class1().run(list,2,2,2,13));
}

@org.junit.Test
public void test7() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,9,3,7,4,10));
assertEquals(-1, new Class1().run(list,36,1,5,5));
}

@org.junit.Test
public void test8() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,5,4,9,10,10,5,5));
assertEquals(-1, new Class1().run(list,2,1,5,5));
}

@org.junit.Test
public void test9() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,9,3,5,10,5,9,4,2,7));
assertEquals(-1, new Class1().run(list,23,2,2,3));
}

@org.junit.Test
public void test10() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,5,6,2,2,6,2,11));
assertEquals(-1, new Class1().run(list,12,2,1,3));
}

@org.junit.Test
public void test11() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,5,4,5,3));
assertEquals(-1, new Class1().run(list,34,2,8,10));
}

@org.junit.Test
public void test12() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,5,1,9,9,5));
assertEquals(-1, new Class1().run(list,21,1,3,14));
}

@org.junit.Test
public void test13() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,3,6,5,8,11,5,10,7,10,9,11,5,2,9));
assertEquals(-1, new Class1().run(list,4,2,7,11));
}

@org.junit.Test
public void test14() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,6,5,4,2,4,11));
assertEquals(-1, new Class1().run(list,12,2,0,14));
}

@org.junit.Test
public void test15() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,9,4,2,11,2,4,11,7,3,10,2));
assertEquals(-1, new Class1().run(list,11,2,10,11));
}

@org.junit.Test
public void test16() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,1,11,11,9,9,9,8,1,3,11,11,8,9));
assertEquals(-1, new Class1().run(list,30,2,0,5));
}

@org.junit.Test
public void test17() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,9,10,10,2,9,2,7));
assertEquals(-1, new Class1().run(list,25,1,0,9));
}

@org.junit.Test
public void test18() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,6,10,9,2,7));
assertEquals(-1, new Class1().run(list,23,2,5,10));
}

@org.junit.Test
public void test21() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,10,2,1,4,8,4,1));
assertEquals(-1, new Class1().run(list,15,2,0,15));
}

@org.junit.Test
public void test22() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,4,1,10,1,5,8,7,6));
assertEquals(-1, new Class1().run(list,13,2,7,11));
}

@org.junit.Test
public void test23() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,8,3,1,1,8,6,11,8,11,1));
assertEquals(-1, new Class1().run(list,22,2,1,10));
}

@org.junit.Test
public void test24() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,10,7,6,7,5,10,3,9,8,2,5,3,3));
assertEquals(-1, new Class1().run(list,16,2,9,10));
}

@org.junit.Test
public void test25() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,8,5,8,3,2,7,8,6,5,9));
assertEquals(-1, new Class1().run(list,35,2,7,12));
}

@org.junit.Test
public void test26() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,11,4,11,9,3,2,6,1));
assertEquals(-1, new Class1().run(list,17,2,3,12));
}

@org.junit.Test
public void test27() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,10,9,8,6,11));
assertEquals(-1, new Class1().run(list,32,2,1,5));
}

@org.junit.Test
public void test29() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,2,11,6,7,10,6,6,2));
assertEquals(-1, new Class1().run(list,5,1,10,13));
}

@org.junit.Test
public void test30() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,4,11,6,1));
assertEquals(-1, new Class1().run(list,30,1,7,7));
}

@org.junit.Test
public void test33() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,6,1,11,7,9,6,10,4,1,10));
assertEquals(-1, new Class1().run(list,21,2,1,4));
}

@org.junit.Test
public void test34() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,1,7,4,1,7,1,10,6,10,2,9,7,5));
assertEquals(-1, new Class1().run(list,16,1,0,4));
}

@org.junit.Test
public void test36() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,7,9,6,8));
assertEquals(-1, new Class1().run(list,21,2,3,11));
}

@org.junit.Test
public void test37() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,8,9,11,10,5,2,7));
assertEquals(-1, new Class1().run(list,17,1,9,10));
}

@org.junit.Test
public void test38() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,3,5,10,8,9,5,11,3,1,11,8,11));
assertEquals(-1, new Class1().run(list,29,1,0,14));
}

@org.junit.Test
public void test39() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,1,1,3,4,5,11));
assertEquals(-1, new Class1().run(list,36,1,3,14));
}

@org.junit.Test
public void test40() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,9,3,10,2));
assertEquals(-1, new Class1().run(list,16,1,4,8));
}

@org.junit.Test
public void test41() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,4,10,2,3,5,3,8,11,8));
assertEquals(-1, new Class1().run(list,38,2,1,1));
}

@org.junit.Test
public void test42() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,3,3,10,4,8,9,5,3,9));
assertEquals(-1, new Class1().run(list,27,2,8,15));
}

@org.junit.Test
public void test43() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,4,10,4,4,2,6,7));
assertEquals(-1, new Class1().run(list,16,1,7,15));
}

@org.junit.Test
public void test44() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,3,6,8,11,6,2,1,5,10,2));
assertEquals(-1, new Class1().run(list,24,2,0,12));
}

@org.junit.Test
public void test47() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,3,3,3,5));
assertEquals(-1, new Class1().run(list,18,1,10,13));
}

@org.junit.Test
public void test49() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,4,8,5,7,2));
assertEquals(-1, new Class1().run(list,20,1,7,9));
}

@org.junit.Test
public void test51() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,10,10,6,8));
assertEquals(-1, new Class1().run(list,26,2,7,14));
}

@org.junit.Test
public void test53() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,2,6,8,5,2,4,4,3,7));
assertEquals(-1, new Class1().run(list,37,1,5,5));
}

@org.junit.Test
public void test54() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,10,8,6,9,9,4,6,9,4));
assertEquals(-1, new Class1().run(list,3,2,1,3));
}

@org.junit.Test
public void test55() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,4,11,9,2,6,5,2,8));
assertEquals(-1, new Class1().run(list,19,2,6,12));
}

@org.junit.Test
public void test56() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,10,5,7,10));
assertEquals(-1, new Class1().run(list,1,18,8,9));
}

@org.junit.Test
public void test57() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,8,3,10,7));
assertEquals(-1, new Class1().run(list,30,2,2,11));
}

@org.junit.Test
public void test58() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,5,10,4,8));
assertEquals(-1, new Class1().run(list,20,2,1,15));
}

@org.junit.Test
public void test59() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,11,3,4,2,7,1,3,2));
assertEquals(-1, new Class1().run(list,35,2,3,7));
}

@org.junit.Test
public void test60() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,9,5,3,11,4,10,6,9));
assertEquals(-1, new Class1().run(list,14,2,6,6));
}

@org.junit.Test
public void test61() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,6,7,5,4,3));
assertEquals(-1, new Class1().run(list,32,2,7,12));
}

@org.junit.Test
public void test62() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,1,6,9,1,6,6,6,10));
assertEquals(-1, new Class1().run(list,2,1,9,15));
}

@org.junit.Test
public void test63() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,2,11,3,8,8,9,1,3));
assertEquals(-1, new Class1().run(list,9,1,2,12));
}

@org.junit.Test
public void test64() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,4,5,11,5,4,4,8,2,8));
assertEquals(-1, new Class1().run(list,32,1,2,9));
}

@org.junit.Test
public void test66() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,7,10,7,6,6,5,7));
assertEquals(-1, new Class1().run(list,9,1,4,15));
}

@org.junit.Test
public void test67() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,10,11,3,8,5));
assertEquals(-1, new Class1().run(list,12,1,2,7));
}

@org.junit.Test
public void test69() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,10,6,8,9,7,7,5));
assertEquals(-1, new Class1().run(list,40,2,1,7));
}

@org.junit.Test
public void test70() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,11,6,11,6,2,11,9,9,4,2,1,8,7));
assertEquals(-1, new Class1().run(list,11,2,3,7));
}

@org.junit.Test
public void test72() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,6,9,5,1,6,9,11,4,3,1,7,11,2,2));
assertEquals(-1, new Class1().run(list,9,2,9,14));
}

@org.junit.Test
public void test74() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,2,4,2,6,4,7,10,4,8));
assertEquals(-1, new Class1().run(list,26,2,2,5));
}

@org.junit.Test
public void test75() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,6,4,5,5,2,5,10));
assertEquals(-1, new Class1().run(list,25,2,0,7));
}

@org.junit.Test
public void test78() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,8,6,11,10,7,11,5,5));
assertEquals(-1, new Class1().run(list,21,2,0,11));
}

@org.junit.Test
public void test79() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,1,1,4,11,5,5,6,10,9,3));
assertEquals(-1, new Class1().run(list,33,1,1,4));
}

@org.junit.Test
public void test80() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,1,9,11,8,11,11,6,9,1,7,6,8,1,9));
assertEquals(-1, new Class1().run(list,11,2,0,1));
}

@org.junit.Test
public void test83() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,5,8,11,2,10));
assertEquals(-1, new Class1().run(list,39,1,3,9));
}

@org.junit.Test
public void test85() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,8,11,10,7,4,6,5));
assertEquals(-1, new Class1().run(list,7,2,4,13));
}

@org.junit.Test
public void test86() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,5,9,3,1,4,2,11,2,9,2,9,4,4,9));
assertEquals(-1, new Class1().run(list,40,1,2,6));
}

@org.junit.Test
public void test87() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,6,10,6,8,4,10));
assertEquals(-1, new Class1().run(list,35,2,7,15));
}

@org.junit.Test
public void test88() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,8,5,2,11,11,1,3));
assertEquals(-1, new Class1().run(list,17,2,4,14));
}

@org.junit.Test
public void test89() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8,2,5,4,7,11));
assertEquals(-1, new Class1().run(list,26,1,6,11));
}

@org.junit.Test
public void test90() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,9,4,10,7,6,6,6,7,2,7,3,10,8,5));
assertEquals(-1, new Class1().run(list,1,19,7,8));
}

@org.junit.Test
public void test91() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,4,4,8,6,5,6,4));
assertEquals(-1, new Class1().run(list,19,2,1,13));
}

@org.junit.Test
public void test92() {
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,3,2,2,4,9,2,7,4,11,6,9));
assertEquals(-1, new Class1().run(list,11,2,0,11));
}

}
