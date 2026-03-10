
//find greater number using ternary oprator
package atharv;

public class demo {
public static void main(String[]args){
int a=10;
int b=40;
int c=30;
int res=a>b?(a>c?a:c):(b>c?b:c);
System.out.println(res);
System.out.println('c'*20+(30*2)+"res");
}
}