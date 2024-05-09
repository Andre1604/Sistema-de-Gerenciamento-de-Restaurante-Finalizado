package br.edu.up.restaurante;

import java.util.Scanner;

class Cliente {
    private String nome;
    public Cliente(String nome) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do cliente: ");
        nome = scanner.nextLine();
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
}
