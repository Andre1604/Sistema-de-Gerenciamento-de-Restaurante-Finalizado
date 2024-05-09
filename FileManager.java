package br.edu.up.restaurante;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class FileManager {
    public static void salvarDados(String dados, String arquivo) {
        try {
            PrintWriter out = new PrintWriter(new FileWriter(arquivo, true));
            out.println(dados);
            out.close();
        }
        catch (IOException e) {
            System.out.println("Erro ao salvar dados: " + e.getMessage());
        }
    }
}
