package intro;

public class MultiDimentionalArrays {
	public static void main(String[] args){
	//çok boyutlu diziler matrislere benzetilebilir.
 String[][]	sehirler = new String[3][3];
	 
 sehirler[0][0] = "İstanbul";
 sehirler[0][1] = "Bursa";
 sehirler[0][2] = "İzmir";
 sehirler[1][0] = "Çanakkale";
 sehirler[1][1] = "Kırklareli";
 sehirler[1][2] = "Edirne";
 sehirler[2][0] = "Antalya";
 sehirler[2][1] = "Kocaeli";
 sehirler[2][2] = "Yalova";
 for(int i=0;i<=2;i++) {
	 System.out.println("-----------------");
	 for(int j=0;j<=2;j++) {
		 System.out.println(sehirler[i][j]);
	 }
 }
}
}