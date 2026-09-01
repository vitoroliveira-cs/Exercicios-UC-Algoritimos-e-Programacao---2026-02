import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float salario;
        float porcetagem;


        System.out.println("Digite o seu salário atual: ");
        salario = input.nextFloat();
        System.out.println("Digite a porcentagem do seu aumento: ");
        porcetagem = input.nextFloat();

        float aumentoinicial = salario * (porcetagem / 100);

        System.out.println("O valor em reais do aumento concedido é: " + aumentoinicial);

        float aumentofinal = salario + aumentoinicial;

        System.out.println("O novo salário final após o reajuste é de: " + aumentofinal);


    }
}