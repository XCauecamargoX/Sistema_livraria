package BibliotecaRocket;

import java.time.LocalDate;

public class Autor {
    private static int idAutorContador = 0;
    private int id;
    private String nome;
    private LocalDate dataNascimento;


    public Autor(String nome, LocalDate dataNascimento){
        this.idAutorContador++;
        this.id = idAutorContador;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public int getId(){
        return id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }
}
