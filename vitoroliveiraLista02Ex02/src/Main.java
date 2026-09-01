import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int consumidos;

        System.out.println("Informe quantos kWh foram consumidos esse mês: ");
        consumidos = input.nextInt();

        if (consumidos <= 100) {
            System.out.println("O valor da sua conta de energia elétrica é: R$ " + consumidos * 0.50);
        }
        else if (consumidos <= 200) {
            System.out.println("O valor da sua conta de energia elétrica é: R$ " + consumidos * 0.70);
        }
        else {
            System.out.println("O valor da sua conta de energia elétrica é: R$ " + consumidos * 0.90);
        }

    }
}