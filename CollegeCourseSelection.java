import java.util.Scanner;
public class CollegeCourseSelection{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter semester (1-8)");
int sem=sc.nextInt();
switch(sem){
            case 1,2 -> {

			System.out.println("Basic science subjects");
			}
 	    case 3,4 -> {
			System.out.println("enter  department(CS/ME): ");
			String dept=sc.nextLine().trim().toUpperCase();
	                switch(dept){
					case "CS"->
							System.out.println("DS,DBMS");
					case "ME"->
							System.out.println("thermos,fluids");
					default ->
							System.out.println("invalid department");
					}
			}
	     case 5,6 -> {
				System.out.println(" enter total credits:");
				int credits=sc.nextInt();
				if(credits>20){
						System.out.println("include electives");
				}
				else{
						System.out.println("No electives includeded");
						}
			}
	      case 7,8 -> {
			
				System.out.println("have u completed internship ?(true/false)");
				boolean internshipdone=sc.nextBoolean();
				if(internshipdone==true){
								System.out.println("project options");
								System.out.println("internship remainder:");
								}
				}
	 	default ->
				System.out.println("invalid sem");
};
sc.close();
}
}		