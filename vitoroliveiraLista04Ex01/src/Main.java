import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero = 0;
        long resultado = 1;

        System.out.printf("Digite um número: ");
        numero = input.nextInt();

        for (int i = numero; i >= 1; i--) {
            resultado = resultado * i;
        }

        System.out.println("O fatorial do número " + numero + " é " + resultado);

    }
}