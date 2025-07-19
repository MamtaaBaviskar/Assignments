package first_assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayAndCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
		
		
		ArrayList<Integer> largeCity=new ArrayList<Integer>();
		
		largeCity.add(89705757);
		largeCity.add(89704444);
		largeCity.add(898974443);
		largeCity.add(456373334);
		largeCity.add(875664);
		
	
	    int totalArea = largeCity.get(2)+largeCity.get(3);

		
		System.out.println("the total area of the 3rd and 4th cities combined:   " +totalArea);
		
		
		
//Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.		
		
	
	 Set<String> touristPlace = new HashSet<String>();
	 touristPlace.add("Pune");
	 touristPlace.add("Chennai");
	 touristPlace.add("Mumbai");
	 touristPlace.add("Hyderabad");
	 touristPlace.add("Goa");
	 touristPlace.add("shimala");
	 touristPlace.add("Manali");
	 touristPlace.add("Banglore");
	 touristPlace.add("ooty");
	 touristPlace.add("Kerala");
	 
	 System.out.println("Top 10 most visited tourist attractions in the world  "+touristPlace);
	 System.out.println("Size:"+touristPlace.size());
	 
//Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.
	 
	 int [] numbers=new int[10];
	 numbers[0]=10;
	 numbers[1]=11;
	 numbers[2]=22;
	 numbers[3]=33;
	 numbers[4]=44;
	 numbers[5]=55;
	 numbers[6]=66;
	 numbers[7]=77;
	 numbers[8]=88;
	 numbers[9]=99;
	 
	int sum= numbers[4] +numbers[5];
	double avg= (double) (sum/2.0);	
	System.out.println("Average of 5th and 6th Value    " +avg);
	
	
	
	
	
//Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
	
	ArrayList <String> highMovies = new ArrayList<String>();
	
	highMovies.add("Bahubali");
	highMovies.add("Soldier");
	highMovies.add("Border");
	highMovies.add("Tere Naam");
	highMovies.add("Indian");
	
	System.out.println("Third highest movie on the list     "+ highMovies.get(2));
	
	
	 
	
	}

}
