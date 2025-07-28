  import java.util.Scanner;
public class BookingTickets1{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("kiran movie tickets booking");
System.out.println("enter how many tickets u want :");
int tickets=sc.nextInt();
System.out.println("enter discount percentage");
int discountpercentage=sc.nextInt(); 
int discountamount;
System.out.println("enter age");
int age=sc.nextInt();
if(age>=18){
		System.out.println("Movie Name:RRR");
        	int cost;
			cost=100;
		int price=tickets*cost;
		discountamount=(discountpercentage*price)/100;
		int totprice=price-discountamount;
		System.out.println(" booked tickets:"+tickets);
		System.out.println("price :"+price); 
		System.out.println("discount:"+discountpercentage+"%");
		System.out.println("tickets discount amount:"+discountamount);
		System.out.println("total payment:"+totprice);
 }
else{
	System.out.println("not booked");
}
	sc.close();
}
}



    	







