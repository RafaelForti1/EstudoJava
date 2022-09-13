import java.util.Scanner;

public class Multas {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("quanto pontos você tomou?");
        double valor = sc.nextDouble();

        double pontos = valor;

        if (pontos == 3) {
            System.out.println("Infraçao Leve  R$ 88,38 de multa, 3 pontos na CNH");
        } else if (pontos == 4) {
            System.out.println("Infraçao Média  R$ 130,16 de multa, 4 pontos na CNH");
        } else if (pontos == 5) {
            System.out.println("Infraçao Grave  R$ 195,23 de multa, 5 pontos na CNH");
        } else if (pontos == 7) {
            System.out.println("Infraçao Gravíssima  R$ 293,47, 7 pontos na CNH");
        }


        if (pontos > 7 || pontos < 3 || pontos == 6) {
            System.out.println("pontuaçao invalida");
        }
    }
}
