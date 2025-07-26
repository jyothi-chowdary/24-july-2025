import java.util.Scanner;
public class CampusPlacement{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println(" to attend placements");
System.out.println("enter cgpa");
float cgpa=sc.nextFloat();
System.out.println("enter attendence");
int attendence=sc.nextInt();
System.out.println("enter backlogs");
int backlogs=sc.nextInt();
if((cgpa>=7)&&(attendence>=75)&&(backlogs==0)){
	System.out.println(" cgpa:"+cgpa);
	System.out.println("attendance percentage:"+attendence+"%");
	System.out.println("backlogs:"+backlogs);
	System.out.println("eligible ");
}
else if((cgpa>=6.5)&&(attendence>=70)&&(backlogs==1)){
	System.out.println("cgpa:"+cgpa);
	System.out.println("attendance percentage:"+attendence+"%");
	System.out.println("backlogs:"+backlogs);
	System.out.println("eligible for 2 companies");
}
else{
        System.out.println("cgpa:"+cgpa);
	System.out.println("attendance percentage:"+attendence+"%");
	System.out.println("backlogs:"+backlogs);
	System.out.println("Not eligible ");
}
 sc.close();
}
}

 
