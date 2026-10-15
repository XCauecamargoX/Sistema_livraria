package BibliotecaRocket;

import BibliotecaRocket.Excecao.NumeroNaoEncontradoException;

import java.util.*;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca menuBiblioteca = new Biblioteca();
        Emprestimo menuEmprestimo = new Emprestimo(menuBiblioteca);
        Cadastro menuCadastro = new Cadastro(menuEmprestimo,menuBiblioteca);
        List <Integer> opcoes = new ArrayList();
        Collections.addAll(opcoes,1,2,3);

        int escolhaMenu = 0;

        while (true) {
            System.out.println("------------------Biblioteca java------------------");
            System.out.println("Escolha uma das opções");
            System.out.println("1 - Emprestar um livro");
            System.out.println("2 - Cadastrar");
            System.out.println("3 - Sair");
            try {
                escolhaMenu = scanner.nextInt();
                scanner.nextLine();

                if(!opcoes.contains(escolhaMenu)){
                    throw new NumeroNaoEncontradoException("esta opção não é valida");
                }


                switch (escolhaMenu){
                    case 1:
                        menuBiblioteca.imprimirLivros();
                        menuEmprestimo.escolherLivro();
                        break;

                    case 2:
                        System.out.println("1- cadastrar livro");
                        System.out.println("2- cadastrar Autor");
                        int escolhaDeCadastro = scanner.nextInt();
                        scanner.nextLine();

                        if(escolhaDeCadastro == 1){
                            menuCadastro.cadastrarLivros();
                        }
                        else if(escolhaDeCadastro == 2){
                            menuCadastro.cadastrarAutores();
                        }
                        break;
                }

                if(escolhaMenu == 3){
                    System.out.println("saindo do sistema...");
                    break;
                }
            }
            catch(java.util.InputMismatchException e ){
                System.err.println("opção permite apenas numeros inteiros ");
                System.err.println("digite um número das opções válidas");
                scanner.nextLine();
            }
            catch(NumeroNaoEncontradoException e){
                System.err.println(e.getMessage());
                System.err.println("digite um numéro que pertence as opções do menu");
            }
        }
    }
}