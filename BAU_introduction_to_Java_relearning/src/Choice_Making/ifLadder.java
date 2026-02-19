package Choice_Making;

public class ifLadder {

	public static void main(String[] args) {
		//If Merdiveni
		
		int Experience = 23; //Yıl olsun
		
		if (Experience>=20);
		System.out.println("1/4 Kademesindesiniz.");
		if (Experience>=18);
		System.out.println("1/5 Kademesindesiniz.");
		if (Experience>=15);
		System.out.println("2/5 Kademesindesiniz.");
		if (Experience>=12);
		System.out.println("2/6 Kademesindesiniz.");
		if (Experience>=10);
		System.out.println("3/6 Kademesindesiniz.");
		if (Experience>=8);
		System.out.println("3/7 Kademesindesiniz.");
		if (Experience>=5);
		System.out.println("3/8 Kademesindesiniz.");
		if (Experience>=3);
		System.out.println("4/8 Kademesindesiniz.");
		if (Experience>=1);
		System.out.println("5/8 Kademesindesiniz.");
		if (Experience==0);
		System.out.println("Kademeniz Bulunmamaktadır.");
		
		System.out.println("--------------------------");
		// Görüldüğü üzere bütün koşulları sağlayan kademeler yazılıyor.
		//Çözüm yolu : İf Else Merdiveni
		
		if (Experience>=20)
		System.out.println("1/4 Kademesindesiniz.");
		else if (Experience>=18)
		System.out.println("1/5 Kademesindesiniz.");
		else if (Experience>=15)
		System.out.println("2/5 Kademesindesiniz.");
		else if (Experience>=12)
		System.out.println("2/6 Kademesindesiniz.");
		else if (Experience>=10)
		System.out.println("3/6 Kademesindesiniz.");
		else if (Experience>=8)
		System.out.println("3/7 Kademesindesiniz.");
		else if (Experience>=5)
		System.out.println("3/8 Kademesindesiniz.");
		else if (Experience>=3)
		System.out.println("4/8 Kademesindesiniz.");
		else if (Experience>=1)
		System.out.println("5/8 Kademesindesiniz.");
		else if (Experience==0)
		System.out.println("Kademeniz Bulunmamaktadır.");
		//Göründüğü gibi sadece koşulu sağlayan ilk kademe derecesini gösteriyor.
	}

}
