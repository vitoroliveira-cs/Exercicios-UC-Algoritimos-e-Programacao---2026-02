import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float numero;

        System.out.println("Digite um número real: ");
        numero = input.nextFloat();

        System.out.println("O resultado dessa conta é: " + numero*2);
    }
}