package BibliotecaRocket.BancoLocalRocket;
import BibliotecaRocket.Autor;
import BibliotecaRocket.Biblioteca;
import BibliotecaRocket.Livro;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Gravador implements ConversorDeDados{
    private Biblioteca ponteiroBiblioteca;

    public Gravador(Biblioteca biblioteca){
        this.ponteiroBiblioteca = biblioteca;
    }

    @Override
    public String conversorDeAutores(){

        String autores_txt = "";

        for(Autor i : ponteiroBiblioteca.getAutores()){
            autores_txt+= "Id do autor: " + i.getId()
                    + "/ Nome do autor: " + i.getNome()
                    + "/ Data de nascimento do autor: " + i.getDataNascimento() + "\n";
        }

        return autores_txt;
    }

    @Override
    public String conversorDeLivros(){
        String livros_txt = "";

        for(Livro i : ponteiroBiblioteca.getLivros()){
            livros_txt+= "Id do livro: " + i.getId()
                    + "/ Titulo do livro: " + i.getTitulo()
                    + "/ Data de cadastro do livro: " + i.getDataCadastro() + "\n";
        }

        return livros_txt;
    }

    public void escritaDeDados(String gravarAutores, String gravarLivros){
        try{
            File caminhoDeDadosDaBiblioteca = new File ("C:\\Users\\Usuario\\Desktop\\dados_da_biblioteca");

            if(!caminhoDeDadosDaBiblioteca.exists()){
                caminhoDeDadosDaBiblioteca.mkdirs();
            }

            Path caminhoDoAutor = Paths.get("C:\\Users\\Usuario\\Desktop\\dados_da_biblioteca\\banco-de-dados-autores.txt");
            Files.write(caminhoDoAutor,gravarAutores.getBytes(StandardCharsets.UTF_8));

            Path caminhoDoLivro = Paths.get("c:\\Users\\Usuario\\desktop\\dados_da_biblioteca\\banco-de-dados-livros.txt");
            Files.write(caminhoDoLivro,gravarLivros.getBytes(StandardCharsets.UTF_8));

            System.out.println("Dados gravados com sucesso");
        }
        catch(IOException e){
            System.out.println("Problema ao gravar dados");
            System.out.println(e.getMessage());
        }
    }
}
