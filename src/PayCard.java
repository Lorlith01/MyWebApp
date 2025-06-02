
public class PayCard {
	
	public String getPayament(String phoneNo) {
		switch(phoneNo.substring(phoneNo.length() - 1)) {
		case "8":
			return "需支付辦卡費50元";
		case "4":
			return "需支付辦卡費用0元";
		default:
			return "需支付辦卡費用20元";
		}
	}

	public static void main(String[] args) {
		PayCard pc = new PayCard();
		System.out.println(pc.getPayament("0916967688"));
	}

}
