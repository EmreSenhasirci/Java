package intro;

public class Strings {
	public static void main(String[] args) {
		String mesaj = "      Merhaba!";

//System.out.println("Eleman sayısı = " + mesaj.length());
//System.out.println("7. eleman = " + mesaj.charAt(6));	
//System.out.println(mesaj.concat(" Benim adım Emre."));
//System.out.println(mesaj.startsWith("E"));
//System.out.println(mesaj.endsWith("!"));
		char[] karakterler = new char[25];
		mesaj.getChars(0, 7, karakterler, 0);
//System.out.println(karakterler);
//System.out.println(mesaj.indexOf('a'));
//System.out.println(mesaj.lastIndexOf('a'));

//System.out.println(mesaj.concat("Benim adım Emre.").replace(' ', '_'));
		String mesaj1 = mesaj.concat(" Benim adım Emre.        ");
		System.out.println(mesaj1);

//System.out.println(mesaj1.substring(mesaj.length(),mesaj1.length()));

		for (String kelime : mesaj1.split(" ")) {

			System.out.println(kelime);

		}
		System.out.println(mesaj1.toUpperCase());
		System.out.println(mesaj1.toLowerCase());
		System.out.println(mesaj1.trim());
	}

}
