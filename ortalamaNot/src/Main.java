import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int mat, fizik, turkce, kimya, muzik, toplam = 0, topDers=0;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Matematik notunuzu giriniz: ");
		mat = input.nextInt();
		
		if(mat >= 0 && mat<=100) {
			toplam+=mat;
			topDers++;
		}
		
		System.out.println("Fizik notunuzu giriniz: ");
		fizik = input.nextInt();
		
		if(fizik >= 0 && fizik<=100) {
			toplam+=fizik;
			topDers++;
		}
		
		System.out.println("Turkce notunuzu giriniz: ");
		turkce = input.nextInt();
		
		if(turkce >= 0 && turkce<=100) {
			toplam+=turkce;
			topDers++;
		}
		
		System.out.println("Kimya notunuzu giriniz: ");
		kimya = input.nextInt();
		
		if(kimya >= 0 && kimya<=100) {
			toplam+=kimya;
			topDers++;
		}
		
		System.out.println("Muzik notunuzu giriniz: ");
		muzik = input.nextInt();
			
		if(muzik >= 0 && muzik<=100) {
			toplam+=muzik;
			topDers++;
		}
			
		double avarage = toplam/topDers;
		if(avarage <= 55) {
			System.out.println("S�n�fta kald�n�z!");
		}
		else {
			System.out.println("S�n�f� ge�tiniz, Tebrikler!");
		}
		System.out.println("Ortalaman�z:"+ avarage);

	}

}
