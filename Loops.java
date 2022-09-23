package intro;

public class Loops {

	public static void main(String[] args) {
		// for döngüsü
		int i = 1;
		{
			for (; i <= 10; i = i + 1)
				System.out.println("i = " + i);
		}
		System.out.println("For loop is over.");
		// while döngüsü
		{
			int j = 0;
			while (j <= 10) {
				System.out.println("j = " + j);
				j = j + 2;
			}
			System.out.println("While loop is over.");
			// do-while döngüsü
			{
				int k = 0;
				do {
					System.out.println("k = " + k);
					k += 3;

				} while (k <= 10);
				System.out.println("Do-While loop is over.");
			}
		}

	}

}
