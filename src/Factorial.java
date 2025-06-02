
public class Factorial {
	
	public Integer getFactorial(Integer n) {
		if (n - 1 <= 0) {
			return 1;
		} else {
			return n*getFactorial(n - 1);
		}
	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.getFactorial(4));
	}

}
