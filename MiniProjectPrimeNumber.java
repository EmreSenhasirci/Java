package intro;

public class MiniProjectPrimeNumber {
	public static void main(String[] args) {

		// burada asal sayı olma durumunda ekrana yazı yazılmazken değilse ekrana true
		// değeri girilecektir.
		// Diğer çözüm:

		boolean isPrime = true;
		int number = 1;
		if ( number == 1 ) {
		System.out.println("Sayı asal değildir.");	
		return;
			
		}
		if (number < 2) {
			System.out.println("Geçersiz sayı.");
		} else {

			for (int t = 2; t < number; t++) {
				if (number % t == 0) {
					isPrime = false;

				}

			}
			if (isPrime) {
				System.out.println("Sayı asaldır.");
			} else {

				System.out.println("Sayı asal değildir.");
			}
		}

	}
}
