import java.util.Scanner;

public class despesas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a sua renda mensal?");
        double renda = sc.nextDouble();

        System.out.println("valor conta de luz?");
        double luz = sc.nextDouble();

        System.out.println("valor conta de agua?");
        double agua = sc.nextDouble();

        System.out.println("valor conta de internet?");
        double internet = sc.nextDouble();

        double despesa = luz + agua + internet;
        System.out.println("voce gastou: " + despesa);

        double divida = despesa - renda;

        if (despesa > renda) {
            System.out.println("esta devendo: " + divida);
        } else {
            System.out.println("deu bom");
        }

}
    
}
