import java.util.Scanner;

public class SistemaCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Cadastrar Gerente");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do funcionário: ");
                    String nomeFunc = scanner.nextLine();
                    System.out.print("Digite o salário do funcionário: ");
                    double salarioFunc = scanner.nextDouble();

                    Funcionario func = new Funcionario(nomeFunc, salarioFunc);
                    System.out.println("\nDados do Funcionário:");
                    System.out.println(func.exibirDados());

                    System.out.print("\nDeseja calcular bônus com percentual extra? (s/n): ");
                    char resposta = scanner.next().charAt(0);
                    if (resposta == 's' || resposta == 'S') {
                        System.out.print("Digite o percentual extra: ");
                        double extra = scanner.nextDouble();
                        System.out.println("Bônus com extra: R$" + func.calcularBonus(extra));
                    }
                    break;

                case 2:
                    System.out.print("Digite o nome do gerente: ");
                    String nomeGer = scanner.nextLine();
                    System.out.print("Digite o salário do gerente: ");
                    double salarioGer = scanner.nextDouble();
                    System.out.print("Digite o bônus extra do gerente: ");
                    double bonusExtra = scanner.nextDouble();

                    Gerente ger = new Gerente(nomeGer, salarioGer, bonusExtra);
                    System.out.println("\nDados do Gerente:");
                    System.out.println(ger.exibirDados());
                    break;

                case 3:
                    System.out.println("Saindo do sistema. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 3);

        scanner.close();
    }
}
