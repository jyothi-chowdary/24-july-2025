import java.util.Scanner;
public class MarthonEligibility{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("MarthonEligibility");
System.out.println("enter Sunitha's age:");
int age=sc.nextInt();
System.out.println("enter true/false");
boolean medicalcertificate=sc.nextBoolean();
if((age>18)&&(age<45)){
	if(medicalcertificate==true){

			System.out.println("medical certifacte valid");
			System.out.println("participation allowed");
		}
	else if(medicalcertificate==false){	
			System.out.println("participation denied");
		}

	else{
		System.out.println("participation not allowed");
		}
}

	sc.close();
}
}
