import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número: ");
        numero = input.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.printf("%d x %d = %d\n" , numero, i, numero * i);
        }
    }
}