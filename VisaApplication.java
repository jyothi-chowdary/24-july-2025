import java.util.Scanner;
public class VisaApplication{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Vikram Applies for a visa");
System.out.println("enter Vikram's age :");
int age=sc.nextInt();
System.out.println("enter valid passport  (true/false) :");
boolean validpassport=sc.nextBoolean();
String name="vikram";
if((age>=18) && (validpassport==true)){
	System.out.println("Name : "+name);
	System.out.println("age : "+age);
	System.out.println("valid passport  (true/false) : "+validpassport);
	System.out.println("visa application is accepted");
	}
else if((age>=18) && (validpassport==false)){
	System.out.println("Name : "+name);
	System.out.println("age : "+age);
	System.out.println("valid passport  (true/false) : "+validpassport);
	System.out.println("visa application is rejected");
	}
else{
	System.out.println("Name : "+name);
	System.out.println("age : "+age);
	System.out.println("valid passport  (true/false) : "+validpassport);
	System.out.println("visa  not allowed");
	}
  sc.close();
}
}
