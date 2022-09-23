package intro;

public class FriendNumbers {

	public static void main(String[] args) {
		int a = 17296;
		int b = 18416;
		int total1 = 0;
		int total2 = 0;
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				total1 = total1 + i;

			}
		}
		for (int j = 1; j < b; j++) {
			if (b % j == 0) {
				total2 = total2 + j;

			}
		}
		if (a == total2 && b == total1) {
			System.out.println("Arkadaş sayılardır.");

		} else {
			System.out.println("Arkadaş sayı değillerdir.");
		}
	}

}
