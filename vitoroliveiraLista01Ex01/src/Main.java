import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float numero;

        System.out.println("Digite um número real");
        numero = input.nextFloat();

        System.out.println("O resultado do calculo é: " + numero * 2);
    }
}