package br.edu.up.restaurante;
import java.util.*;
class Cardapio{
    private Map<String, String> itens = new HashMap<>();
    public void adicionarItem(String nome, String valor){
        itens.put(nome, valor);
    }
    public void removerItem(String nome){
        itens.remove(nome);
    }
    public void listarItens(){
        for (Map.Entry <String, String> entry : itens.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + "\nValor: " + entry.getValue() + "\n");
        }
    }
    public void listarItensOrdenados(){
        TreeMap<String, String> sorted = new TreeMap<>(itens);
        for (Map.Entry<String, String> entry : sorted.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + "\nValor: " + entry.getValue() + "\n");
        }
    }
    public String getValor(String valor){
        return itens.get(valor);
    }
}