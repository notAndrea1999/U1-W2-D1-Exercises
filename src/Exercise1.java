import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
        int[] myArr = new int[5];
        Random rndm = new Random();

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = rndm.nextInt(1, 10);
        }
//        System.out.println(Arrays.toString(myArr));


    }
}