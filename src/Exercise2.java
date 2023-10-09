import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Inserisci i km percorsi dalla tua macchina");
                int km = Integer.parseInt(userInput.nextLine());
                if (km < 0) throw new ArithmeticException("Non sono ammessi valori minori di 0");

                System.out.println("Inserisic i litri di carburante consumato dalla tua macchina");
                int lt = Integer.parseInt(userInput.nextLine());
                if (lt == 0 || lt < 0)
                    throw new ArithmeticException("Attenzione non sono ammessi valori uguali o minori di 0");

                System.out.println("I km/litro della tua macchina sono: " + (km / lt) + " km/litro");
                break;

            } catch (ArithmeticException ex) {
                System.err.println(ex);

            }

        }
        userInput.close();
    }

}


