package correct;
import java.util.ArrayList;

public class Class1 {
	public int run (ArrayList<Integer> list, int a, int n, int l, int h){
		Class2 sample = new Class2();

		int x, y;
		x = sample.pow(a) % list.size();
		y = sample.pow(a, n) % list.size();

		ArrayList<Integer> subList = sample.getSubList(list, x, y);
		if(subList == null) {
			return -1;
		}

		int sum = 0;
		for(int i : subList) {
			if(i >= l && i <= h) {
				sum += sample.fact(i);
			}
		}
		return sum;
	}

	public int resource() {
		Class2 sample = new Class2();
		ArrayList<Integer> list = new ArrayList<>();
		int a = 0, n = 0;

		int x, y;
		x = sample.pow(a) % list.size();
		y = sample.pow(a) % list.size();
		x = sample.pow(a,n) % list.size();
		y = sample.pow(a,n) % list.size();

		ArrayList<Integer> subList = new ArrayList<>();
		if(subList == null) {
			return -1;
		}
		if(list == null) {
			return -1;
		}

		int i = 0, l = 0, h = 0;
		if(i >= l && i <= h) {
			return 0;
		}
		if(i >= l) {

		}
		if(i <= h) {

		}
		int sum = 0;
		sum += sample.fact(i);
		sum += sample.pow(i);
		sum += sample.fact(a);
		sum += sample.pow(a);
		sum += sample.fact(n);
		sum += sample.pow(n);
		return -1;
	}
}
