
import java.util.*;
class Demo{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("\t+-----------------------------------------------------------------------+");
		System.out.println("\t|\t\t\tSALARY INFORMATION SYSTEM\t\t\t|");
		System.out.println("\t+-----------------------------------------------------------------------+");
		System.out.println("\n");
		System.out.println("\t\t[1] Calculate Income Tax");
		System.out.println("\t\t[2] Calculate Anual Bonus");
		System.out.println("\t\t[3] Calculate Loan Amount");
		System.out.println("\n");
		System.out.print("\tEnter an option to continue > ");
		int option=input.nextInt();
		System.out.println("\n");
		
		switch (option){
			case 1:
			System.out.println("\t+---------------------------------------------------------------+");
			System.out.println("\t|\t\t\tCALCULATE INCOME TAX\t\t\t|");
			System.out.println("\t+---------------------------------------------------------------+");
			System.out.println("\n");
			System.out.print("\tInput Employee name - ");
			String name=input.nextLine();
			input.nextLine();
			System.out.print("\tInput Employee salary - ");
			double salary=input.nextDouble();
			double incomeTax=0.0;
			if(salary<100000){
				incomeTax=0;
			}else if(salary>=100000&&salary<141667){
				incomeTax=0.0+(salary-100000)*0.06;
			}else if(salary>=141667&&salary<183333){
				incomeTax=0.0+41667*0.06+(salary-141667)*0.12;
			}else if(salary>=183333&&salary<225000){
				incomeTax=0.0+41667*0.06+41667*0.12+(salary-183333)*0.18;
			}else if(salary>=225000&&salary<266667){
				incomeTax=0.0+41667*0.06+41667*0.12+41667*0.18+(salary-225000)*0.24;
			}else if(salary>=266667&&salary<308333){
				incomeTax=0.0+41667*0.06+41667*0.12+41667*0.18+41667*0.24+(salary-266667)*0.3;
			}else if(salary>=308333){
				incomeTax=0.0+41667*0.06+41667*0.12+41667*0.18+41667*0.24+41667*0.3+(salary-308333);
			}
			System.out.println("");
			System.out.printf("%-30s%-10.0f\n\n","\tYou have to pay Income Tax per month : ",incomeTax);
			break;
			case 2:
			System.out.println("\t+---------------------------------------------------------------+");
			System.out.println("\t|\t\t\tCALCULATE ANUAL BONUS\t\t\t|");
			System.out.println("\t+---------------------------------------------------------------+");
			System.out.println("\n");
			System.out.print("\tInput Employee name - ");
			name=input.nextLine();
			input.nextLine();
			System.out.print("\tInput Employee salary - ");
			salary=input.nextDouble();
			double anualBonus=0.0;
			if(salary<100000){
				anualBonus=5000;
			}else if(salary>=100000&&salary<=199999){
				anualBonus=salary*0.1;
			}else if(salary>=200000&&salary<=299999){
				anualBonus=salary*0.15;
			}else if(salary>=300000&&salary<=399999){
				anualBonus=salary*0.2;
			}else if(salary>=400000){
				anualBonus=salary*0.35;
			}	
			System.out.println("");
			System.out.printf("%-20s%-10.1f\n\n","\tAnual Bonus : ",anualBonus);	
			break;
			case 3:		
			System.out.println("\t+---------------------------------------------------------------+");
			System.out.println("\t|\t\t\tCALCULATE LOAN AMOUNT\t\t\t|");
			System.out.println("\t+---------------------------------------------------------------+");
			System.out.println("\n");
			System.out.print("\tInput Employee name - ");
			name=input.nextLine();
			input.nextLine();
			System.out.print("\tInput Employee salary - ");
			salary=input.nextDouble();
			double years=0.0;
			if(salary<50000){
				System.out.println("\t\tYou can not get a loan because your salary lessthan Rs. 50000...");
				break;
			}else{
				System.out.print("\tEnter number of years : ");
				years=input.nextInt();
				if(years>5){
					System.out.println("\t\tnumber of years shoul be lessthan or qual to 5");
					break;
				}
			}
			double monthlyInstalment=salary*0.6;
			double numberOfMonths=years*12;
			double anualInterestRate=0.15;			
			double loanAmount=(monthlyInstalment/(anualInterestRate/12))*(1.0-(1.0/Math.pow((1+(anualInterestRate/12)),numberOfMonths)));
			loanAmount=loanAmount/1000;
			double newLoanAmount=(Math.round(loanAmount))*1000;			
			System.out.println();
			System.out.printf("%-25s %-15.0f\n","\tyou can get Loan Amount : ",newLoanAmount);
			break;
			default:
			System.out.println("\t\tNot a valid input...");						
		}
	}
}
