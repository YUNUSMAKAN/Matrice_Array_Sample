package matrice.array.samples;

public class Main {

	public static void main(String[] args) {

		// MatriceOperation isminde bir sınıf tanımlamıştık.
		// Bu sınıf matris ile ilgili işlemleri yapabilmektedir. Fonksiyonlar ve Değişkenlerden oluşmaktadır.
		// "new" anahtar kelimesi ile bu sınıftan "matriceOperation" isminde yeni bir nesne ürettik.
		MatriceOperation matriceOperation = new MatriceOperation();
	
		// 0-20 arası random sayı üretmek için. 100 verirseniz 0-100 arası sayılar ürettirmek için ayarlamış olursunuz.
		matriceOperation.setRandomScaleValue(20);
		matriceSummationExample(matriceOperation);
		
		System.out.println("---------------------------");
		
		matriceMultiplicationExample(matriceOperation);
		
		
		System.out.println("---------------------------");
		
		arrayOperations();
	}
	
	public static void arrayOperations() {
		
		// Rastgele 0-20 arası double tipinde değerlerden oluşan 100 elemanlık bir dizi tanımlıyoruz.
		double[] doubleArray = DoubleArrayOperation.generateRandomDoubleArray(100, 20);
		
		// Diziyi ekrana yazdırıyoruz.
		DoubleArrayOperation.print(doubleArray);
		
		// "reverse" fonksiyonu ile dizinin tersini alıyoruz.
		double[] reversedDoubleArray = DoubleArrayOperation.reverse(doubleArray);
		
		DoubleArrayOperation.print(reversedDoubleArray);
		
		
		double avarege = DoubleArrayOperation.takeAvarage(doubleArray);
		System.out.println("Ortalama : " + avarege);
		
		
		double[] evenNumbers = DoubleArrayOperation.extractEvenNumbers(doubleArray);
		System.out.println("Çift sayılar dizisi:" );
		DoubleArrayOperation.print(evenNumbers);
		
		double[] oddNumbers = DoubleArrayOperation.extractOddNumbers(doubleArray);
		System.out.println("Tek sayılar dizisi:");
		DoubleArrayOperation.print(oddNumbers);
	}
	
	public static void matriceSummationExample(MatriceOperation matriceOperation) {
		
		int[][] firstMatrice = matriceOperation.fillMatrice(3, 5);
		int[][] secondMatrice = matriceOperation.fillMatrice(3, 5);
		
		
		System.out.println("Matris Toplama İşlemi Örnek\n");
		
		System.out.println("Matris-1 Boyutları");
		matriceOperation.printMatriceSize(1, firstMatrice);
		
		
		System.out.println();
		
		
		System.out.println("Matris-2 Boyutları");
		matriceOperation.printMatriceSize(2, secondMatrice);

		
		System.out.println();
		
		
		System.out.println("Matris-1 Elemanları");
		matriceOperation.printMatrice(firstMatrice);
		
		
		System.out.println();
		
		
		System.out.println("Matris-2 Elemanları");
		matriceOperation.printMatrice(secondMatrice);
		
		System.out.println();
		
		
		// İki matrisin toplamını yapan fonksiyonumuz "sumMatrices" çağrıyoruz. İçine iki tane girdi (input) yolluyoruz.
		int[][] resultMatrice = matriceOperation.sumMatrices(firstMatrice, secondMatrice);
		
		System.out.println("Sonuç Matris Boyutları");
		matriceOperation.printMatriceSize(3, resultMatrice);
		
		System.out.println();
		
		System.out.println("Sonuç Matris Elemanları");
		matriceOperation.printMatrice(resultMatrice);
		
		System.out.println();
	}
	
	public static void matriceMultiplicationExample(MatriceOperation matriceOperation) {
		
		int[][] firstMatrice = matriceOperation.fillMatrice(3, 4);
		int[][] secondMatrice = matriceOperation.fillMatrice(4, 6);
		
		
		System.out.println("Matris Çarpma İşlemi Örnek\n");
		
		System.out.println("Matris-1 Boyutları");
		matriceOperation.printMatriceSize(1, firstMatrice);
		
		
		System.out.println();
		
		
		System.out.println("Matris-2 Boyutları");
		matriceOperation.printMatriceSize(2, secondMatrice);
		
		
		System.out.println();
		
		
		System.out.println("Matris-1 Elemanları");
		matriceOperation.printMatrice(firstMatrice);
		
		
		
		System.out.println();
		
		
		
		System.out.println("Matris-2 Elemanları");
		matriceOperation.printMatrice(secondMatrice);
		
		
		System.out.println();
		
		
		// İki matrisin çarpımını yapan fonksiyonumuz "multiplyMatrices" çağrıyoruz. İçine iki tane girdi (input) yolluyoruz.
		int[][] resultMatrice = matriceOperation.multiplyMatrices(firstMatrice, secondMatrice);
		
		System.out.println("Sonuç Matris Boyutları");
		matriceOperation.printMatriceSize(3, resultMatrice);
		
		
		System.out.println();
		
		
		System.out.println("Sonuç Matris Elemanları");
		matriceOperation.printMatrice(resultMatrice);
		
		System.out.println();
		
		
	}

}
