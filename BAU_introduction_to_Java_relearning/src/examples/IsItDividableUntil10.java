
import java.util.Scanner;

public class IsItDividableUntil10 {
// Kullanıcıdan alınan sayının 10'ye kadar olan sayılara
// bölünüp bölünemeyeceğine bakacağız.


public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in );


    System.out.println("Lütfen bir sayı giriniz.");
    int value = input.nextInt();

    input.close(); // İşimiz bitince Scanner'i kapatıyoruz.

    //İşimizi hızlandırmak Algoritmik taktikler uygulayalım.

    switch (value){

    case 0: 
        System.out.println("0 hiçbir sayıya bölünmez!");
        break;

    default:
        System.out.println(value + " 1'e bölünür");


        if (value % 2 == 0){ //2 ve katları
            System.out.println(value + " 2'ye bölünür");
            if (value % 4 == 0){
                System.out.println(value + " 4'e bölünür");
                if (value % 8 == 0){
                    System.out.println(value + " 8'e bölünür");
                }
            }
        }
        if (value % 3 == 0){ // 3, 6 ve 9 
            System.out.println(value + " 3'e bölünür");
            if (value % 2 == 0){
            System.out.println(value + " 6'ya bölünür");
            }
            if (value % 9 == 0){
            System.out.println(value + " 9'a bölünür");
            }
        
    }
        if(value % 5 == 0){ // 5 ve 10
            System.out.println(value + " 5'e bölünür");
            if (value % 2 == 0){
            System.out.println(value + " 10'a bölünür");
        }
        }
    
        if(value % 7 == 0){ //7
        System.out.println(value + " 7'e bölünür");

}
    }
// 6 ve 10 için 1. yol budur.
//--------------------------------------------------------------------------
boolean divisibleWithTwo = false;

if (value %2 == 0){
    divisibleWithTwo = true;}

if((value % 5 == 0) && divisibleWithTwo){            
    System.out.println(value + " 10'a bölünür");
        }

if(value % 3 == 0 && divisibleWithTwo){
     System.out.println(value + " 6'ya bölünür");
    }

// 2. Yol da budur.
//--------------------------------------------------------------------------

//3. yol ise Böyledir


if(value % 3 == 0 && value %2 == 0){
     System.out.println(value + " 6'ya bölünür");
    }

if((value % 5 == 0) && value %2 == 0){            
    System.out.println(value + " 10'a bölünür");
        }


}
}
