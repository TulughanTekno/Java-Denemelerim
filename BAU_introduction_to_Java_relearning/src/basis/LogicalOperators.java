

public class LogicalOperators {
 public static void main(String[] args) {
   
/* Sayılar için Denklem Koşullarını hatırlayalım:
	 * 
	 * Denklem	: Anlamı
	 * a <  b 	: a küçüktür b
	 * a <= b	: a küçüktür veya eşittir b 
	 * a >  b 	: a büyüktür b
	 * a >= b	: a büyüktür veya eşittir b
	 * a == b 	: a eşittir b
	 * a != b 	: a eşit değildir b
     * a % b 	: a mod b (a'nın b'ye bölümünden kalan)
	 */
  
 
 int a = 3 , b= 5 , c= 7 , d= 5, e=1;

 if(a < b) {
     System.out.println("a küçüktür b");
 }
 if (d <= b) {
     System.out.println("d küçüktür veya eşittir b");
 }

if (c > a) {
    System.out.println("c büyüktür a");
}

if (d==b) {
    System.out.println("d eşittir b");
}

if (a != c) {
    System.out.println("a eşit değildir c");
}

if (c % a == e) {
    System.out.println("c mod a işleminin sonucu 1'dir");
}


System.out.println("-------------------------");
/*
    * Mantıksal Operatörler:
    * 
    * Denklem	: Anlamı
    * a && b 	: a VE b  (Shift + 6 = &)   :  AND
    * a || b 	: a VEYA b (Alt Gr + - = |) :  OR
    * !a 		: a DEĞİL (Shift + 1 = !)   :  NOT
     */


if (a < b && c > d) {
    System.out.println("a küçüktür b VE c büyüktür d");
}

if (b==d || e > c) {
    System.out.println("b eşittir d VEYA e büyüktür c");
}

if (!false){
    System.out.println("Yanlışın değili doğrudur");
}



System.out.println("-------------------------");
/* Küçük bir NOT:

    == operatörü Sayılarda (int, double, float vb.)
    ve karakterlerde (char) eşitliği kontrol ederken kullanılır.

    Ancak String'te RAM'deki konuma bakar.
    İçeriği kontrol etmek için .equals() kullanılır.

*/

int number1 = 42;
int number2 = 42;
String str1 = "Merhaba";
String str2 = "Merhaba";

if (number1 == number2) {
    System.out.println("İki sayının da DEĞERLERİ eşittir.");
}

if (str1 == str2)  { // Eğer doğru ise JAVA daha az bellek harcamak için aynı konuma yazmıştır.
    System.out.println("İki STR'nin ram konumları eşittir.");
} // Bunu kullanmayın! Her zaman doğru olmayabilir.

if (str1.equals(str2)) {
    System.out.println("İki STR'nin İÇERİKLERİ eşittir.");
}

System.out.println("-------------------------");
/*

*/




 }
}
