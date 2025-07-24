import java.util.Scanner;
public class ExamResult{
	public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter subject1 marks:");
int s1=sc.nextInt();
System.out.println("enter subject2 marks:");
int s2=sc.nextInt();
System.out.println("enter subject3 marks:");
int s3=sc.nextInt();
System.out.println("enter subject4 marks:");
int s4=sc.nextInt();
System.out.println("enter subject5 marks:");
int s5=sc.nextInt();
int tot=s1+s2+s3+s4+s5;
int avg=tot/5;
System.out.println("average marks: "+avg);
if((s1>=35)&&(s2>=35)&&(s3>=35)&&(s4>=35)&&(s5>=35)){
							
	if(avg>=90){
		System.out.println("outstanding");
	}
	else if(avg>=75){
		System.out.println(" Distinction");
	}
	else if(avg>=60){
		System.out.println(" firstclass");
	}
	else{
	System.out.println(" pass");
	}
		
	} else{
		System.out.println("fail");
	}
	sc.close();
}
}




