import java.util.Scanner;
public class EcommerceReturnPolicy{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println(" E-Commerce return policy");
System.out.println("enter daySincePurchase");
int daySincePurchase=sc.nextInt();
boolean isTagAttached=true;
System.out.println(" enter choice\n 1->Electronics/n2->clothing /n 3->Books");
int choice=sc.nextInt();
switch(choice){
		case 1:
			if(daySincePurchase<=7){
						System.out.println("Allowed");
		
			}
			else{
				System.out.println("Not Allowed");
				}
			break;
		case 2:
			if(isTagAttached==true){
						System.out.println("Allowed");
			}
			else{
				System.out.println(" Denied");
				}
				break;
		 case 3:
			 
				System.out.println(" Non returnable") ;
				System.out.println(" Always Denied");
				break;
		default:
				System.out.println("invalid product category");
		
			
};
sc.close();
}
}