package br.edu.up.restaurante;
import java.util.Scanner;


class Pedido {
    private String item;
    Scanner scanner = new Scanner(System.in);
    public String novoPedido(){
        System.out.println("Pedido: ");
        item = scanner.nextLine();
        return item;
    }
    public String getItem(){
        return item;
    }
}