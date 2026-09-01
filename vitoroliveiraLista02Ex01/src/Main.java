import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int idade;

        System.out.println("Digite a sua idade: ");
        idade = input.nextInt();


        if (idade <= 12) {
            System.out.println("Esse nadador é da categoria Infantil");
        }
        else if (idade <= 17) {
            System.out.println("Esse nadador é da categoria Juvenil");
        }
        else {
            System.out.println("Esse nadador é da categoria Adulto");
        }

    }
}