import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maximizing {

	public Integer maximizing1(int[] x) {
		while (true) {// 將陣列元素由小而大排序，再選最後一個元素
			boolean finishFlag = true;
			// 如果左邊元素大於右邊元素，倆倆互換位置，直到沒得換為止
			for (int i = 0; i < x.length - 1; i++) {
				if (x[i] > x[i + 1]) {
					int temp = x[i];
					x[i] = x[i + 1];
					x[i + 1] = temp;
					finishFlag = false;
				}
			}
			if (finishFlag) {
				break;
			}
		}
		return x[x.length - 1];
	}
	
	public Integer maximizing2(Integer a, Integer b, Integer c) {
		List list = new ArrayList();
		list.add(a);
		list.add(b);
		list.add(c);
		return (Integer) Collections.max(list);
	}

	public static void main(String[] args) {
		int[] x = { 5, 3, 4 };
		Maximizing max = new Maximizing();
		System.out.println(max.maximizing1(x));
		System.out.println(max.maximizing2(5, 4, 3));
	}

}
