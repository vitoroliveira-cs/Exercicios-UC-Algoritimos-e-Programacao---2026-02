import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valorA;
        int valorB;

        System.out.println("Digite o valor de A: ");
        valorA = input.nextInt();
        System.out.println("Digite o valor de B: ");
        valorB = input.nextInt();

        System.out.println("O valor de A é: " + valorB);
        System.out.println("O valor de B é: " + valorA);

    }
}