import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valorDoado = 0;
        double maiorValor = 0;
        double menorValor = Double.MAX_VALUE;
        double valorTotalArrecadado = 0;
        int quantDoacoes = 0;

        int continuar = 1;

        while (continuar == 1) {

            System.out.printf("Digite o valor que você que doar: R$ ");
            valorDoado = input.nextDouble();

            if (valorDoado > maiorValor) {
                maiorValor = valorDoado;
            }
            if (valorDoado < menorValor) {
                menorValor = valorDoado;
            }

            valorTotalArrecadado = valorTotalArrecadado + valorDoado;
            quantDoacoes++;

            System.out.println("Digite 1 se deseja continuar: ");
            System.out.println("1 - SIM");
            System.out.println("2 - NÂO");
            continuar = input.nextInt();
        }

        System.out.println("O maior valor arrecadado foi de: R$ " + maiorValor);
        System.out.println("O menor valor arrecadado foi de: R$ " + menorValor);
        System.out.println("O valor total arrecadado foi de: R$ " + valorTotalArrecadado);
        System.out.println("A quantidade de doações hoje foi de: " + quantDoacoes);

    }
}