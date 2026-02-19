package Choice_Making;

import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
		
		//Gerçek hayattaki anahtarlar gibi switch case'lerde koşulun tam olarak sağlanması gerekmektedir. 
		//Eğer sağlanıyorsa kod çalıştırılır.
		Scanner input = new Scanner(System.in);
		System.out.println("Kırmızı ışık cezası hesaplayıcısına hoş geldiniz.\nLütfen kurallara uyunuz.\nDaha önce aldığınız kırmızı ışık cezasını yazınız.");
		int warnings = input.nextInt();
		
		switch (warnings) { //Değerlerine bakılacak değişkenler buraya yazılır.
		
		case 0: // 0 değeri girilirse
			System.out.println("Ödeyeceğiniz Ceza miktarı: 1,000₺");
			break; // Eğer unutursanız sonraki satırları da çalıştırır!
		case 1:
			System.out.println("Ödeyeceğiniz Ceza miktarı: 10,000₺");
			break; // Eğer unutursanız sonraki satırları da çalıştırır!
		case 2:
			System.out.println("Ödeyeceğiniz Ceza miktarı: 15,000₺");
			break; // Eğer unutursanız sonraki satırları da çalıştırır!
		case 3:
			System.out.println("Ödeyeceğiniz Ceza miktarı: 20,000₺");
			//3 değerini girerek deneyebilirsiniz.
		case 4:
			System.out.println("Ödeyeceğiniz Ceza miktarı: 30,000₺");
			break; // Eğer unutursanız sonraki satırları da çalıştırır!
		case 5:
			System.out.println("Ödeyeceğiniz Ceza miktarı: 80,000₺");
			break; // Eğer unutursanız sonraki satırları da çalıştırır!
		default: //İstenen değerler dışında bir değer girilirse çalıştırır.
			System.out.println("Yanlış bir tuşlama yaptınız.");
		}
		

		
		//break fonksiyonu içerisinde bulunulan switch yapısından çıkmak için kullanılır.
	}

}
