package atharv;

public class logical_operator {

	public static void main(String[] args) {
		String result=(5>3)&&(8>2)?"True":"false";
		System.out.println(result);
		
		String result2=(10<5)||(7>2)?"True":"false";
		System.out.println(result2);
		
		String result3=!(4>2)?"True":"false";
		System.out.println(result3);
		
		String result4=(6>3)&&(3<5)?"True":"False";
		System.out.println(result4);
		
		String result5=(9<4)&&(2<8)?"True":"False";
		System.out.println(result5);
		
		String result6=(5>2)&&(3>7)?"True":"false";
		System.out.println(result6);
		
		String result7=(4==4)&&(6!=2)?"True":"false";
		System.out.println(result7);
		
		String result8=(7>3)||(5<1)&&(8>2)?"True":"false";
		System.out.println(result8);
		
		String result9=!(3<5&&6>2)?"true":"false";
		System.out.println(result9);
		
		String result10=(7 > 3) || (5 < 1) && (8 > 2)?"true":"false";
		System.out.println(result10);

		String result11=!(3 < 5 && 6 > 2)?"true":"false";
				System.out.println(result11);

		String result12=(10 > 5 && 3 > 8) || (6 < 9)?"true":"false";
		System.out.println(result12);
		
		String result13=!(true || false) && true?"true":"false";
		System.out.println(result13);
		
		String result14=(8 > 2 && 5 > 3) || !(4 < 1)?"true":"false";
		System.out.println(result14);
		
	}

}
