package Questao2;

public class Livro {
    private String nome;
    private String autor;
    private String ISBN;

    public Livro(String nome, String autor, String ISBN) {
        this.nome = nome;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Livro [ISBN=" + ISBN + ", autor=" + autor + ", nome=" + nome + "]";
    }

}
