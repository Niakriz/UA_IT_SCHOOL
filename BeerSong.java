/**
 * Created by user on 24.10.2015.
 */
public class BeerSong {
    public static void main (String[] args){
       int beerNum = 99;
        String word = "бутылок (бутылка)";

        while (beerNum > 0){
            if (beerNum == 1){
                word = "бутылка ";
            }
            System.out.println(beerNum + " " + word +  " пива на стене");
            System.out.println(" ");
            System.out.println(beerNum + " " + word +  " пива");
            System.out.println(" ");
            System.out.println(beerNum + " " + word +  " возьми одну");
            System.out.println(" ");
            System.out.println(beerNum + " " + word +  " пусти по кругу");
            System.out.println(" ");

            beerNum = beerNum - 1;
            if (beerNum > 0) {

                System.out.println(beerNum + " " + word + "пива на стене");
            }else {
                System.out.println("Нет больше бутылок пива на стене !");

            }

        }

    }

}
