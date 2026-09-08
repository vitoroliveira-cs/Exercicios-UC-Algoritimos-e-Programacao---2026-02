import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o código do produto (1 a 40): ");
        int codigo = input.nextInt();
        System.out.println("Digite a quantidade comprada: ");
        int quantidade = input.nextInt();

        double precounitario;

        if (codigo >= 1 && codigo <= 10) {
            precounitario = 10.00;
        }
        else if (codigo >= 11 && codigo <= 20) {
            precounitario = 15.00;
        }
        else if (codigo >= 21 && codigo <= 30) {
            precounitario = 20.00;
        }
        else if (codigo >= 31 && codigo <= 40) {
            precounitario = 30.00;
        }
        else {
            System.out.println("Erro: Código do produto inválido");
        return;
        }

        double precototal  = precounitario * quantidade;
        double percentualdesconto;

        if (precototal <= 250.00) {
            percentualdesconto = 5.00;
        }
        else if (precototal <= 500.00) {
            percentualdesconto = 10.00;
        }
        else {
            percentualdesconto = 15.00;
        }

        double valordesconto = precototal * (percentualdesconto / 100.00);
        double precofinal = precototal - valordesconto;

            System.out.println("--- RESUMO DA NOTA FISCAL ---");
            System.out.println("Preço unitário do produto: R$ " + precounitario);
            System.out.println("Preço total da nota: R$ " + precototal);
            System.out.println("Valor do desconto aplicado: R$ " + valordesconto + " (" + percentualdesconto + "%)");
            System.out.println("Preço final a pagar: R$ " + precofinal);
        }
    }