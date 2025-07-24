import java.util.Scanner;
public class Insurance{
	public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("shyam's insurance policy");
System.out.println("enter shyam's age: ");
int age=sc.nextInt();
int premium=0;
if(age>60){
	premium=5000;
 	System.out.println("shyam's insurance policy");
	System.out.println("premium: "+premium);
	}
else if((age>=40)&&(age<=60)){
	premium=3000;
 	System.out.println("shyam's insurance policy");
	System.out.println("premium: "+premium);
	}

else if((age>=20)&&(age<=39)){
	premium=1500;
 	System.out.println("shyam's insurance policy");
	System.out.println("premium: "+premium);
	}
else{
	premium=1000;
 	System.out.println("shyam's insurance policy");
	System.out.println("premium: "+premium);
	}
	sc.close();
}
}