package estoque.aplicacao;

import java.util.List;
import estoque.dao.ClienteDAO;
import estoque.model.Cliente;

public class MainSelect {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();
        List<Cliente> lista = clienteDAO.listar();
        for (Cliente cliente : lista)
             System.out.println(cliente);
    }
}
