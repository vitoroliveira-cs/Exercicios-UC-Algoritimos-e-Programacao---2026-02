import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double rendamensal;
        double prestacaomensal;

        System.out.println("Informe o valor da renda mensal: R$ ");
        rendamensal = input.nextDouble();
        System.out.println("Informe o valor da prestação desejada: R$ ");
        prestacaomensal = input.nextDouble();

        double limiteseguro = rendamensal * 0.30;

        if (prestacaomensal > 3000.00 && rendamensal < 1000.00) {
            System.out.println("Financiamento negado por baixa renda");
        }
        else if (prestacaomensal > limiteseguro) {
            System.out.println("Financiamento negado por alta prestação");
        }
        else {
            System.out.println("Financiamento aprovado");
        }

    }
}