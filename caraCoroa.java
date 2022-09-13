import java.util.Scanner;
import java.util.Random;

public class caraCoroa {
    public static void main(String [] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha '0' para cara e '1' para coroa");
        double caraCoroa = sc.nextDouble();

        
        int numeroAleatorio = random.nextInt(2);
        if (numeroAleatorio == caraCoroa) {
            System.out.println("voce ganhou");
        } else {
            System.out.println("voce perdeu");
        }
    }
}
