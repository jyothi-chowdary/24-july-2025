import java.util.Scanner;
public class Internetplan{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println(" Amit's internet plan upgrade");
System.out.println("enter plan:");
int plan=sc.nextInt();
if(plan>500){
	System.out.println(" it is a basic  plan");
 	System.out.println(" suggest premium");
}
else if(plan>1000){
	System.out.println("ultra");
}
else{
	System.out.println(" continue same plan");
}
sc.close();
}
}



