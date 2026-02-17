package basis;

import java.util.Scanner; // Ya bunu import et, ya da Scanner yazıp CTRL + Boşluk + Enter yap.

public class GettingInputViaScanner extends VariableTypes {

	public static void main(String[] args) {
		//Scanner GirişYapacakİmleçAdı = new Scanner(System.in);
		
		Scanner input = new Scanner(System.in); //Klavyeden alınan değerleri işler.
		//Ben input yazmaya alışık olduğumdan input yazıyorum. 
		//"Sc" veya "sc" sıkça kullanılan değişken ismidir.
		
		int Number1;
		int Number2;
		
		System.out.print("1. Sayıyı giriniz =");
		Number1 = input.nextInt(); //İle klavyeden gelen int değerleri değişkene işlenir.
				
		System.out.print("2. Sayıyı giriniz =");
		Number2 = input.nextInt(); //İle klavyeden gelen int değerleri değişkene işlenir.
		
		int Total = Number1+Number2;
		System.out.println("İşleminizin sonucu "+Total+" çıkıyor.");

		
		
	}

}
