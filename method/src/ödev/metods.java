package ödev;

public class metods {

	public static void main(String[] args) {
		sayıBulmaca();
		int toplam = topla(1,2,3,4,5,-6);
		System.out.println(toplam);
	}

	public static int topla(int... sayılar) {
		int toplam = 0; 
		for (int sayı : sayılar) {
			toplam =toplam + sayı;
		}
		return toplam;
	}

	public static void sayıBulmaca() {
		int[] sayılar = new int[] { 1, 2, 3, 4, 5, 6 };
		int aranacak = 6;
		boolean varMı = false;
		for (int sayı : sayılar) {
			if (sayı == aranacak) {
				varMı = true;
				break;
			}
		}
		if (varMı) {
			System.out.println("sayı var");
		} else {
			System.out.println("sayı yok");
		}
	}

}
