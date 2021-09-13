
package estoque.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import estoque.model.Produto;

public class ProdutoDAO {
    
    private Connection connection;
    
    public ProdutoDAO() {
        try {
            String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/estoque_plus";
            String usuario = "root";
            String senha = "root";
            this.connection = DriverManager.getConnection(DATABASE_URL, usuario, senha);
        } catch (SQLException ex) {
            System.out.println("Erro de conexão");
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Produto> listar() {
        String sql = "SELECT * FROM tbprodutos";
        List<Produto> retorno = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Produto produto = new Produto();
                produto.setId(resultado.getInt("idproduto"));
                produto.setNome(resultado.getString("nomeproduto"));
                produto.setTipo(resultado.getString("tipoproduto"));
                produto.setQuantidade(resultado.getInt("quantidadeproduto"));
                retorno.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

    public boolean inserir(Produto produto) {
        String sql = "INSERT INTO tbprodutos(nomeproduto, tipoproduto, quantidadeproduto) VALUES(?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getTipo());
            stmt.setInt(3, produto.getQuantidade());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean alterar(Produto produto) {
        String sql = "UPDATE tbprodutos SET nomeproduto=?, tipoproduto=?, quantidadeproduto=? WHERE idproduto=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getTipo());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setInt(4, produto.getId());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean remover(Integer id) {
        String sql = "DELETE FROM tbprodutos WHERE idproduto=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean verificaId(Integer id) {
        String sql = "SELECT idproduto FROM tbprodutos WHERE idproduto=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
