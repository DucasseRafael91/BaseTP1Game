package baseTP1Game;

import java.util.Scanner;
import java.util.Random;

public class BaseTP1Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Souhaitez-vous jouer au jeu ? (oui/non)");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("non")) {
            System.out.println("D'accord, au revoir !");
        } else {
            int misteryNumber = random.nextInt(100) + 1; 
            int attempt = 0;
            int count = 0;

            System.out.println("Nombre choisi");

            while (attempt != misteryNumber) {
                System.out.print("Entrez un nombre : ");
                attempt = scanner.nextInt();
                count++;

                if (attempt < misteryNumber) {
                    System.out.println("C'est plus !");
                } else if (attempt > misteryNumber) {
                    System.out.println("C'est moins !");
                } else {
                    System.out.println("Bravo ! Vous avez trouvé le nombre en " + count + " coups !");
                }
            }
        }

        scanner.close();
    }
}
