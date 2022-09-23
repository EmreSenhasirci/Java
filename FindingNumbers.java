package intro;

public class FindingNumbers {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 5, 7, 9 };
		int number = 7;
		boolean p = false;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == number) {
				p = true;
			}
		}
		if (p) {
			System.out.println("dizi içerisindedir.");
		} else {
			System.out.println("dizi içerisinde değildir.");
		}
	}

}
