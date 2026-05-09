
import java.util.Scanner;



public class e5NumberGuessingGame {


    public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);

    int correctNumber = 42;
    int lives = 5;

    while(lives > 0){

        System.out.println("1 ile 100 arasında bir sayı tahmin ediniz!");
        int guess = input.nextInt();

        if (guess==correctNumber){
            System.out.println("Tebrikler doğru sayıyı bildiniz. Yoksa hile mi yaptınız?");
            break;      
        }
        else{
            System.out.println("Yanlış tahmin. Tekrar deneyin.");
            lives--;
        }

    }

    if (lives==0){
        System.out.println("Tahmin hakkınız bitmiştir, oyunu kaybettiniz.");
    }
    input.close();

    }
}
