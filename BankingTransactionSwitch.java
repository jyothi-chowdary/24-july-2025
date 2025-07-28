import java.util.Scanner;
public class BankingTransactionSwitch{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("banking transaction");
System.out.println("enter minimum balance");
double balance=sc.nextDouble();
System.out.println(" enter choice\n 1->withdraw\n 2->deposit\n 3->transfer");
int choice=sc.nextInt();
switch(choice){
		case 1:
			System.out.println("1->withdraw");
			System.out.println("enter withdraw amount:");
			double withdrawamount=sc.nextDouble();
			if((balance>=withdrawamount)&&(withdrawamount>0)){
							System.out.println("balance:"+balance);
								balance-=withdrawamount;
					System.out.println(" after withdraw your account balance:"+balance);
				}			
			else{
				System.out.println("Insufficient funds:");

				}
			break;
		case 2:
			System.out.println("2->deposit ");
			System.out.println("enter  deposit amount:");
			double depositamount=sc.nextDouble();
			if(depositamount>0){
					System.out.println("balance:"+balance);

					balance+=depositamount;
					System.out.println(" deposit amount:"+depositamount);
					System.out.println(" after adding toatal amount:"+balance);
			}
			break;
		case 3:
			System.out.println("3->transfer ");
			System.out.println("enter  transfer amount:");
			double amount=sc.nextDouble();
			System.out.println("receiveraccount:");
			String receiveraccount="500";
			System.out.println("receiveraccount:"+ receiveraccount);
			if((amount<=balance)&&((receiveraccount)!=null)){
								 	balance-=amount;
									System.out.println(" after transfer in your account balance:"+balance);
											System.out.println("transfer successfully");
			}
			break;
		default:
			System.out.println("transfer  failed: Insufficient balance");
};
sc.close();
}
}

 