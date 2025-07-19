package first_assignment;

public class Assignment6 {

	public static void main(String[] args) {
		
		String [] studentNames= {"Suresh","Mahesh","Naresh"};
		int [] marks= {75, 80, 82};
		marks[0]+=10;
		marks[1]+=10;
		marks[2]+=10;
		
		int sum=marks[0]+marks[1]+marks[2];
		double avg= sum/3.0;
		
		System.out.println("Updated Marks:");
		System.out.println(studentNames[0] + ": " + marks[0]);
		System.out.println(studentNames[1] + ": " + marks[1]);
		System.out.println(studentNames[2] + ": " + marks[2]);
		System.out.println("Average Marks:"+ avg);
		
		
	
	
	}

}
