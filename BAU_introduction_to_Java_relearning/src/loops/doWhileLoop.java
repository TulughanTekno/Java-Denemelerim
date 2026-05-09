public class doWhileLoop {

    public static void main(String[] args) {
        
        int counter = 16;

        do { 
            
            System.out.println(counter);
            counter++; // counter+=1; olarak da yazılabilir.

        } while (counter==16);

        //Counter 17 oldu.


        do { 
            
            System.out.println(counter);
            counter++;

        } while (counter==20);//Hatalı olması lazım, değil mi?

        //Do While önce 1 döngü döndürür, sonra kontrol eder!

        do { 
            
            System.out.println("Bu Do While döngüsü.");

        } while (false);



        while(counter==0) { //Hiçbir koşulda çalışmayacağı için hata veriyor. (İlk denemede false koydum, izin vermedi bile)
            System.out.println("Bu While döngüsü.");  //Ölü Kod
        }
    }

}
