package test.com.MSA;
import java.util.List;
public class EmpDataSetUp {
	private int empId;
	private String empName;
	private int empAge;
	private int empSal;
	EmpDataSetUp(){}
	EmpDataSetUp(int empId1,String empName1,int empAge1,int empSal1)
	{
		setEmpAge(empAge1);
		setEmpId(empId1);
		setEmpName(empName1);
		setEmpSal(empSal1);
		
	}

	public int getEmpId()
	{
		return empId;
	}
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	public String getEmpName()
	{
		return empName;
	}
	public void setEmpName(String  empName)
	{
		this.empName=empName;
	}
	public int getEmpAge()
	{
		return empAge;
	}
	public void setEmpAge(int empAge)
	{
		this.empAge=empAge;
	}	
	public int getEmpSal()
	{
		return empSal;
	}
	public void setEmpSal(int empSal)
	{
		this.empSal=empSal;
	}

}



