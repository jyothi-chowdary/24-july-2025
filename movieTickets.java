import java.util.Scanner;
public class MovieTickets{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("welcome to cinema tickets booking");
System.out.println("Hara hara veera mallu - 300/-");
System.out.println("superman - 200/-");
System.out.println("Junior - 250/-");
System.out.println("enter movie number(1/2/3):");
int choice=sc.nextInt();
String moviename="";
int ticketprice=0;
int availabletickets=0;
if(choice==1){
	moviename="Hara hara veera mallu";
	ticketprice=300;
	availabletickets=50;
}else if(choice==2){
	moviename="superman";
	ticketprice= 200;
	availabletickets=40;
}
else if(choice==3){
         moviename="Junior";
         ticketprice= 250;
         availabletickets=30;
}
else{
     System.out.println("your asking movie is not founded");
     return;
}
System.out.println("how many tickets do you want?");
int tickets=sc.nextInt();
if(tickets<=0){
	System.out.println("Below zero tickets are not taken");
}
else if(tickets>availabletickets){
	System.out.println("your entered seats"+tickets+" not available please enter below or equal"  +availabletickets);
}
else{
	int total=tickets*ticketprice;
	int remainingtickets=availabletickets-tickets;
	System.out.println("moviename :"+moviename);
	System.out.println("Booking tickets :"+tickets);
	System.out.println("tickets price :"+total);
	System.out.println("Remaining seats :"+remainingtickets);
}
	sc.close();
}
}
	


