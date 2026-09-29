package BibliotecaRocket;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Biblioteca menuBiblioteca = new Biblioteca();
        Emprestimo menuEmprestimo = new Emprestimo(menuBiblioteca);
        while (1 > 0){
            System.out.println("deseja ver a lista de livros disponíveis?");
            String resposta = scanner.nextLine();

            if(resposta.equalsIgnoreCase("sim")){
                menuBiblioteca.imprimirLivros();
                menuEmprestimo.escolherLivro();
            }

            else{
                System.out.println("saindo do sistema...");
                break;
            }
        }
    }
}
