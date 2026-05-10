
import java.util.Scanner;

public class e6DesendingOrderParagraphs {

    public static void main(String[] args) {
        
        /*Hedefimiz 5 değeri girildiğinde
        *****
         ****
          ***
           **
            *
        Yazdırmak. 
        */
        System.out.println("Kaç satır yazdırmak istiyorsunuz?");
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();
        
        int secondaryVariable = lines; //Önemli değil, sadece diğer uygulamalar da çalışabilsin diye.




        do { 

            for(int inline = 1; inline <= lines; inline++){

                System.out.print("*");

            }
            System.out.println("");
            lines--;

        } while (lines>0);
        /*
        
        Sola yatık azalan
        ***
        **
        *
        
        */
System.out.println("--------------------------------");

        lines = secondaryVariable;


            for(int lineNumber = 1; lineNumber <= lines;lineNumber++){

               // System.out.print(lineNumber+": ");

                int backslash = lineNumber - 1;

                while(backslash>0){
                    System.out.print(" ");
                    backslash--;
                }
                

                for(int RowNumber =1;RowNumber <= lines-lineNumber+1;RowNumber++){
                System.out.print("*");

                //System.out.print(RowNumber); İle kolon sayısı da bakılabilir.
                }
            

            System.out.println("");
                
            }
            

        /*
        
        Sağa yatık azalan
        ***
         **
          *
        
        */


System.out.println("--------------------------------");

        lines = secondaryVariable;

        int number= 1;

            for(int lineNumber = 1; lineNumber <= lines;lineNumber++){

               // System.out.print(lineNumber+": ");

                int backslash = lineNumber - 1;

                while(backslash>0){
                    System.out.print(" ");
                    backslash--;
                }
                

                for(int RowNumber =1;RowNumber <= lines-lineNumber+1;RowNumber++){
                System.out.print(number);

                number++;

                //System.out.print(RowNumber); İle kolon sayısı da bakılabilir.
                }
            

            System.out.println("");
                
            }
            

            /*
            Sağa yatık sıralı ve rakamlı sıralar.

            123
             45
              6
            */


    }


}
