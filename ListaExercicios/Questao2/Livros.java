package Questao2;

import java.util.ArrayList;
import java.util.List;

public class Livros {
    private List<Livro> biblioteca = new ArrayList<>();

    public Livros(Livro livro) {
        adicionarLivro(livro);
    }

    public void adicionarLivro(Livro livro) {
        for (Livro elemento : biblioteca) {
            if (elemento.getISBN().equals(livro)) {
                System.out.println("Já existe um livro com esse ISBN");
                return;
            }
        }
        biblioteca.add(livro);
    }

    public int quantidadeDeLivrosPorAutor(String nomeAutor) {
        int contador = 0;
        for (Livro elemento : biblioteca) {
            if (elemento.getAutor().equals(nomeAutor)) {
                contador++;
            }
        }
        return contador;
    }

    public List<Livro> filtrarLivrosPorAutor(String nomeAutor) {
        List<Livro> listaFiltrada = new ArrayList<>();
        for (Livro elemento : biblioteca) {
            if (elemento.getAutor().equals(nomeAutor)) {
                listaFiltrada.add(elemento);
            }
        }
        return listaFiltrada;
    }
}
