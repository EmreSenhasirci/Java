package intro;

public class SesliHarfler {
	public static void main(String[] args) {
		char character = 'i';
		String inceSesliHarf = "EeİiÖöÜü";

		int isSesli = inceSesliHarf.indexOf(character);
		if (isSesli == -1) {
			System.out.println("Kalın Sesli harf ");

		} else {
			System.out.println("İnceSesli harftir");
			System.out.println("---------------------");
		}
		// diğer bir seçenek olarak:
		char karakter = 'e';
		switch (karakter) {
		case 'a':
		case 'ı':
		case 'o':
		case 'u':
			System.out.println("Kalın sesli harf.");
			break;
			default:
				System.out.println("İnce sesli harf.");

		}
	}

}
