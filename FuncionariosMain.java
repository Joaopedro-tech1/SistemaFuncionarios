package empresa;

import java.util.Scanner;

public class FuncionarioMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tipo de funcionário (1 = CLT, 2 = PJ): ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // limpar o buffer

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        if (tipo == 1) {
            System.out.print("Salário base: R$");
            double salarioBase = scanner.nextDouble();

            System.out.print("Horas trabalhadas: ");
            int horas = scanner.nextInt();

            FuncionarioClt funcionario = new FuncionarioClt(nome, cpf, salarioBase, horas);
            funcionario.exibirDados();

        } else if (tipo == 2) {
            System.out.print("Horas trabalhadas: ");
            int horas = scanner.nextInt();

            System.out.print("Valor da hora: R$");
            double valorHora = scanner.nextDouble();

            FuncionarioPj funcionario = new FuncionarioPj(nome, cpf, valorHora, horas);
            funcionario.exibirDados();

        } else {
            System.out.println("Tipo inválido.");
        }

        scanner.close();
    }
}
