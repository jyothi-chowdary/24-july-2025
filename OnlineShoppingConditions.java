import java.util.Scanner;
public class OnlineShoppingConditions{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Priya online shopping offer");
System.out.println("Priya online shopping amount");
double amt=sc.nextInt();
System.out.println("she is a member or not(true/false:");
boolean member=sc.nextBoolean();
System.out.println("she is a  coupon or not(true/false:");
boolean coupon=sc.nextBoolean();
double discount;;
if(amt>5000){
		discount=25;
		System.out.println("items worth:"+amt);
		System.out.println("she is a member");
		System.out.println("discount for Priya:"+discount+"%");
		double discountmoney=(discount/100)*amt;
		System.out.println("discount money is :"+discountmoney);

	}
else if((amt>3000)&&(coupon==true)&&(member==true)){

			discount=20;
			System.out.println("items worth:"+amt);
			System.out.println("she is a member");
			System.out.println("discount for Priya:"+discount+"%");					
			double discountmoney=(discount/100)*amt;
			System.out.println("discount money is :"+discountmoney);

	}
else if((amt>3000)&&((coupon==true)||(member==true))){
			discount=10;
			System.out.println("items worth:"+amt);
			System.out.println("she is a member");
			System.out.println("discount for Priya:"+discount+"%");					
			double discountmoney=(discount/100)*amt;
			System.out.println("discount money is :"+discountmoney);

	}

else{
			discount=0;
			System.out.println("items worth:"+amt);
			System.out.println("she is not a member");
			System.out.println("discount for Priya:"+discount);
			double discountmoney=(discount/100)*amt;
			System.out.println("discount money is :"+discountmoney);

	}
	sc.close();
}
}







