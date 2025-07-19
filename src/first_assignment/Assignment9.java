package first_assignment;

import java.util.HashMap;
import java.util.Map;

public class Assignment9 {

	public static void main(String[] args) {
		
		String [] empNames= {"Alice Johnson","Bob Smith","Carol Davis","David Brown","Eva Green"};
		Double[] baseSalary= {75000.0,68000.0,82000.0,90000.0,60000.0};
		Double[] experiances= {5.1,3.2,7.1,10.2,2.4};
		Double[] ratings= {4.2,3.8,4.5,2.5,3.5};
		
		
		Map<String,Double> output=new HashMap<>();
		
		for(int i=0;i<empNames.length;i++) {
			
			double variablePay=0;
			double bonus=0;
			
			if(ratings[i]>4.0){
				
				variablePay=15.0;
				bonus=1500;
				
			}
			if(ratings[i]>=3.0 &&ratings[i] < 4.0) {
				
				variablePay=10.0;
				bonus=1200;
				
			}
		    if(ratings[i]< 3.0) {
				variablePay=3.0;
				bonus=300;
				
			}
		    
		    
		    double reward=0;
		    
		    if(experiances[i] >=5.0) {
		    	reward=5000;
		    	
		    	
		    }
		    
		    Double hike=( baseSalary[i] * variablePay/100 ) + bonus + reward;
		    Double hikePercentageValue= (hike /baseSalary[i])*100;
		    
		    output.put(empNames[i], hikePercentageValue);	
		    
		   
		    }
		    	
		       for(String name:output.keySet()){
		    	
		    	System.out.println(name+":"+output.get(name)+"%");
		    		
		    	
		    
		   
		    //System.out.println(empNames[i]+"   "+hikePercentageValue);
		    
			
			
		}
	
	}
	
}

	
	

