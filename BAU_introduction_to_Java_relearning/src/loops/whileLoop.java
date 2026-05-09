public class whileLoop {

    public static void main(String[] args) {
        
        int counter = 10;

        while (counter <= 25){ //

            System.out.println(counter);

            counter+=5; // Counter değişkenine 5 ekler

        }

        System.out.println("Döngü 1");

        while (counter >= 35.5){ //Çalışmayan döngü

            System.out.println(counter);

            counter+=5; // Counter değişkenine 5 ekler


        }

        System.out.println("Döngü 2");

//UYARI: Bu döngü unutulduğu zaman sistem kaynaklarını (özellikle RAM) boşa harcar
        while (counter > 06) { //Sürekli çalışacak olan döngü


            System.out.println(counter);

            counter++;

        }
        
        System.out.println("Döngü 3");//While'dan çıkılamacağı için ASLA çalışmayacak, Ölü Kod.


    }


}
