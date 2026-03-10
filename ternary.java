package atharv;

public class ternary {
	public static void main(String[]args) {
	int a=10;
	int b=30;
	int res=a<b?100:20;
	System.out.println(res);
	System.out.println(a<b?a:b);
	System.out.println("a :"+a);
	System.out.println("b :"+b);
	
	int result=a<b? a=a+10:(b=b+10);
	System.out.println("result: "+result);
	System.out.println("a after execution :"+a);
	System.out.println("b after execution: "+b);
	
	}

}
