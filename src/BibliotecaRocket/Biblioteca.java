package BibliotecaRocket;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca{
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void setLivros(List<Livro> livros){this.livros = livros;}

    public List <Livro> getLivros(){return this.livros;}


    public Biblioteca(){
        montarAutores();
        montarLivros();
    }

    public void montarAutores(){
        Autor autor1 = new Autor("kleber", LocalDate.of(2005,05,15));
        Autor autor2 = new Autor("malfoy", LocalDate.of(2003,02,07));
        Autor autor3 = new Autor("lucia", LocalDate.of(2008,10,15));
        autores.add(autor1);
        autores.add(autor2);
        autores.add(autor3);
    }

    public void montarLivros(){
        Livro livro1 = new Livro(autores.get(0),"a vingança",true,LocalDate.of(2015,05,15));
        Livro livro2 = new Livro(autores.get(1),"desespero dos inocentes",true,LocalDate.of(2018,02,20));
        Livro livro3 = new Livro(autores.get(2),"a odisseia",true,LocalDate.of(2020,03,01));
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);
    }

    public void imprimirAutores(){
        for (Autor i : autores){
            System.out.println(i.getNomeAutor() + i.getDataNascimento() + " " + i.getIdAutor());
        }
    }

    public void imprimirLivros(){
        for(Livro i : livros){
            if(i.getDisponivel() == true){
                System.out.println("id:" + i.getIdLivro() + " " + i.getTitulo() +" de " + i.getAutor().getNomeAutor() + " " + "esta disponível");
            }
        }
    }

}
