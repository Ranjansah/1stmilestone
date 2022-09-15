package test.com.MSA;

import java.util.Scanner;


public class EmpDataMain {
	public static void main(String[] args) {
		menuDriven();
	}

	private static void menuDriven() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EmpDataService empp=new EmpDataService();
		EmpDataOperation empp1=new EmpDataOperation();
		System.out.println("Enter the options");
		System.out.println("1.Display All Employees Data");
		System.out.println("2.Display names of all the Employees in Descending Order");
		System.out.println("3.Update the customer details present in the Database");
		System.out.println("4.Exit from the Program");
		//System.out.println("Please Enter your Choice");
		int choice=sc.nextInt();
		while(choice<4 && choice>0)
		{
			switch(choice)
			{
			
			case 1:
				System.out.println("Data Of All Employees are");
				empp1.display(empp.getData());
				System.out.println();
				choice=0;
				menuDriven();
				break;
			case 2:
				System.out.println("Data Sorted in Descending Order");
				empp1.descendingOrder(empp.getData());
				System.out.println();
				choice=0;
				menuDriven();
				break;
				
				
			case 3:
				System.out.println("Updating the data");
				System.out.println("Enter the employee id to update");
				try
				{
					empp1.updateEmp(sc.nextInt());
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				System.out.println();
				choice=0;
				menuDriven();
				break;
				
			
				
			case 4:
				System.out.println("Program Exits ThankYou!!!");
				System.exit(0);
				choice=0;
				menuDriven();
				break;
				
				
				default:
					
					System.out.println("Enter the number from above options");
					System.out.println();
					//choice=0;
					//menuDriven();
					break;
			}
		}
	
		
	}

}
