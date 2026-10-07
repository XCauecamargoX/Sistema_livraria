package BibliotecaRocket;

import BibliotecaRocket.Excecao.NumeroNaoEncontrado;

import java.util.*;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca menuBiblioteca = new Biblioteca();
        Emprestimo menuEmprestimo = new Emprestimo(menuBiblioteca);
        List <Integer> opcoes = new ArrayList();
        Collections.addAll(opcoes,1,2);

        int escolhaMenu = 0;

        while (true) {
            System.out.println("deseja ver a lista de livros disponíveis?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            try {
                escolhaMenu = scanner.nextInt();
                scanner.nextLine();

                if(!opcoes.contains(escolhaMenu)){
                    throw new NumeroNaoEncontrado("esta opção não é valida");
                }


                switch (escolhaMenu) {
                    case 1:
                        menuBiblioteca.imprimirLivros();
                        menuEmprestimo.escolherLivro();
                        break;

                    case 2:
                        System.out.println("saindo do sistema...");
                        break;
                }
                break;
            }
            catch(java.util.InputMismatchException e ){
                System.err.println("opção permite apenas numeros inteiros ");
                System.err.println("digite um número das opções válidas");
                scanner.nextLine();
            }
            catch(NumeroNaoEncontrado e){
                System.err.println(e.getMessage());
                System.err.println("digite um numéro que pertence as opções do menu");
            }
        }
    }
}