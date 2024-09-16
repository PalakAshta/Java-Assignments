package LambdaAssign;
import java.lang.Math;

public class powerLambda {
	//Answer 1   
	public static void main(String args[]) {
   IPowerLambda cal=(x,y)->{
	   System.out.println(x+" power "+y+" is = ");
	   return (int) Math.pow(x, y);
   };
   System.out.print(cal.power(2,3));
   Exponent ex=new Exponent();
   IPowerLambda cal2=ex::expo;
   System.out.println(cal2.power(2, 3));
   
	}
}
