import java.util.Scanner;
public class FitnessAppRecommendation{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println(" fitness app recommendation");
System.out.println("enter  age :");
int age=sc.nextInt();
System.out.println("enter  heartcondition  (true/false) :");
boolean heartcondition=sc.nextBoolean();
System.out.println("enter  bmi   :");
int bmi=sc.nextInt();
String name="jyothi";
if((age<40) && (heartcondition==false) && (bmi<=25)){
	System.out.println("Name : "+name);
	System.out.println("age : "+age);
       
	System.out.println(" heartcondition: "+ heartcondition);
	System.out.println(" high intensity program ");
	}
else if((age<60) && ((heartcondition==false)||(bmi<=30))){
	System.out.println("Name : "+name);
	System.out.println("age : "+age);
	
	System.out.println(" heartcondition: "+heartcondition);
	System.out.println(" moderate program");
	}
else{
	System.out.println("Name : "+name);
	System.out.println("age : "+age);
  		
	System.out.println("heartcondition : "+heartcondition);
	System.out.println("  consult doctor first");
	}
  sc.close();
}
}