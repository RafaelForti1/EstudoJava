import java.util.Scanner;

public class despesas {

    public static void main(String[] args) {

        Scanner rendaScanner = new Scanner(System.in);
        System.out.println("Qual a sua renda mensal?");
        double renda = rendaScanner.nextDouble();

        Scanner luzScanner = new Scanner(System.in);
        System.out.println("valor conta de luz?");
        double luz = luzScanner.nextDouble();

        Scanner aguaScanner = new Scanner(System.in);
        System.out.println("valor conta de agua?");
        double agua = aguaScanner.nextDouble();

        Scanner internetScanner = new Scanner(System.in);
        System.out.println("valor conta de internet?");
        double internet = aguaScanner.nextDouble();

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
