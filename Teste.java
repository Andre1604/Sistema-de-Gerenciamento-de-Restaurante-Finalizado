package br.edu.up.restaurante;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String padrao = "###.00";
        DecimalFormat df = new DecimalFormat(padrao);
        int escolha = 10;
        String nome;

        Cardapio cardapio = new Cardapio();
        cardapio.adicionarItem("X-bacon",  25.90);
        cardapio.adicionarItem("X-salada", 23.90);
        cardapio.adicionarItem("X-burger", 19.90);

        while (escolha != 0){

            System.out.println("\n _________________________________\n| MENU:                           |\n| 0 - Encerrar Programa           |\n| 1 - Adicionar Item ao Cardápio  |" +
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

                    cardapio.adicionarItem(nome, Double.valueOf(valor));
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
                    int escolha1 = 10;
                    Funcionario funcionario = new Funcionario("Nome");
                    Cliente cliente = new Cliente("Nome");
                    Pedido pedido = new Pedido();
                    while (escolha1 != 2) {
                        System.out.println("\n1 - Fazer novo pedido\n2 - Encerrar pedido");
                        escolha1 = scanner.nextInt();
                        switch (escolha1) {

                            case 1:
                                pedido.novoPedido();
                                System.out.println("Cliente: " + cliente.getNome() + ", Atendente: " + funcionario.getFuncionario());
                                System.out.printf("Pedido: " + pedido.getItem() + ", Valor: R$%.2f" , cardapio.valor(pedido.getItem()));

                                FileManager.salvarDados("Pedido: " + pedido.getItem() + ", Valor: R$" + df.format(cardapio.valor1()) + " , Cliente: " + cliente.getNome() + ", Atendente: " + funcionario.getFuncionario(), "dados.txt");
                                continue;

                            case 2:
                                System.out.printf("Valor Total: R$%.2f" , cardapio.valorTotal());
                                FileManager.salvarDados("Valor Total: R$" + df.format(cardapio.valorTotal()) + "\n", "dados.txt");
                                cardapio.encerrarSoma();

                        }
                    }
            }
        }
    }
}
