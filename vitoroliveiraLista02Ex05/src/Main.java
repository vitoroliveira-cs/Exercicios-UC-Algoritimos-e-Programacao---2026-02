import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();

        System.out.println("Para qual unidade deseja converter: ");
        System.out.println("1 - Fahrenheit");
        System.out.println("2 - Kelvin");
        int opcao = input.nextInt();


        if (opcao == 1) {
            double fahrenheit = (celsius * 1.8) + 32;
            System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        }
        else if (opcao == 2) {
                double kelvin = celsius + 273.15;
                System.out.println("A temperatura em Kelvin é: " + kelvin);
        }
        else {
            System.out.println("Opção inválida. Digite apenas 1 ou 2.");
        }
    }
}