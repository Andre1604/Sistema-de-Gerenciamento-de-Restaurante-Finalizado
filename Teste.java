package br.edu.up.restaurante;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int escolha = 10;
        String nome;

        // Criando cardápio
        Cardapio cardapio = new Cardapio();
        cardapio.adicionarItem("X-bacon", "R$ 27,90");
        cardapio.adicionarItem("X-salada", "R$ 23,90");
        cardapio.adicionarItem("X-burguer", "R$ 19,90");

        while (escolha != 0){

            System.out.println(" _________________________________\n| MENU:                           |\n| 0 - Encerrar Programa           |\n| 1 - Adicionar Item ao Cardápio  |" +
                               "\n| 2 - Remover Item do Cardápio    |\n| 3 - Listar Cardápio             |\n| 4 - Listar Cardápio Ordenado    |\n| 5 - Novo Pedido                 " +
                               "|\n _________________________________");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome do item: ");
                    scanner.nextLine();
                    nome = scanner.nextLine();

                    System.out.println("Digite o valor do item: ");
                    String valor = scanner.nextLine();

                    cardapio.adicionarItem(nome, valor);

                    continue;
                case 2:
                    System.out.println("Digite o nome do item: ");
                    scanner.nextLine();
                    nome = scanner.nextLine();
                    cardapio.removerItem(nome);

                    continue;
                case 3:
                    cardapio.listarItens();

                    continue;
                case 4:
                    cardapio.listarItensOrdenados();

                    continue;
                case 5:
                    // Criando funcionários
                    Funcionario funcionario = new Funcionario("Nome");
                    // Criando um cliente
                    Cliente cliente = new Cliente("Nome");
                    // Criando um pedido
                    Pedido pedido = new Pedido("Item");
                    // Verificando o pedido
                    System.out.println("Pedido: " + pedido.getItem() + ", Valor: " + cardapio.getValor(pedido.getItem()) + ", Cliente: " + cliente.getNome() + ", Funcionário: " + funcionario.getFuncionario());
                    // Salvando os dados em um arquivo
                    FileManager.salvarDados("Pedido: " + pedido.getItem() + ", Valor: " + cardapio.getValor(pedido.getItem()) + ", Cliente: " + cliente.getNome() + ", Funcionário: " + funcionario.getFuncionario(), "dados.txt");
            }
        }
    }
}
