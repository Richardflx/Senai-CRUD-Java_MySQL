package estoque.aplicacao;

import estoque.dao.ClienteDAO;
import estoque.model.Cliente;

import java.util.Scanner;

public class MainUpdate {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String id;
        int id2;
        String nome;
        String endereco;
        String telefone;
        String email;
        
        System.out.println("Digite o id do cliente a ser modificado:");
        id = teclado.nextLine();
        id2 = Integer.parseInt(id);
        
        System.out.println("Digite o Nome do cliente:");
        nome = teclado.nextLine();
        
        System.out.println("Digite o Endereço do cliente:");
        endereco = teclado.nextLine();
        
        System.out.println("Digite o Telefone do cliente:");
        telefone = teclado.nextLine();
        
        System.out.println("Digite o Email do cliente:");
        email = teclado.nextLine();
        
        Cliente cliente = new Cliente(id2,nome,endereco,telefone,email);
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.alterar(cliente);
        
    }
}
