package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
KrediUI krediUI=new KrediUI();
krediUI.KrediHesapla(new AskerKredisiManager());
krediUI.KrediHesapla(new TarımKrediManager());
krediUI.KrediHesapla(new ÖğretmenKrediManager());	
	}

}
