import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float peso;
        float altura;

        System.out.println("Digite o seu peso (Em kg): ");
        peso = input.nextFloat();
        System.out.println("Digite a sua altura: (Em metros)");
        altura = input.nextFloat();

        System.out.println("O seu IMC é: " + peso / (altura * altura));

    }
}