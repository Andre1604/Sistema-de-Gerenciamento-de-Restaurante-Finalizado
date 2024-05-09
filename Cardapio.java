package br.edu.up.restaurante;
import java.util.*;
class Cardapio{
    private Map<String, Double> itens = new HashMap<>();
    private double soma = 0;
    private double valor1;
    public void adicionarItem(String nome, Double valor){
        itens.put(nome, valor);
    }
    public void removerItem(String nome){
        itens.remove(nome);
    }
    public void listarItens(){
        for (Map.Entry <String, Double> entry : itens.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + "\nValor: " + entry.getValue() + "\n");
        }
    }
    public void listarItensOrdenados(){
        TreeMap<String, Double> sorted = new TreeMap<>(itens);
        for (Map.Entry<String, Double> entry : sorted.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + "\nValor: " + entry.getValue() + "\n");
        }
    }
    public Double valor(String valor){
        valor1 = itens.get(valor);
        soma = soma + valor1;
        return itens.get(valor);
    }
    public Double valorTotal(){
        return soma;
    }
    public Double valor1(){
        return valor1;
    }
    public Double encerrarSoma(){
        soma = 0;
        valor1 = 0;
        return null;
    }
}