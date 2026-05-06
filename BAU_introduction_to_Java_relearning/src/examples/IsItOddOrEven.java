
import java.util.Scanner;

public class IsItOddOrEven {
 public static void main(String[] args) {
     
    Scanner input = new Scanner(System.in); //Veri almak için Scanner oluşturduk

    System.out.print("Bir sayı giriniz: ");
    int number = input.nextInt(); //Kullanıcıdan bir INT alıyoruz




    // Yöntem 1:  Düz Mantık
    if (number % 2 == 0) { 
        //Sayının 2'ye bölümünden kalan 0 ise çift : 1 ise tek sayıdır.
     
        System.out.println("Seçilen sayı "+ number + " çifttir.");
    }
    else { 
        // Bölümden kalanın 1 olması durumunda

        System.out.println("Seçilen sayı "+ number + " tektir.");
    }
    //--------------------------------------------------------------
    //Yöntem 2: Ters Mantık
    if (number % 2 == 1) { 
        //Sayının 2'ye bölümünden kalan 0 ise çift : 1 ise tek sayıdır.
     
        System.out.println("Seçilen sayı "+ number + " tektir.");
    }
    else { 
        // Bölümden kalanın 1 olması durumunda

        System.out.println("Seçilen sayı "+ number + " çifttir.");
    }
//--------------------------------------------------------------
    //Yöntem 3: Değil'li ifade
    if (number % 2 != 1) { 
        //Sayının 2'ye bölümünden kalan 0 ise çift : 1 ise tek sayıdır.
     
        System.out.println("Seçilen sayı "+ number + " çifttir.");
    }
    else { 
        // Bölümden kalanın 1 olması durumunda

        System.out.println("Seçilen sayı "+ number + " tektir.");
    }
//---------------------------------------------------------------------
    // Yöntem 4: Inline If Fonksiyonu

    System.out.println(number % 2 == 0 ? "Çift" : "Tek");



    input.close(); //İşimiz bittiği zaman scanner'i kapatıyoruz.
}
}
