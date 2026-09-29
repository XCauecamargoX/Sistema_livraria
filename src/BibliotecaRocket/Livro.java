package BibliotecaRocket;

import java.time.LocalDate;

public class Livro {
    private static int idContadorLivro = 0;
    private int idLivro;
    private String titulo;
    private boolean disponivel;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;
    private Autor autor;

    public Livro(Autor autor,String titulo,boolean disponivel,LocalDate dataCadastro){
    this.idContadorLivro++;
    this.idLivro = idContadorLivro;
    this.titulo = titulo;
    this.disponivel = disponivel;
    this.dataCadastro = dataCadastro;
    this.autor = autor;
    }

    public Autor getAutor(){return autor;}

    public int getIdLivro(){return idLivro;}

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public boolean getDisponivel(){
        return disponivel;
    }

    public void setDataCadastro(LocalDate dataCadastro){
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataCadastro(){
        return dataCadastro;
    }

    public void setDataAtualizacao(LocalDate dataAtualizacao){
        this.dataAtualizacao = dataAtualizacao;
    }

    public LocalDate getDataAtualizacao(){
        return dataAtualizacao;
    }
}
