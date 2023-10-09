import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int[] myArr = new int[5];
        Random rndm = new Random();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = rndm.nextInt(1, 10);
        }
        System.out.println((Arrays.toString(myArr)));

        sostituzioneArray:
        while (true) {
            System.out.println("Scegli un numero da mettere nell'array, quando ti sei stancato premi 0");
            try {
                System.out.println("Che posizione vuoi modificare");
                int posizione = Integer.parseInt(input.nextLine()) - 1;
                if (posizione < 0 || posizione >= 5) throw new Exception("Hai superato la grandezza dell'array");
                System.out.println("Scegli il numero che sostituira quello precendete");
                int number = Integer.parseInt(input.nextLine());
                if (number == 0) {
                    break sostituzioneArray;
                } else {
                    myArr[posizione] = number;
                }

            } catch (Exception ex) {
                System.err.println(ex);

            } finally {
                System.out.println(Arrays.toString(myArr));
            }
        }











        /*
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = rndm.nextInt(1, 10);
        }
        System.out.println(Arrays.toString(myArr));

        sostituzioneArray:
        while (true) {
            for (int i = 0; i < myArr.length; i++) {
                try {
                    System.out.println("Scegli un numero da mettere nell'array, quando ti sei stancato premi 0");
                    int number = Integer.parseInt(input.nextLine());
                    if (number == 0) {
                        break sostituzioneArray;
                    } else {
                        myArr[i] = number;
                    }

                } catch (NumberFormatException ex) {
                    System.err.println(ex);
                    System.err.println("Errore nell'inserimento dei numeri, sono ammessi solo numeri interi non lettere!");
                    i--;
                } finally {
                    System.out.println(Arrays.toString(myArr));
                }
            }
        }
        */


    }


}