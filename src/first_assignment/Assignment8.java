package first_assignment;

import java.util.ArrayList;

public class Assignment8 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> accountTransactions=new ArrayList<>();
	
		accountTransactions.add(50000);
		accountTransactions.add(-2000);
		accountTransactions.add(3000);
		accountTransactions.add(-15000);
		accountTransactions.add(-200);
		accountTransactions.add(-300);
		accountTransactions.add(4000);
		accountTransactions.add(-3000);

		
	    int creditCount=0;
	    int debitCount=0;
	    int creditAmt=0;
	    int debitAmt=0;
	    int sum=0;
	    //int totalcredAmount=0;
	    //int totalDebtAmount=0;
	    int suspeciousCount=0;
	    
	    
	    		
	    
	    for(int i=0;i<accountTransactions.size();i++)
	    {
	    	int item = accountTransactions.get(i);
	    	if(item>=0) 
	    	{
	    		creditCount++ ;	
	    		creditAmt += item;
	    	}
	    	if(item<0)
	    	{
	    		debitCount++;
	    		debitAmt += item;

	    	}
	    	sum+=item;
	    	
	    	if(item>10000 || item < -10000)
	    	{
	    		
	    		suspeciousCount++;
	    		System.out.println("Suspicious credit debit Transaction with Amount: " + item);
	    	}	
	     }
	    System.out.println("the total no of suspicious transaction in account: "+suspeciousCount );
	    System.out.println("the total no of credit transaction in account: "+creditCount );
	    System.out.println("the total amount credited in account: "+creditAmt );
	    
	    System.out.println("the total no of debit transaction in account: "+debitCount );
	    System.out.println("the total amount debited in account: "+debitAmt );
	    
    	System.out.println("total amount remaining at the end in Bank Account: "+sum);
    	
     
	}		
}
		
		
		
		
	
	
