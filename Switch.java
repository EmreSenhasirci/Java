package intro;

public class Switch {
	public static void main(String[] args) {
		char grade = 'g';

		switch (grade) {

		case 'A':
			System.out.println("Mükemmel! Geçtiniz :)");
			break;
		case 'B':
			System.out.println("Güzel! Geçtiniz :)");
			break;
		case 'C':
			System.out.println("Fena değil.Geçtiniz :)");
			break;
		case 'D':
			System.out.println("Geçtiniz.");
			break;
		case 'F':
			System.out.println("Geçemediniz :(");
			break;
		default:
			System.out.println("Yanlış değer.");
		}

	}

}
