import java.util.Scanner;
public class CarService{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Rahul's wants to service his car");
System.out.println("enter car traveling distance: ");
int car=sc.nextInt();
if(car>=20000){
		System.out.println(" need full service of his car");
	}	
else if((car>=10000)&&(car<=20000)){
					System.out.println("need semi service his car");
	}
else{
	System.out.println(" only general checkup needed");
	}
    sc.close();
}
}




