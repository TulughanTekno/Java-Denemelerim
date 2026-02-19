package Choice_Making;

public class IfFunction {

	public static void main(String[] args) {
	 
		//if fonksiyonu doğru/yanlış ilişkisinde çalışır. boolean için idealdir.
		
		/*if (doğruluğu kontrol edilecek denklem){
		* Eğer denklem doğru ise çalıştıralacak kodlar.
		*}
		*/
	if (true){
		System.out.println("Vallahi  doğruyu söylüyorum abi");
	}
	if (false) {
		System.out.println("Bu bir yanlış bilgi.");
	} //Uyarı: Bu fonksiyon hiçbir koşulda çalışmayacağından ölü koddur.
	
	System.out.println("------------------");
	
	// Değişken ile örnek verelim
	
	boolean isEmpty = true ;
	
	if (isEmpty) {
		System.out.println("İçeri girebilirsiniz.");
	}
	else { //else fonksiyonu, if fonksiyonunun yanlış cevap verdiği yerlerde kullanılmak içindir.
		System.out.println("Müsait değil, daha sonra tekrar deneyin.");
	}
		
	System.out.println("------------------");
	
	/* Denklemlere girmeden önce denklem koşullarını öğrenelim.
	 * 
	 * Denklem	: Anlamı
	 * a <  b 	: a küçüktür b
	 * a <= b	: a küçüktür veya eşittir b 
	 * a >  b 	: a büyüktür b
	 * a >= b	: a büyüktür veya eşittir b
	 * a == b 	: a eşittir b
	 * a != b 	: a eşit değildir b
	 */
	
	int HomeSellPrice = 987654321;
	int HomeBuyPrice =  123456789;
	
	if (HomeBuyPrice < HomeSellPrice) {
		System.out.println("Tebrikler, kar ettiniz.");
	}
	else {
		System.out.println("Üzgünüm, zarar ettiniz.");
	}
	
		
	
	System.out.println("------------------");
	
	
	byte x = 23;
	byte y = 23;
	
	if (x==y) //Eğer tek satır kod yazılacak ise parantez açılmadan da yazılabilir.
		System.out.println("Eğer denklem Doğru ise burası yazılır.");
	else {
		System.out.println("Eğer denklem Yanlış ise burası yazılır");}
	System.out.println("Burası her türlü yazılır.");
	
	
	System.out.println("------------------");
	if (x!=y) //Karmaşıklığın önlenmesi ve kod okumanın kolaylaşması için parantez kullanımı tavsiye edilir.
		System.out.println("Eğer denklem Doğru ise burası yazılır.");
	else {
		System.out.println("Eğer denklem Yanlış ise burası yazılır");}
	System.out.println("Burası her türlü yazılır.");
	
	}

}
