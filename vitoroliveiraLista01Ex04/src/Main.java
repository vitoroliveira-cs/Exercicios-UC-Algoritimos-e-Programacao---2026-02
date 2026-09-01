import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float precodoproduto;

        System.out.println("Digite o valor do produto: ");
        precodoproduto = input.nextFloat();

        System.out.println("O produto com 10% de desconto sai por: " + precodoproduto * 0.9);

    }
}