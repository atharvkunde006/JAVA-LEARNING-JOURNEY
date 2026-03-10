package atharv;

public class increment {
	public static void main(String []args) {
		int a=20;
		int b=-10;
		int c=a++ + ++b;
		int d=a++ - b++ + ++c;
			System.out.println("a:" +a+" b:" +b+ " c:" +c+ " d:"+d);
	    int u=10;
	    int s=-5;
	    int k=u++-s--;
	    int n=--u+--s+k--;
	    System.out.println("u :"+u+ "s :"+s+ "k :"+k+ "n :"+n);
	}

}
