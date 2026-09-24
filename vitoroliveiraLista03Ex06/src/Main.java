import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int senhapre = 2026;
        int senha;
        int tentativas = 0;


        System.out.println("Digite uma senha inteira de 4 dígitos: ");
        senha = input.nextInt();
        tentativas++;

        while (senha != senhapre) {
            System.out.println("Senha Incorreta! Tente novamente");
            System.out.println("Digite uma senha: ");
            senha = input.nextInt();
            tentativas++;
        }

        System.out.println("Acesso autorizado!");
        System.out.println("Total de tentativas realizadas: " + tentativas);

    }
}