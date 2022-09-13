import java.util.Scanner;

public class imc {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a sua massa?");
        double massa = sc.nextDouble();

        System.out.println("Qual a sua altura?");
        double altura = sc.nextDouble();

        double imc;
        imc = massa / (altura * altura);
        System.out.println("O seu IMC é:" + imc + ".");

        if (imc < 18.5) {
			System.out.println("Seu indice é: Magreza");
		} else if (imc >= 18.5 && imc < 24.9) {
			System.out.println("Seu indice é: Normal");
		} else if (imc >= 24.9 && imc < 30) {
			System.out.println("Seu indice é: Sobrepeso");
		} else {
			System.out.println("Seu indice é: Obesidade");
		}
    }
}