package estoque.aplicacao;

import estoque.dao.ClienteDAO;
import java.util.Scanner;

public class MainDelete {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o id do cliente a ser removido:");
        int cliid = teclado.nextInt();
        
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.remover(cliid);
    }
}
