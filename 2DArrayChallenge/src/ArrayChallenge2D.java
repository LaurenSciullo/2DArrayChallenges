
public class ArrayChallenge2D
	{

		public static void main(String[] args)
			{
		System.out.println("Hello!");
			
		 int [ ] [ ] myArray = {{3, 5, 9, 2, -1, 8, 13}, 
					 			{-2, 5, 1, 11, 8, 2, 0}, 
					 			{9, 1, -3, 4, 8, 4, 8}, 
					 			{6, 0, 0, -1, 4, 12, 7}, 
					 			{2, 6, -1, 5, 3, 10, 1}, 
					 			{2, 5, 1, 2, 9, 2, 3}, 
					 			{-3, 1, 1, 4, 11, 12, 4}};
		 int sum = 0;
		 int average = 0;
		 int maxNumber = Integer.MIN_VALUE ;
		 int minNumber = Integer.MAX_VALUE ;
		 
		 for (int row = 0; row < myArray.length; row++)
			 {
				 for (int col = 0; col < myArray[0].length; col++)
					 {
					 
				sum += myArray[row][col];

					 }
			 }
		
		 average = sum / 49;
		 System.out.println("Your average is: " + average);
		 
		 for (int row = 0; row < myArray.length; row++)
			 {
				 for (int col = 0; col < myArray[0].length; col++)
					 {
						 if (myArray[row][col] > maxNumber)
							 {
								 maxNumber = myArray[row][col];
							 }
						 else if (myArray[row][col] < minNumber)
							 {
								 minNumber = myArray[row][col];
							 }
					 }
			 }
		 System.out.println("Your maximum number: " + maxNumber);
		
		
		System.out.println("Your minimum number: " + minNumber);
		}
	}
