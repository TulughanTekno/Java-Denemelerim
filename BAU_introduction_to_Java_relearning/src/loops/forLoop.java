public class forLoop {

    public static void main(String[] args) {
        
        //1 : Döngü içerisinde kullanacağımız değişkeni oluşturuyoruz.
        //2 : Koşul'umuzu yazıyoruz.
        //3 : Döngü tamamlandıktan sonra uygulanacak kuralı yazıyoruz.
        


        System.out.println("-i-");

        for (int i = 0; i <= 10 ; i++){
            //   #1   ;  #2     ; #3
            
            System.out.println("i");

        }


        System.out.println("-j-");

        for (int j = 5 ; j > 1 ; j--){

            System.out.println(j);

        }


        System.out.println("-A-");

        for (int a=0 ; true ; a++){
            if( a ==5){continue;} // Kalan satırları atlayıp döngüyü kaldığı yerden yeniden başlatır. 
            if(a==8){break;} // Koşul fark etmeksizin döngüden çıkar.
            System.out.println(a);

            
        }


    }



}
