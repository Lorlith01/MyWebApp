
public class Practice {
	
	public String isPrimeNumberOrNot(Integer x) {
		Boolean flag = true;
		for (int i = 1; i < x + 1; i++) {
			if (x % i == 0 && i != 1 && i != x) {
				flag = false;
			}
		}
		return flag == true ? "是質數" : "不是質數";
	}
	
	public void getCertainNumbers() {
		for (int i = 0; i < 100; i++) {
			if (i % 10 != 3 && i % 10 != 5 && i % 10 !=7) {
				System.out.print(i);
				System.out.print("、");
			}
		}
	}
	
	public String getRandomVariableAndTimes() {
		Double rv = 0.0;
		int count = 0;
		while(true) {
			count++;
			rv = Math.random();
			if (rv > 0.999) {
				break;
			}
		}
		return "變數值：" + rv + "；產生次數：" + count;
	}

	public static void main(String[] args) {
		Practice practice = new Practice();
		System.out.println(practice.isPrimeNumberOrNot(15));
		//practice.getCertainNumbers();
		// System.out.println(practice.getRandomVariableAndTimes());
		// System.out.println("-----------------------");
	}

}
