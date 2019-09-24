package non_null_check_many_tests;
import java.util.ArrayList;

public class Class2 {
	public int pow(int a){
		return a * a;
	}
	
	public int pow(int a, int n) {
		int res = 1;
		for(int i = 0; i < n; i++) {
			res *= a;
		}
		return res;
	}
	
	public int fact(int n) {
		int res = 1;
		for(int i = 1; i <= n; i++) {
			res *= i;
		}
		return res;
	}

	
	public ArrayList<Integer> getSubList(ArrayList<Integer> list, int l, int r){
		if(l < 0 || r >= list.size() || l >= r) {
			return null;
		}

		ArrayList<Integer> res = new ArrayList<Integer>();
		for(; l < r; l++) {
			res.add(list.get(l));
		}
		return res;
	}
}
