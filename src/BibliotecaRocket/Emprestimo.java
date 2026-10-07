package BibliotecaRocket;

import java.time.LocalDate;
import java.util.Scanner;

public class Emprestimo{
    private int idEmprestimo;
    private String nomeCliente;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private Livro livro;
    private Biblioteca ponteiroBiblioteca;

    public Emprestimo(Biblioteca biblioteca){
        this.ponteiroBiblioteca = biblioteca;
    }

    private int escolhaLivro;
    public void escolherLivro(){
        System.out.println("insira seu nome para registro do emprestimo");
        Scanner scanner = new Scanner(System.in);
        nomeCliente = scanner.nextLine();

        while(true) {
            System.out.println("Qual livro deseja emprestar?");
            setEscolhaLivro(scanner.nextInt());
            scanner.nextLine();

            for (Livro i : ponteiroBiblioteca.getLivros()) {
                if (getEscolhaLivro() == i.getId()) {
                    if (i.getDisponivel() == true) {
                        System.out.println("o livro de id:" + i.getId() + " foi emprestado para " + getNomeCliente());
                        i.setDisponivel(false);
                    } else {
                        System.out.println("este livro não está disponível para empréstimo");
                    }
                }
            }

            System.out.println("deseja escolher outro livro?");
            String EscolhaMaisLivro = scanner.nextLine();

            if (EscolhaMaisLivro.equalsIgnoreCase("não")) {
                break;
            }
            else{
                ponteiroBiblioteca.imprimirLivros();
            }
        }
    }

    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataEmprestimo(){
        return dataEmprestimo;
    }

    public void setDataDevolucao(LocalDate dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }

    public void setEscolhaLivro(int escolhaLivro){
        this.escolhaLivro = escolhaLivro;
    }

    public int getEscolhaLivro(){
        return escolhaLivro;
    }

}

