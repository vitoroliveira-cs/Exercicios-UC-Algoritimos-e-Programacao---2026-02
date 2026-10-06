import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double salario = 0.0;
        double quantidadeSalario = 0;
        double totalSalario = 0.0;

        double pessoasAteSalarioMinimo = 0;
        double maiorSalario = 0;

        int filhos = 0;
        double quantidadeFilhos = 0;
        double totalFilhos = 0;

        int continuar = 1;


        while (continuar == 1) {
            System.out.printf("Digite o seu salário: R$ ");
            salario = input.nextDouble();
            System.out.printf("Digite quantos filhos você tem: ");
            filhos = input.nextInt();
            System.out.println("Digite 1 para continuar ou 2 para Sair");
            continuar = input.nextInt();

            if (salario >= 1) {
                quantidadeSalario++;
                totalSalario+=salario;
                if (salario <= 1600) {
                    pessoasAteSalarioMinimo++;
                }
            }
            if (filhos >= 1) {
                quantidadeFilhos++;
                totalFilhos+=filhos;
            }
            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

        }


        if (quantidadeSalario >= 1) {
            double media = totalSalario / quantidadeSalario;
            System.out.println("A média de salário da população é: R$ " + media);
        }else {
            System.out.println("Nenhum dado foi digitado");
        }
        if (quantidadeFilhos >= 1) {
            double media = totalFilhos / quantidadeFilhos;
            System.out.println("A média de filhos da população é: " + media);
        }else {
            System.out.println("Nenhum dado foi digitado");
        }
        if (pessoasAteSalarioMinimo >= 1) {
            double media = pessoasAteSalarioMinimo / quantidadeSalario * 100;
            System.out.println("O percentual de pessoas que recebem salario minimo é: " + media);
        }
        System.out.println("O maior salário da cidade é: " + maiorSalario);

    }
}