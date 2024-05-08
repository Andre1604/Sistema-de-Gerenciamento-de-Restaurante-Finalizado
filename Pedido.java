package br.edu.up.restaurante;
import java.util.Scanner;

class Pedido {
    private String item;

    public Pedido(String item){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pedido: ");
        item = scanner.nextLine();
        this.item = item;
    }
    public String getItem(){
        return item;
    }
}