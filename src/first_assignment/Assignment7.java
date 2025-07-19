package first_assignment;

public class Assignment7 {
	
	
	
	
	public static void main(String[] args) {
		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;
		
		Assignment7 loan_checker = new Assignment7();
		boolean is_eligibal = loan_checker.isEligibleFor(creditScore,income,isEmployed,debtToIncomeRatio);
		
		
		
		System.out.println(customerName + " is eligibal for loan: "+ is_eligibal);

	}
  public boolean isEligibleFor(int creditScore, double income, boolean isEmployed, double debtToIncomeRatio)
  {
		   if (creditScore>=750)
		   {
			   return true;
		   }
		   else if(creditScore>=650 && creditScore<=750){ 
			if(income >=50000.0){
				if(isEmployed=true){
					
					if(debtToIncomeRatio<40.0){
						return true;
					}
					else{
						return false;
					}
				}
				else{
					return false;
					
				}
			}
			else{
				return false;
			}
		  }else if(creditScore<650)
		  {
			  return true;
			  
		  }
		  return false;
	 }
	  
 }
  

