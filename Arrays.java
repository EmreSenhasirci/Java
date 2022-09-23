package intro;

public class Arrays {

	public static void main(String[] args) {
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Emre";
		ogrenciler[1] = "Berat";
		ogrenciler[2] = "Ahmet";
		for (int i = 0; i < ogrenciler.length; i++)
			System.out.println(ogrenciler[i]);
// ya da: 
		for (String ogrenci : ogrenciler)
			System.out.println(ogrenci);

	}

}
