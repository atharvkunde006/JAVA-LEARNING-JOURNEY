package atharv;

public class type_cast {

	public static void main(String[] args) {
		int balance=2000;
		balance+=500;
		System.out.println("The balance after the adding money:" +balance);
		balance-=700;
		System.out.println("The amount after withdrawal:" +balance);
		String result=balance>1000&&balance==1800?"true":"false";
		System.out.println(result);
		String bal=balance>=500&&balance<=3000?"true":"false";
		System.out.println(bal);
		// TODO Auto-generated method stub

	}

}
