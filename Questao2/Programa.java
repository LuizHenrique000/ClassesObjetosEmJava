package Questao2;

public class Programa {
    public static void main(String[] args) {
        Livro livro1 = new Livro("A revolução dos Bichos", "George Orwell", "112211");
        Livro livro2 = new Livro("1984", "George Orwell", "112211");
        Livro livro3 = new Livro("A flor da Inglaterra", "George Orwell", "123456");
        Livros lista = new Livros(livro2);
        lista.adicionarLivro(livro1);
        System.out.println(lista.quantidadeDeLivrosPorAutor("George Orwell"));
    }
}
