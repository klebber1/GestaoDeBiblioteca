package model;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String autor, String titulo) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public void emprestar() {
        if (disponivel == true){
            disponivel = false;
        }else {
            System.out.println("O livro ja esta emprestado!");
        }

    }
    public void devolver () {
        if (disponivel == false){
            disponivel = true;
        }else {
            System.out.println("O livro ja esta em preteleira!");
        }
    }
    public String getLivro() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Titulo do livro: " + titulo + "\n" + "Autor: " + autor + "\n" + "disponivel: " + disponivel + "\n";
    }
}
