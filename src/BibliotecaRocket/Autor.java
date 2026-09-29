package BibliotecaRocket;

import java.time.LocalDate;

public class Autor {
    private static int idAutorContador = 0;
    private int idAutor;
    private String nomeAutor;
    private LocalDate dataNascimento;


    public Autor(String nomeAutor,LocalDate dataNascimento){
        this.idAutorContador++;
        this.idAutor = idAutorContador;
        this.nomeAutor = nomeAutor;
        this.dataNascimento = dataNascimento;
    }

    public int getIdAutor(){return idAutor;}

    public void setNomeAutor(String nomeAutor){
        this.nomeAutor = nomeAutor;
    }

    public String getNomeAutor(){
        return nomeAutor;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }


}
