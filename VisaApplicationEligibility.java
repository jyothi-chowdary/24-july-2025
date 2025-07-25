import java.util.Scanner;
public class VisaApplicationEligibility{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println(" Applying for a visa");
System.out.println("enter  age :");
int age=sc.nextInt();
System.out.println("enter nocriminalrecords   (true/false) :");
boolean  nocriminalrecords=sc.nextBoolean();
System.out.println("enter valid passport  (true/false) :");
boolean passport=sc.nextBoolean();

String name="jyothi";
if((age>=18) && (nocriminalrecords==true) && (passport==true)){
	System.out.println("Name : "+name);
	System.out.println("age : "+age);
	System.out.println(" nocriminalrecords : "+nocriminalrecords);
	System.out.println("eligible for visa ");
	}
else if((age>=18) && (nocriminalrecords==false)){
	System.out.println("Name : "+name);
	System.out.println("age : "+age);
	System.out.println(" nocriminalrecords : "+nocriminalrecords);
	System.out.println(" apply for visa first");
	}
else{
	System.out.println("Name : "+name);
	System.out.println("age : "+age);
	System.out.println("nocriminalrecords : "+nocriminalrecords);
	System.out.println(" not eligible");
	}
  sc.close();
}
}