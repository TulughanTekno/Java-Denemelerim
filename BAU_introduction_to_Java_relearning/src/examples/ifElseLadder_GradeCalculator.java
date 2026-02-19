package examples;

import java.util.Scanner;

public class ifElseLadder_GradeCalculator {

	public static void main(String[] args) {
		// Bir değişkenin ismini bütün heryerde değiştirmek için ALT + SHIFT + R kombinasyonunu kullanabilirsiniz.
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Dersten aldığınız son notu giriniz.");
		int Grade = input.nextInt(); //Veri tipini girmeyi unutmayın.
		
		String LetterGrade; //Harf Notu değişkeni ayarladık.
		
		if (Grade>=90) // Öğrenci notunu harf notuna çevireceğiz.
			LetterGrade ="A";
		else if (Grade>85)
			LetterGrade ="A-";
		else if (Grade>=80)
			LetterGrade ="B+";
		else if (Grade>=75)
			LetterGrade ="B";
		else if (Grade>=70)
			LetterGrade ="B-";
		else if (Grade>=65)
			LetterGrade ="C+";
		else if (Grade>=60)
			LetterGrade ="C";
		else if (Grade>=55)
			LetterGrade ="C-";
		else if (Grade>=50)
			LetterGrade ="D+";
		else 
			LetterGrade ="F";
		
		
		//Harf notu açıklamasını sadece son satıra ayarladık, böylece daha sade bir if else ladder'ına sahip olduk.
		System.out.println("Aldğınız "+Grade+" notu için harf notunuz: "+LetterGrade+"'dir.");//F string örneği
		
		
		

	}

}
