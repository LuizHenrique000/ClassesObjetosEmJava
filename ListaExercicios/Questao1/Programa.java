package Questao1;

public class Programa {
    public static void main(String[] args) {
        Produto produto = new Produto("Sabao", "Lavar as coisas", 5);
        Produto produto2 = new Produto("Amaciante", "Lavar as coisas", 10);
        Produto produto3 = new Produto("Detergente", "Lavar as coisas", 15);
        Produtos lista = new Produtos(produto);
        lista.adicionarProduto(produto2);
        lista.adicionarProduto(produto3);
        lista.adicionarProduto(produto3);
        System.out.println(lista.filtrarProdutosPorQuantidade("Detergente"));
        System.out.println(lista.filtrarPorNome("Detergente"));
    }
}
