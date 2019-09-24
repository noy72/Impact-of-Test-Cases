"テストケースが自動バグ修正に与える影響の調査" で用いたプログラム，テストケース，修正結果をまとめた．


## バグパターン
### correct

正しいプログラム．このプログラムにバグを埋め込み，修正対象となるバグを含んだプログラムを作成する．

resource メソッドは自動バグ修正に用いるコード片を集めており，テストケースの実行パスには含まれない．

```java
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
```

```java
package correct;
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
```



### incorrect_condition

19行目の if 文の式を減らした．

```java
18		for(int i : subList) {
19	-		if(i >= l && i <= h) {
19	+		if(i <= h) // bug here
20				sum += sample.fact(i);
```



### incorrect_method

20行目で呼び出すメソッドを fact から pow に変えた．

```java
19		if(i >= l && i <= h) {
20	-		sum += sample.fact(i);
20	+		sum += sample.pow(i); // bug here
21		}
```



### incorrect_overload

9行目で呼び出すメソッドを pow(a) から pow(a, n) に変えた．

```java
 8		int x, y;
 9	-	x = sample.pow(a) % list.size();
 9	+	x = sample.pow(a, n) % list.size(); // bug here
10		y = sample.pow(a, n) % list.size();
```



### incorrect_parameter

20行目で呼び出すメソッドの引数を i から a に変えた．

```java
19		if(i >= l && i <= h) {
20	-		sum += sample.fact(i);
20	+		sum += sample.fact(a); // bug here
21		}
```



### non_null_check

13-15行目の null チェックを行う部分をコメントアウトした．

```java
12		ArrayList<Integer> subList = sample.getSubList(list, x, y);
13	-	if(subList == null) {
14	-		return -1;
15	-	}
13	+	// if(subList == null) { //bug here
14	+	// 	return -1;
15	+	// }
16
17		int sum = 0;
```



## テストケース

*_many_testsディレクトリとcorrectディレクトリを除く5つのディレクトリには8つのテストファイルが存在する．

| ファイル名 | テストケース数 |
| ---------- | -------------- |
| *Test1     | 1              |
| *Test2     | 5              |
| *Test3     | 10             |
| *Test4     | 20             |



*_many_testsディレクトリには，5つのテストファイルが存在する．

| ファイル名   | テストケース数 |
| ------------ | -------------- |
| PassTest1    | 10             |
| PassTest2    | 40             |
| PassTest3    | 70             |
| PassTest4    | 100            |
| FailureTest1 | 5              |



## 生成結果

<バグパターン名>/result 下に kGenProg 実行時の出力をまとめている．

result_pX_fY の X, Y は自動バグ修正に用いたテストファイルを示しており，pX は PassTestX.java，fYはFailureTestY.java を用いて修正を行ったことを表す．