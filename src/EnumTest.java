
public class EnumTest {
	Day day;
	
	FF favoriteFF;
	
	Subjects subject;

	public EnumTest(Day day) {
		this.day = day;
	}
	
	public EnumTest(FF favoriteFF) {
		this.favoriteFF = favoriteFF;
	}
	
	public EnumTest(Subjects subject) {
		this.subject = subject;
	}

	public void tellItLikeItIs() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;
		case FRIDAY:
			System.out.println("Fridays are better.");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;

		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}
	
	public void testFFenum() {
		switch(favoriteFF) {
		case VII :
			System.out.println("master piece");
			break;
		case VIII :
			System.out.println("not better than VII");
			break;
		}
	}
	
	public void doYouLikethisSubject() {
		switch(subject) {
		case Ecnomics :
			System.out.println("Intersting");
			break;
		case Physics :
			System.out.println("Beautiful");
		case Math :
			System.out.println("Pure");
		}
	}

	public static void main(String[] args) {
		EnumTest test1 = new EnumTest(Day.MONDAY);
		test1.tellItLikeItIs();
		EnumTest ff = new EnumTest(FF.VII);
		ff.testFFenum();
		
		EnumTest test2 = new EnumTest(Subjects.Ecnomics);
		test2.doYouLikethisSubject();
	}

}
