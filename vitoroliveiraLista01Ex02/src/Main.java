import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;

        System.out.println("Digite o primeiro número:");
        numero1 = input.nextInt();
        System.out.println("Digite o segundo número:");
        numero2 = input.nextInt();
        System.out.println("Digite o terceiro número:");
        numero3 = input.nextInt();

        int soma = numero1 + numero2 + numero3;
        int media = soma / 3;

        System.out.println("A soma dos números é: " + soma);

        System.out.println("A média aritmética dos números é: " + media);

    }
}
