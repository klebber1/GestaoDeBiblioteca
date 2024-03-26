
package ui;
import model.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Biblioteca {


    private List<Livro> lista= new ArrayList<>();
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("####--Principal Menu!--####");
            System.out.println("1- Cadastrar livro.");
            System.out.println("2- Emprestar livro.");
            System.out.println("3- Devolver livro.");
            System.out.println("4- Listar livro");
            System.out.println("5- Sair");

            opcao = Integer.parseInt(sc.nextLine());

            while (opcao < 0 || opcao > 5) {
                System.out.println("Digite uma opcao valida entre as cinco possiveis acima.");
                opcao = Integer.parseInt(sc.nextLine());
            }
            switch (opcao) {
                case 1:
                    biblioteca.execCadastrar();
                    break;
                case 2:
                    biblioteca.execEmprestar();
                    break;
                case 3:
                    biblioteca.execDevolver();
                    break;
                case 4:
                    biblioteca.execListar();
                    break;
                case 5:
                    System.out.println("\n#####-+Fim do Programa!+-#####\n");
                    break;
                default:
                    System.out.println("\n#####-+VOCE DIGITOU UMA OPCAO INVALIDA+-#####\n");

            }
        } while (opcao != 5);

    }
    public void execCadastrar() {
        Scanner sc = new Scanner(System.in);
        String titulo;
        String autor;
        System.out.println("\n####-Cadastrar Livros-####\n");
        System.out.println("Digite o Título:");
        titulo = sc.nextLine();
        System.out.println("Digite o autor:");
        autor = sc.nextLine();

        while (titulo.isEmpty() || autor.isEmpty()) {
            System.out.println("\nCampo titulo ou autor invalidos!\n");
            System.out.println("Os campos não podem estar vazios!\n");
            System.out.println("Digite o Título:");
            titulo = sc.nextLine();
            System.out.println("Digite o autor:");
            autor = sc.nextLine();

        }

        Livro livro = new Livro(autor,titulo);
        lista.add(livro);
        System.out.println("####-Livro Cadastrado!-####\n");
    }

    public void execEmprestar() {
        Scanner sc = new Scanner(System.in);
        String titulo;
        System.out.println("Digite o titulo do livro: ");
        titulo = sc.nextLine();

        while (titulo.isEmpty() ) {
            System.out.println("\nCampo titulo invalido!\n");
            System.out.println("O campo não pode estar vazio!\n");
            System.out.println("Digite o Título:");
            titulo = sc.nextLine();

        }

        for(Livro liv : lista){
            if(liv.getLivro().equals(titulo)){
                liv.emprestar();
            }
        }
        System.out.println("######-Livro emprestado!-######\n");
    }

    public void execDevolver() {
        Scanner sc = new Scanner(System.in);
        String titulo;
        System.out.println("Digite o titulo do livro: ");
        titulo = sc.nextLine();

        while (titulo.isEmpty() ) {
            System.out.println("\nCampo titulo invalido!\n");
            System.out.println("O campo não pode estar vazio!\n");
            System.out.println("Digite o Título:");
            titulo = sc.nextLine();

        }

        for(Livro liv : lista){
            if(liv.getLivro().equals(titulo)){
                liv.devolver();
            }
        }
        System.out.println("######-Livro devolvido!-######\n");
    }

    public void execListar() {
        for(Livro l : lista){
            System.out.println(l);
        }
    }

}


