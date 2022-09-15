package test.com.MSA;

import java.util.ArrayList;
import java.util.List;



public class EmpDataService {
	static List<EmpDataSetUp> empData=new ArrayList<>();
	static 
	{
		int empId3[]= {1,2,3,4,5,6,7,8,9,10};
		String empName3[]= {"Ranjan","Roshan","Puja","Niva","Rajan","Rishabh","Arun","Ram","Hari","Krishna"};
		int empAge3[]= {20,21,22,23,24,25,16,27,28,29};
		int empSal3[]= {20000,21000,22000,23000,24000,25000,26000,27000,28000,29000};
		
		for (int i=0;i<10;i++)
		{
			EmpDataSetUp esg=new EmpDataSetUp();
			esg.setEmpId(empId3[i]);
			esg.setEmpName(empName3[i]);
			esg.setEmpAge(empAge3[i]);
			esg.setEmpSal(empSal3[i]);
			empData.add(esg);
		}
		System.out.println("Data has been Successfully Added in the ArrayList");
		}

	public static void setData(int empId2,String empName2,int empAge2,int empSal2)
	{
		// TODO Auto-generated method stub
		EmpDataSetUp esg=new EmpDataSetUp();
		esg.setEmpId(empId2);
		esg.setEmpName(empName2);
		esg.setEmpAge(empAge2);
		esg.setEmpSal(empSal2);

	}
	public static List<EmpDataSetUp> getData()
	{
		return empData;
	}



}
