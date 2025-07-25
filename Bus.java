import java.util.Scanner;
public class Bus{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Ravi's bus tickets prices");
System.out.println("enter passenger travelled distance : ");
double distance=sc.nextDouble();
System.out.println("enter weekday true or false");
Boolean weekday=sc.nextBoolean();
System.out.println("enter weekend day true or false");
Boolean weekendday=sc.nextBoolean();

if(distance<50){
		System.out.println("  distnce : "+distance);
		System.out.println(" Rs.50 ");
}
else if(distance<=100){
		System.out.println("  distnce : "+distance);
		System.out.println(" Rs.100 ");
}
else if((distance>100) && ((weekday==true)||(weekendday==true))){
		System.out.println("  distnce : "+distance);
		System.out.println(" Rs.300 ");
	
}
else{
	System.out.println("  distnce : "+distance);
	System.out.println(" Rs.200 ");
}
 sc.close();
}
}
