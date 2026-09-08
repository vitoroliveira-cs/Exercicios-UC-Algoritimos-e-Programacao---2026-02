import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1;
        int n2;
        int n3;

        System.out.println("Digite o primeiro número: ");
        n1 = input. nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = input. nextInt();

        System.out.println("Digite o terceiro número: ");
        n3 = input. nextInt();

        if ( n1 >= n2 && n1 >= n3) {
            System.out.println("O maior número digitado foi: " + n1);
        }
        else if (n2 >= n1 && n2 >= n3) {
            System.out.println("O maior número digitado foi: " + n2);
        }
        else {
            System.out.println("O maior número digitado foi " + n3);
        }
    }
}