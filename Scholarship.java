import java.util.Scanner;
public class Scholarship{
	public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter percentage:");
double percentage=sc.nextDouble();
System.out.println("enter sports certificate true or false");
boolean sportscertificate=sc.nextBoolean();
System.out.println("enter income:");
int income=sc.nextInt();
System.out.println("enter volunteer experience true or false:");
boolean volunteerexperience=sc.nextBoolean();
System.out.println("percentage: "+percentage);
System.out.println(" sports certificate:"+sportscertificate);
System.out.println("income: "+income);
	if((percentage >= 90)&&(sportscertificate == true)&&(income <= 200000)){
		System.out.println("full scholarship");
		}
	else if((percentage >= 90)&&((sportscertificate==true)||(volunteerexperience == true))){
		System.out.println("partial scholarship");
		}
	else{
		System.out.println("No scholarship");
		}
	sc.close();
	}
}


