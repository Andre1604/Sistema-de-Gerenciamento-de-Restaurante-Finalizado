package br.edu.up.restaurante;

import java.util.*;

class Funcionario {
    private String nome;
    public Funcionario(String nome) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do funcionário: ");
        nome = scanner.nextLine();
        this.nome = nome;
    }
    public String getFuncionario() {
        return this.nome;
    }
}

