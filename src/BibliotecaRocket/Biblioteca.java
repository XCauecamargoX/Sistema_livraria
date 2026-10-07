package BibliotecaRocket;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca{
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void setLivros(List<Livro> livros){
        this.livros = livros;
    }

    public List <Livro> getLivros(){
        return this.livros;
    }

    public Biblioteca(){
        montarAutores();
        montarLivros();
    }

    public void montarAutores(){
        autores.add(new Autor("kleber", LocalDate.of(2005,05,15)));
        autores.add(new Autor("malfoy", LocalDate.of(2003,02,07)));
        autores.add(new Autor("lucia", LocalDate.of(2008,10,15)));
    }

    public void montarLivros(){
        livros.add(new Livro(autores.get(0),"a vingança",true,LocalDate.of(2015,05,15)));
        livros.add(new Livro(autores.get(1),"desespero dos inocentes",true,LocalDate.of(2018,02,20)));
        livros.add(new Livro(autores.get(2),"a odisseia",true,LocalDate.of(2020,03,01)));
    }

    public void imprimirAutores(){
        for (Autor i : autores){
            System.out.println(i.getNome() + i.getDataNascimento() + " " + i.getId());
        }
    }

    public void imprimirLivros(){
        for(Livro i : livros){
            if(i.getDisponivel() == true){
                System.out.println("id:" + i.getId() + " " + i.getTitulo() +" de " + i.getAutor().getNome() + " " + "esta disponível");
            }
        }
    }

}
