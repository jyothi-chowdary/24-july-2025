import java.util.Scanner;
public class OnlineShoppingOffer{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Priya online shopping offer");
System.out.println("Priya online shopping amount");
double amt=sc.nextInt();
Boolean member=sc.nextBoolean();
double discount;;
if(amt>=10000){
		discount=30;
		System.out.println("items worth:"+amt);
		System.out.println("she is a member");
		System.out.println("discount for Priya:"+discount);
		double discountmoney=(discount/100)*amt;
		System.out.println("discount money is :"+discountmoney);

	}
else if(amt>=5000){
			discount=20;
			System.out.println("items worth:"+amt);
			System.out.println("she is a member");
			System.out.println("discount for Priya:"+discount);					double discountmoney=(discount/100)*amt;
			System.out.println("discount money is :"+discountmoney);

	}
else{
			discount=5;
			System.out.println("items worth:"+amt);
			System.out.println("she is not a member");
			System.out.println("discount for Priya:"+discount);
			double discountmoney=(discount/100)*amt;
			System.out.println("discount money is :"+discountmoney);

	}
	sc.close();
}
}







