package intro;

public class RecapDemo2 {

	public static void main(String[] args) {
		// en büyük sayıyı bul.
		double[] myList = { 1.6, 6.0, 2.5, 5.6 };
		double total = 0;
		double max = myList[0];

		{
			for (double number : myList) {
				System.out.println("Result = " + number);
				if (max < number) {
					max = number;
					total = total + number;

				}
			}
			System.out.println("Maksimum değer = " + max);

			// burada döngü her seferinde array elemanlarını döngüye girdikçe topluyor.

		}

	}
}