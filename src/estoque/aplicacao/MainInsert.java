package estoque.aplicacao;

import estoque.dao.ClienteDAO;
import estoque.model.Cliente;
import java.util.Scanner;

public class MainInsert {
   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String nome;
        String endereco;
        String telefone;
        String email;
        
        System.out.println("Digite o nome do cliente: ");
        nome = teclado.nextLine();
        System.out.println("Digite o endereço do cliente: ");
        endereco = teclado.nextLine();
        System.out.println("Digite o telefone do cliente: ");
        telefone = teclado.nextLine();
        System.out.println("Digite o email do cliente: ");
        email = teclado.next();
        
        Cliente cliente = new Cliente(nome,endereco,telefone,email);
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.inserir(cliente);
    }
}
