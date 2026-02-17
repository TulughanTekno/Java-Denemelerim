package basis;

public class VariableTypes {

	public static void main(String[] args) {
		
/*Java 8 adet ana değişken tipine sahiptir. Bunlar;
 * 
 * Değişken : Türü 		: Aralığı
 * --------------------------------------
 * int 		: Tam sayı	: -2^32 , 2^32
 * long  	: Tam sayı  : -2^64 , 2^64
 * short	: Tam sayı 	: -2^16 , 2^16
 * double 	: Virgüllü  : -2^32 , 2^32
 * float	: Virgüllü	: -2^64 , 2^64
 * byte		: Tam sayı 	:    0 --- 255
 * boolean  : Mantık	: true / false
 * char		: Karakter	: Herhangi bir karakter. Not: ' ' kullanmak zorunlu.
 */
// String	: Metin 	: " " ile işaretlenmiş herhangi bir metin.
// 9. Değişken tipi olarak geçer, bundan dolayı büyük harfle başlar. DİKKAT!!
		
		
	/*Değişken Tanımlama
	*
	* DeğişkenTürü DeğişkenAdı = DeğişkenDeğeri(sonradan verilebilir);  
	*/
		byte Age; // Yaş değişkeni byte olarak atandı.
		int NumberInt = 35; //Değişken türü integer olarak belirlendi, 35 değeri atandı.
		double NumberDouble = 35.5; //Değişken türü double olarak belirlendi, 35.5 değeri atandı.
		
		// Her işlem satırının sonunda ; koymayı unutma!!!
		
		//char SyMbol = "Ğ"; //Hata verir, baştaki //'i kaldırıp deneyebilirsin.
		char Symbol = 'Ğ'; //Sıkıntı yok. 
		// SyMbol =/= Symbol , Java büyük küçük harfe duyarlıdır.
		
		
		int CurrentYear = 2026;
		short BirthYear  = 2006;
		long AGE = CurrentYear - BirthYear ; //Age değişkeni kullanımda olduğundan yeni bir tane tanımladık.
		
		System.out.println(AGE);
		
		
		
		//Metni değişkene işleme
		String Name = "Aras Kargo"; // ""'i unutma!!
		Name = "Polis"; //Sonradan değişkeni değiştirebilirsin ancak türü sabit kalır.
		
		
		
	/*Değişken Kuralları;
	 * -------------------
	 * 1) Büyük küçük harf duyarlıdır. var =/= VAR
	 * 2) İlk karakter hariç sayı kullanılabilir.
	 * 3) Türkçe karakter kullanılabilir ancak tavsiye edilmez.
	 * 4) Yazı stili olarak "variable_name" yerine "VariableName" kullanılır.
	 * 5) Özel karakter kullanılmaz!
	 */
		
	}

}
