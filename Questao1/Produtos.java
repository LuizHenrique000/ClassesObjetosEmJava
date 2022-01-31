package Questao1;

import java.util.ArrayList;
import java.util.List;

public class Produtos {
    private List<Produto> produtos = new ArrayList<>();

    public Produtos(Produto produto) {
        adicionarProduto(produto);
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public int filtrarProdutosPorQuantidade(String nomeProduto) {
        int contador = 0;
        for (Produto elemento : produtos) {
            if (elemento.getNome().equals(nomeProduto)) {
                contador++;
            }
        }
        return contador;
    }

    public List<Produto> filtrarPorNome(String nomeProduto) {
        List<Produto> listaFiltrada = new ArrayList<>();
        for (Produto elemento : produtos) {
            if (elemento.getNome().equals(nomeProduto)) {
                listaFiltrada.add(elemento);
            }
        }
        return listaFiltrada;
    }
}
