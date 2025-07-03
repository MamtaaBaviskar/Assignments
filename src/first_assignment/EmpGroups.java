package first_assignment;

public class EmpGroups {

	public static void main(String[] args) {
		Employees e= new Employees();
		
		String [] employeeNames= new String[3];
		int [] employeeIDs= new int[3];
		
		employeeNames[0]= e.empname1;
		employeeNames[1]= e.empname2;
		employeeNames[2]= e.empname3;
		
		
		employeeIDs[0]=e.empid1;
		employeeIDs[1]=e.empid2;
		employeeIDs[2]=e.empid3;
		
		
		System.out.println("Employee Name: "+employeeNames[0]+", Employee ID: "+employeeIDs[0]);
		System.out.println("Employee Name: "+employeeNames[1]+", Employee ID: "+employeeIDs[2]);
		System.out.println("Employee Name: "+employeeNames[2]+", Employee ID: "+employeeIDs[2]);

	}

}
