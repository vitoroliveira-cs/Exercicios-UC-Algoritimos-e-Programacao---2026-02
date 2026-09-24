import java.util.Scanner;

public class mainJardel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String senha = "0";
        String senhapre = "2026";
        int tentaivas = 0;


        while (senhapre != senha) {
            System.out.print("Digite a senha: ");
            senha = input.nextLine();
            tentaivas++;
            if (senhapre != senha) {
                System.out.println("Senha incorreta. Digite novamente!");
            }
            else {
                System.out.println("Acesso autorizado!");
                System.out.println("Tentativas realizadas =" + tentaivas);
            }
        }

        //if (senha == senhapre) {
        //    System.out.println("Acesso autorizado!");
        //}
        //else {
        //    System.out.println("Senha incorreta! Tente novamente!");
        //}


    }
}
