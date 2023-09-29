package main.java.list.OperacoesBasicas.MeuCarrinho;

public class Item {
    private String nome;
    private int quantidade;
    private double preco;
    private double total;

    
    public Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        total = quantidade * preco;
    }

    public String getNome() {
        return nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getPreco() {
        return preco;
    }

    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Item [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + ", total=" + total + "]";
    }
    
    


}
