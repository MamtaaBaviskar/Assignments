package first_assignment;

public class Assignment2Array {

	public static void main(String[] args) {
		
		
		/* Create a 1D array of integers with a length of 5. Populate the array with values of
your choice and print each element of the array to the console. For the 1D array of
integers, you could use: {4, 7, 2, 9, 5}.  */
		
		int[] digits=new int[5];
		        digits[0]=4;
				digits[1]=7;
				digits[2]=2;
				digits[3]=9;
				digits[4]=5;
				
	    System.out.println("1D Array with integers:=  "+" "+digits[0]+" "+digits[1]+" " +digits[2]+" "+digits[3]+" "+digits[4]);
				
				
				
	    
	    
	    /*  Create a 1D array of integers with a length of 5. Populate the array with values of
	    your choice and print each element of the array to the console. For the 1D array of
	    integers, you could use: {4, 7, 2, 9, 5}. */
	    
	    
	    
	     String[] Colours= new String[3];
				Colours[0]="GREEN";
				Colours[1]="BLUE";
				Colours[2]="RED";
		 System.out.println("1D Array with String:=  "+Colours[0]+" "+Colours[1]+" "+Colours[2]);
		 
		 
         /* Create a 2D array of integers with a size of 3x3. Populate the array with values of
your choice and print each element of the array to the console.For the 2D array of
integers, you could use: {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}. */
		 
		 
		 int[][] numeric=new int[3][3];
		  numeric[0][0]=1;
	      numeric[0][1]=2;
	      numeric[0][2]=3;
	      numeric[1][0]=4;
	      numeric[1][1]=5;		
	      numeric[1][2]=6;
	 	  numeric[2][0]=7;
	      numeric[2][1]=8;
	      numeric[2][2]=9;
	      
	  System.out.print("2D array with integers:= " + " " + numeric[0][0] + " " + numeric[0][1] + " " + numeric[0][2] + " "
					+ numeric[1][0] + " " + numeric[1][1] + " " + numeric[1][2] + " " + numeric[2][0] + " "
					+ numeric[2][1] + " " + numeric[2][2]);
	    
	
				
	/*  Create a 2D array of strings with a size of 2x2. Populate the array with your favorite
foods and print each element of the array to the console.For the 2D array of strings,
you could use: {{"pizza", "pasta"}, {"burger", "fries"}}.*/		
				
	  
	  String[][] JunkFood = new String[2][2];
	  
	   JunkFood[0][0]="Pizza";
	   JunkFood[0][1]="Pasta";
	   JunkFood[1][0]="Burger";
	   JunkFood[1][1]="Fries";
	   System.out.println();
	   System.out.println("2D Array with String:= "+" "
	                     +JunkFood[0][0]+
	                     " "+JunkFood[0][1]+
	                     " "+JunkFood[1][0]+
	                     " "+JunkFood[1][1]);
	   
	   
				
			
		
		
	}

}

