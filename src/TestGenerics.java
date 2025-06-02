
public class TestGenerics<A> {
	private A a1;
	
	public void setGeneric(A a1) {
		this.a1 = a1;
	}
	
	public A getGeneric() {
		return a1;
	}

	public static void main(String[] args) {
		TestGenerics test1 = new TestGenerics();
		test1.setGeneric(new Integer(6));
		System.out.println(test1.getGeneric());

		test1.setGeneric(new String("AAAAAAAA"));
		System.out.println(test1.getGeneric());
	}

}
