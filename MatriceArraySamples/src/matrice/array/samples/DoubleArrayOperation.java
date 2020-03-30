package matrice.array.samples;

public class DoubleArrayOperation {

	
	public static double[] generateStaticDoubleArray() {
		
		double[] doubleItems = { 4.50, 5.32, 6.32, 2.30};
		return doubleItems;
		
	}
	
	
	public static double[] generateRandomDoubleArray(int arraySize, int randomScaleValue) {
		
		 double[] temporaryRandomDoubleArray = new double[arraySize];
		 for(int i=0; i<arraySize; i++) {
			 temporaryRandomDoubleArray[i] = (Math.random() * randomScaleValue);
		 }
		 
		 return temporaryRandomDoubleArray;
				 
	}
	
	public static double[] reverse(double[] array) 
	{
		
		if(array == null) 
		{
			//boyutu sifir olan bos bir array donduruyoruz.
			return new double[0];
		}
		
		double [] reversedArray = new double[array.length];
		
		for(int i=(array.length-1), j=0; i>=0; i--,j++) 
		{
			reversedArray[i] = array[j];
		}
		
		return reversedArray;
	}
	
	public static double takeAvarage(double[] array) 
	{
		
		if(array == null) 
		{
			return 0.0;
		}
		
		double summationTotalValue = 0.0;
		
		for(int i=0; i < array.length; i++) 
		{
			summationTotalValue += array[i];
		}
		
		return summationTotalValue / (array.length);
	}
	
	public static int findSizeOfOddNumbers(double[] array) 
	{
		
		int oddNumbersCount = 0;
		for(int i=0; i < array.length; i++) {
			
			if(array[i] % 2 != 0) {
				oddNumbersCount++;
			}
		}
		return oddNumbersCount;
	}
	
	public static int findSizeOfEvenNumbers(double[] array) {
		
		int evenNumbersCount = 0;
		for(int i=0; i < array.length; i++) {
			
			if(array[i] % 2 == 0) {
				evenNumbersCount++;
			}
		}
		return evenNumbersCount;
	}
	
	public static double[] extractEvenNumbers(double[] array) {
		
		int evenNumberCount = findSizeOfEvenNumbers(array);
		double[] evenNumbers = new double[evenNumberCount];
		
		int evenNumberIndex = 0;
		for(int i=0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				evenNumbers[evenNumberIndex] = array[i];
				evenNumberIndex++;
				
				// yukarıdaki satırı aşağıdaki gibi tek satırda yapabilirsiniz.
				// evenNumbers[evenNumberIndex++] = array[i];
			}
		}
		
		return evenNumbers;
	}
	
	public static double[] extractOddNumbers(double[] array) {
		
		int oddNumberCount = findSizeOfOddNumbers(array);
		double[] oddNumbers = new double[oddNumberCount];
		
		int oddNumberIndex = 0;
		for(int i=0; i < array.length; i++) {
			if(array[i] % 2 != 0) {
				oddNumbers[oddNumberIndex] = array[i];
				oddNumberIndex++;
			}
		}
		
		return oddNumbers;
	}
	
	public static void print(double[] array) {
		for (int i = 0; i < array.length; i++) {
		      System.out.print(array[i] + " ");
		   }
		}
		

	
}
