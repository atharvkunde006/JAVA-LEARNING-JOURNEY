package atharv;

 class compound {
	 void main(String []args) {
		int balance=2500;
		int depo= 400;
		int wid=250;
		depo+=170;
		int profit=balance*20/100;
		wid+=200;
		balance+=(depo-wid+profit);
		System.out.println("Your balance is:"+balance);
	}

}
