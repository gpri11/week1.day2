package week1.day2;

public class EmployeeDetails {
	public void printEmployeeName(String empName, int empid)
	{
	System.out.println("Name and empId is: " + empName+","+empid);
	}
static void getEmployeeAddress(String empAddress) {
	System.out.println("Employee address is: " +empAddress );	
}

public double printEmployeeSalary(double empSalary) {
	System.out.println("Employee salary is: " +empSalary );	
	return (empSalary);}

long printEmployeeMobileNumber(long mobNum) {
	System.out.println("Employee mobileNum is: " +mobNum );	
	return (mobNum);
}
	public static void main(String[] args) {		
		EmployeeDetails obj=new EmployeeDetails();
		obj.printEmployeeName("pinky", 000);
		getEmployeeAddress("#23 mint street");	
		obj.printEmployeeSalary(5000000);
		obj.printEmployeeMobileNumber(123759739587L); 
}
}





