import java.util.Scanner;
public class BookingTickets{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("kiran movie tickets booking");
System.out.println("enter how many tickets u want :");
int tickets=sc.nextInt();
System.out.println("enter weekend or not");
boolean weekend=sc.nextBoolean();
System.out.println("enter vip seat  or not");
boolean vipseat=sc.nextBoolean();
int cost=0;
int price=0;
if((weekend==true) && (vipseat==true)){
	System.out.println(" today is weekend");
	System.out.println("you booking vip seat");
	System.out.println(" total booking movie tickets :"+tickets);
	cost=500;
	price=tickets*cost;
	System.out.println("1-> "+cost);
	System.out.println(" price :"+price);
}
else if((weekend==true) && (vipseat==false)){
	System.out.println(" today is weekend");
	System.out.println("you booking  Normal seat");
	System.out.println(" total booking movie tickets :"+tickets);
	cost=300;
	price=tickets*cost;
	System.out.println("1-> "+cost);
	System.out.println(" price :"+price);

}

else if((weekend==false) && (vipseat==true)){
	System.out.println(" today is weekday");
	System.out.println("you booking vip seat");
	System.out.println(" total booking movie tickets :"+tickets);
	cost=400;
	price=tickets*cost;
	System.out.println("1-> "+cost);
	System.out.println(" price :"+price);
}
else{
	System.out.println(" today is weekday");
	System.out.println("you booking Normal seat");
	System.out.println(" total booking movie tickets :"+tickets);
	cost=200;
	price=tickets*cost;
	System.out.println("1-> "+cost);
	System.out.println(" price :"+price);
}
sc.close();
}
}



    	






