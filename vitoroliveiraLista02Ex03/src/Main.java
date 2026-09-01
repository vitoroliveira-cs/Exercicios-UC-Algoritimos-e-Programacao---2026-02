import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero: ");
        numero = input.nextInt();

        if (numero  %2==0) {
            System.out.println("Esse número é par e o quadrado do seu valor é: " + numero * numero);
        }
        else {
            System.out.println("Esse numero é ímpare o cubo do seu valor é: " + numero * numero * numero);
        }



    }
}