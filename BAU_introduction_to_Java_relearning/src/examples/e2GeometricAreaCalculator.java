package examples;

import java.util.Scanner;

public class e2GeometricAreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Görevler:
		 * 1. Geometrik Cismi belirle
		 * 2. Gerekli uzunluk Ölçülerini al
		 * 3. Alan Hesaplamasını yap
		 * 4. Sonucu Yazdır.
		 */

		
		//0. İlk Kurulum
		Scanner input = new Scanner(System.in); // Kullanıcı girişi
		String GeoObject =""; //Seçilen cismin ismi
		double Result = 0; // Sonuç virgüllü çıkabilir.
		boolean IsItValid = true; //Hata almamız durumu için bir anahtar
		
		//1. Cisim Seçimi
		System.out.println(" Kare için 1'i \n Dikdörtgen için 2'yi \n Çember için 3'ü \n Seçiniz.");// '\n' Enter tuşu gibi düşünebilirsin.
		int Selector = input.nextInt(); //Cisim cursoru
		
		
		switch (Selector) {//If else yerine burada switch case kullanılıp, seçim işlemi yapılacak
		case 1: //Kare
			GeoObject = "Karen";
			System.out.println("Karenin kenar uzunluğunu giriniz:");
			double Edge = input.nextDouble(); // 2. Kenar Uzunluğu alındı.
			Result = Edge*Edge; //3. Alan Hesaplandı
			break; // Eğer unutursanız sonraki satırları da çalıştırır!
			
		case 2: //Dikdörtgen
			GeoObject = "Dikdörtgen";
			System.out.println("Dikdörtgenin kısa kenar uzunluğunu giriniz:");
			double ShortEdge = input.nextDouble(); // 2. Kısa Kenar Uzunluğu alındı.
			System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz:");
			double LongEdge = input.nextDouble(); // 2. Uzun Kenar Uzunluğu alındı.
			Result = ShortEdge*LongEdge; //3. Alan Hesaplandı
			break; // Eğer unutursanız sonraki satırları da çalıştırır!
			
		case 3: //Çember
			GeoObject = "Çember";
			System.out.println("Çemberin yarıçap uzunluğunu giriniz:");
			double Radius = input.nextDouble(); // 2. Yarıçap Uzunluğu alındı.
			Result = Radius*Radius*Math.PI; //3. Alan Hesaplandı  ve MATH kütüphanesinden Pi değeri çağrıldı.
			break; // Eğer unutursanız sonraki satırları da çalıştırır!
		
		default: //İstenen değerler dışında bir değer girilirse çalıştırır.
			System.out.println("Yanlış bir tuşlama yaptınız.");
			IsItValid = false;
			break;
		}

		//4. Sonucun yazdırılması.
		if (IsItValid) {
		System.out.println("Seçtiğiniz" + GeoObject +"in alanı "+Result+" birim karedir.");
		}
		//5 Sistem Kapatması
		input.close();
	}

}
