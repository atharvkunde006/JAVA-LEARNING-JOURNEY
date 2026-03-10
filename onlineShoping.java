package atharv;

public class onlineShoping {

	public static void main(String[] args) {
	 int price1=400;
	 int price2=600;
	 int price3=200;
	 int total=price1+price2+price3;
	 System.out.println("total price:"+total);
	 total+=50;
	 System.out.println("Total after delivery chareges:"+total);
   String result=(total>1000)?"True":"false";
   System.out.println("is bill is greater than 1000:"+result);
   String result2=(total==1250)?"True":"False";
   System.out.println("is bill is equal to 1250: "+result2);
   String result3=(total>500)&&(total<2000)?"True":"false";
   System.out.println("is bill is between 500 to 2000:"+result3);
	}

}
