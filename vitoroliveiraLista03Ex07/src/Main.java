import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double nota = 999;
        int notasvalidas = 0;
        double soma = 0.0;


        while (nota >= 0) {
            System.out.println("Digite uma nota: ");
            nota = input.nextDouble();

            if (nota >= 0 ) {
                notasvalidas++;
                soma+=nota;
            }
        }

        if (notasvalidas > 0) {
            double media = soma / notasvalidas;
            System.out.println("A quantidade de notas validas é: " + notasvalidas);
            System.out.printf("A média aritmética simples dessas notas é: %.2f", media);
        }else {
            System.out.println("Nenhuma nota válida foi digitada");
        }

    }
}