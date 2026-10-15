package BibliotecaRocket;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Cadastro {
    private Autor ponteiroAutor;
    private Emprestimo ponteiroEmprestimo;
    private Biblioteca ponteiroBiblioteca;
    private Scanner scanner = new Scanner(System.in);
    private Autor cadAutor = null;

    public Cadastro(Emprestimo emprestimo,Biblioteca biblioteca){
        this.ponteiroEmprestimo = emprestimo;
        this.ponteiroBiblioteca = biblioteca;
    }

    public void cadastrarAutores(){
        System.out.println("digite o nome do autor");
        String cadNomeAutor = scanner.nextLine();
        System.out.println("digite a data de nascimento do autor");
        String cadDataNascimentoAutor = scanner.nextLine();

        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate cadDataNascimentoAutorFormat = LocalDate.parse(cadDataNascimentoAutor,formatacao);
        Autor cadNovoAutor = new Autor(cadNomeAutor,cadDataNascimentoAutorFormat);
        ponteiroBiblioteca.adicionarAutores(cadNovoAutor);
        System.out.println("Autor cadastrado com sucesso!");
        ponteiroBiblioteca.imprimirAutores();
    }

    public void cadastrarLivros(){
        System.out.println("digite o titulo do livro");
        String cadTituloDoLivro = scanner.nextLine();
        System.out.println("digite a data de cadastro do livro");
        String cadData = scanner.nextLine();
        System.out.println("digite o nome do autor do livro");
        String cadNomeAutor = scanner.nextLine();

        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate cadDataDoLivro = LocalDate.parse(cadData,formatacao);

        for(Autor i : ponteiroBiblioteca.getAutores()){
            if(cadNomeAutor.equalsIgnoreCase(i.getNome())){
                cadAutor = i;
                break;
            }
        }

        if(cadAutor != null){
            Livro cadNovoLivro = new Livro(cadAutor,cadTituloDoLivro,true,cadDataDoLivro);
            ponteiroBiblioteca.adicionarLivros(cadNovoLivro);
            System.out.println("Livro cadastrado com sucesso");
            ponteiroBiblioteca.imprimirLivros();
        }
        else{
            System.out.println("Autor não encontrado");
        }
    }
}
