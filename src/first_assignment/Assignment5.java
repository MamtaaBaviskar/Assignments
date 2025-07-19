package first_assignment;

import java.util.ArrayList;

public class Assignment5 {

	public static void main(String[] args) {
		
		
		ArrayList<ArrayList<String>> allData=new ArrayList<>();
        
		
		//Add student details
		
		ArrayList<String> studentDetails = new ArrayList<>();
		
		studentDetails.add("Name");
		studentDetails.add("Age");
		studentDetails.add("Gender");
		studentDetails.add("Roll number");
		studentDetails.add("Grade");
		studentDetails.add("Major");
		studentDetails.add("GPA");
		studentDetails.add("Email");
		studentDetails.add("PAN number");
		studentDetails.add("Address");
		
	    allData.add(studentDetails);
	    
	    
		ArrayList<String> student1 = new ArrayList<>();
		
		student1.add("John Doe");
		student1.add(" Twenty");
		student1.add(" Male");
		student1.add(" SBA12345");
		student1.add(" A++");
		student1.add(" Computer Science");
		student1.add(" A3.8");
        student1.add(" john@example.com");
		student1.add(" SDF6543210");
		student1.add(" 123 Elm St");
		
		 allData.add(student1);
		
      ArrayList<String> student2 = new ArrayList<>();
		
        student2.add("Jane Smith");
        student2.add(" Twenty One");
        student2.add(" Female");
        student2.add(" SBA12346");
        student2.add(" B+");
        student2.add(" Mathematics");
		student2.add(" A3.5");
		student2.add(" jane@example.com");
		student2.add(" REW6543211");
		student2.add(" 456 Oak St");
		
		 allData.add(student2);
		
	 ArrayList<String> student3 = new ArrayList<>();
			
	    student3.add("Mike Brown");
	    student3.add(" Twenty Two");
	    student3.add(" Male");
	    student3.add(" SBA12347");
	    student3.add(" A+");
	    student3.add(" Physics");
        student3.add(" A3.9");
        student3.add(" mike@example.com");
        student3.add(" TYR6543212");
 		student3.add(" 789 Pine St");
 		
 		 allData.add(student3);
 		
 	//Employee Details added	
 		
			
 	ArrayList<String> EmployeeDetails = new ArrayList<>();
		
		
 	EmployeeDetails.add("Employee ID");
 	EmployeeDetails.add("Name");
 	EmployeeDetails.add("Age");
 	EmployeeDetails.add("Gender");
 	EmployeeDetails.add("Department");
 	EmployeeDetails.add("Position");
 	EmployeeDetails.add("Salary");
 	EmployeeDetails.add("Email");
 	EmployeeDetails.add("PAN Number");
 	
 	 allData.add(EmployeeDetails);
 	
 	
 	ArrayList<String> Employee1=new ArrayList<>();
 	
 	Employee1.add("E001");
 	Employee1.add("Alice Green");
 	Employee1.add("Thirty");
 	Employee1.add("Female");
 	Employee1.add("Engineering");
 	Employee1.add("Software Engineer");
 	Employee1.add("75K Pounds");
 	Employee1.add("alice@example.com");
 	Employee1.add("SDF6543210");
 	
	 allData.add(Employee1);

 	
 	
ArrayList<String> Employee2=new ArrayList<>();
 	
 	Employee2.add("E002");
 	Employee2.add(" Bob Johnson");
 	Employee2.add("Thirty Five");
 	Employee2.add("male");
 	Employee2.add("Marketing");
 	Employee2.add(" Marketing Manager");
 	Employee2.add("85K Pounds");
 	Employee2.add("bob@example.com");
 	Employee2.add("REW6543211");
	 allData.add(Employee2);

 	
ArrayList<String>Employee3 =new ArrayList<>();
 	
 	Employee3.add("E003");
 	Employee3.add("Carol White");
 	Employee3.add("Twenty Eight");
 	Employee3.add("Female");
 	Employee3.add("Sales");
 	Employee3.add("Sales Executive");
 	Employee3.add("65K Pounds");
 	Employee3.add("carol@example.com");
 	Employee3.add("TYR6543212");
 	
	 allData.add(Employee3);
	 
	 
	 
//Add Product Details
	 
	 ArrayList<String> productDetails=new ArrayList<>();
	 
	 productDetails.add("Product ID");
	 productDetails.add("Name");
	 productDetails.add("Category");
	 productDetails.add("Price");
	 productDetails.add("Stock Quantity");
	 productDetails.add("Supplier");
	 productDetails.add("Warranty");
	 productDetails.add("Rating");
	 productDetails.add("Manufacturing Date");
	 productDetails.add("Expiry Date");
	 
    allData.add(productDetails);
    
    ArrayList<String> product1=new ArrayList<>();
    product1.add("P001");
    product1.add("Laptop");
    product1.add("Electronics");
    product1.add("12K Pounds");
    product1.add("Not Available");
    product1.add("Tech Supplies");
    product1.add("2 years");
    product1.add("4.5 Stars");
    product1.add("Aug 2023");
    product1.add("Aug 2028");
    
    allData.add(product1);
    
    
    ArrayList<String> product2=new ArrayList<>();
    product2.add("P002");
    product2.add("Desk Chair");
    product2.add("Furniture");
    product2.add("150K Pounds");
    product2.add("Two");
    product2.add("Office Depot");
    product2.add("1 year");
    product2.add("4 Stars");
    product2.add("Sep 2024");
    product2.add("N/A");
    allData.add(product2);
    
    ArrayList<String> product3=new ArrayList<>();

    product3.add("P003");
    product3.add("Coffee Maker");
    product3.add("Kitchen");
    product3.add("75K Pounds");
    product3.add("Two Hundred");
    product3.add(" KitchenWorld");
    product3.add("6 months");
    product3.add("4.2 Stars");
    product3.add("Jan 2025");
    product3.add("Jan 2027");
    
    allData.add(product3);
    
    
    
    System.out.println(product2.get(5));
    
    }

 	
}


