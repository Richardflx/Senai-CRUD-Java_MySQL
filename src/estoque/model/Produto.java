
package estoque.model;

/**
 *
 * @author richard
 */
public class Produto {
    private int id;
    private String nome;
    private String tipo;
    private int quantidade;
    
    public Produto() {
        
    }

    public Produto(String nome, String tipo, int quantidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    public Produto(int id, String nome, String tipo, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString() {
        return "Id: " + id + "\nProduto: " + nome + "\nTipo: " + tipo + "\nQuantidade: " + quantidade;
    }
    
}
