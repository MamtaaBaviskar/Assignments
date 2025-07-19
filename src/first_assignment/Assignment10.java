package first_assignment;

public class Assignment10 {

	public static void main(String[] args) {
		int[]numbers=new int[7];
		numbers[0]=12;
		numbers[1]=34;
		numbers[2]=11;
		numbers[3]=36;
		numbers[4]=87;
		numbers[5]=98;
		numbers[6]=93;
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		int thirdLargest=Integer.MIN_VALUE;

		
		
		/*for(int i=0;i<numbers.length;i++)
			if(numbers[i]>90) {
				System.out.println(numbers[i]);
			} */
		
		for(int i=0;i<numbers.length;i++) {
			
			if(numbers[i]>largest) {
			
				thirdLargest=secondLargest;
				secondLargest=largest;
				largest=numbers[i];
			
			}
			
			else if(numbers[i]>secondLargest && numbers[i]!=largest){
			
				
				thirdLargest=secondLargest;
				secondLargest=numbers[i];
			}
			
			else if(numbers[i]>thirdLargest && numbers[i]!=largest && numbers[i]!=secondLargest) {
				
				thirdLargest=numbers[i];
			
			}
			
		}
		System.out.println("Second Largest Number: " + secondLargest);
        System.out.println("Third Largest Number: " + thirdLargest);
	
	}

}
