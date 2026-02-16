package basis;

public class PrintFunction {

	public static void main(String[] args) {
		// Çift slash ile comment satırı koyarsın
		
		/*İle 
		 *birden
		 *çok 
		 *satırda
		 *comment 
		 *koyarsın
		 */
		
		//syso + CTRL + boşluk tuşu
		System.out.println(""); // Print + Enter Atar
		System.out.print(""); // Sadece Print yazar
		
		
		// Deneyelim
		System.out.println("-1-");
		System.out.print("-2-");
		System.out.println("-3-");
		
		System.out.println("-------------------------");
		
		// Println
		System.out.println("Selam Düniya:");
		System.out.println(42);
		
		// print
		System.out.print("A.Selam Mars:");
		System.out.print(42);
	
		System.out.println();
		System.out.println("-------------------------");
		
		//F string 
		System.out.println("Dolar Türk Lirası kuru şu anda : 1$ = "+ 44 +"TL.");
		
		
		System.out.println("-------------------------");
		
		System.out.println(5+5);  	//10
		System.out.println("5+5");	//5+5
		System.out.println("5"+"5");//55
		// Java matematik işlemlerine öncelik verir.
		// Ardından birleştirme işlemi yapar.
		System.out.println(6+8+" :(6+8) İşleminin sonucunu bulur iken,"+5+4+" (5+4)işleminde birleştirme yapar.");
		
	}

}
