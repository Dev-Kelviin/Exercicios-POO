import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        List<Conta> contas = new ArrayList<>();  // Lista para armazenar múltiplas contas
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Criar Conta");
            System.out.println("2. Abrir Conta");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Pagar Mensalidade");
            System.out.println("6. Fechar Conta");
            System.out.println("7. Consultar Saldo");
            System.out.println("8. Listar Contas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    // Criando uma nova conta
                    System.out.print("Digite o número da conta: ");
                    String numConta = scanner.nextLine();
                    
                    System.out.print("Digite o tipo da conta (CC - Conta Corrente ou CP - Conta Poupança): ");
                    String tipo = scanner.nextLine();
                    
                    System.out.print("Digite o nome do dono da conta: ");
                    String dono = scanner.nextLine();

                    Conta novaConta = new Conta(numConta, tipo, dono); // Criar uma nova conta
                    contas.add(novaConta);  // Adicionar a conta à lista de contas
                    System.out.println("Conta criada com sucesso!");

                    break;

                case 2:
                    // Abrir uma conta
                    Conta contaAbrir = escolherConta(contas, scanner);
                    if (contaAbrir != null) {
                        contaAbrir.abrirConta();
                    }
                    break;

                case 3:
                    // Depositar
                    Conta contaDeposito = escolherConta(contas, scanner);
                    if (contaDeposito != null && contaDeposito.isStatus()) {
                        System.out.print("Digite o valor a ser depositado: ");
                        float valorDeposito = scanner.nextFloat();
                        contaDeposito.depositar(valorDeposito);
                    }
                    break;

                case 4:
                    // Sacar
                    Conta contaSaque = escolherConta(contas, scanner);
                    if (contaSaque != null && contaSaque.isStatus()) {
                        System.out.print("Digite o valor a ser sacado: ");
                        float valorSaque = scanner.nextFloat();
                        contaSaque.sacar(valorSaque);
                    }
                    break;

                case 5:
                    // Pagar mensalidade
                    Conta contaMensalidade = escolherConta(contas, scanner);
                    if (contaMensalidade != null && contaMensalidade.isStatus()) {
                        contaMensalidade.pagarMensal();
                        System.out.println("Mensalidade paga!");
                    }
                    break;

                case 6:
                    // Fechar conta
                    Conta contaFechar = escolherConta(contas, scanner);
                    if (contaFechar != null) {
                        contaFechar.fecharConta();
                    }
                    break;

                case 7:
                    // Consultar saldo
                    Conta contaSaldo = escolherConta(contas, scanner);
                    if (contaSaldo != null) {
                        contaSaldo.saldo();
                    }
                    break;

                case 8:
                    // Listar todas as contas
                    listarContas(contas);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }

    // Método para escolher uma conta a partir do número da conta
    private static Conta escolherConta(List<Conta> contas, Scanner scanner) {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta disponível.");
            return null;
        }

        listarContas(contas);
        System.out.print("Digite o número da conta: ");
        String numConta = scanner.nextLine();

        for (Conta conta : contas) {
            if (conta.getNumeConta().equals(numConta)) {
                return conta;
            }
        }

        System.out.println("Conta não encontrada.");
        return null;
    }

    // Método para listar todas as contas disponíveis
    private static void listarContas(List<Conta> contas) {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta disponível.");
        } else {
            System.out.println("Contas disponíveis:");
            for (Conta conta : contas) {
                System.out.println("Número: " + conta.getNumeConta() + ", Tipo: " + conta.getTipoDaConta() + ", Dono: " + conta.getDono() + ", Status: " + (conta.isStatus() ? "Aberta" : "Fechada") + ", Saldo: " + conta.getSaldo());
            }
        }
    }
}
