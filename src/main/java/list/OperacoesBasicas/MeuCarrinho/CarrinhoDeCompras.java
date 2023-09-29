package main.java.list.OperacoesBasicas.MeuCarrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    public List<Item> listaItens;

    public CarrinhoDeCompras() { // Constructor
        this.listaItens = new ArrayList<>();
    }

    void adicionarNoCarrinho(String nome, int quantidade, double preco) {
        Item item = new Item(nome, quantidade, preco);
        listaItens.add(item);
    }

    public void exibirItens() {
        if (!listaItens.isEmpty()) {
            for (Item item : listaItens) {
                System.out.println(item);
            }
        }else{
            System.out.println("A lista de compras está vazia.");
        }

    }

    public void removerUltimoItem() {
        for (int i = 0; i < listaItens.size(); i++) {
            if (i == (listaItens.size() - 1)) {
                System.out.println("O item : " + listaItens.get(i).getNome() + " foi removido da lista.");
                listaItens.remove(i);

            }
        }
    }

    public void editarQuantidadeItem(String nome, int novaQuantidade) {
        for (Item item : listaItens) {

            if (item.getNome() == nome) {
                item.setQuantidade(novaQuantidade);
            }
        }
    }

    public void valorTotalCompras() {
        double valorTotal = 0;
        for (Item item : listaItens) {
            valorTotal += item.getTotal();
        }
        System.out.println(valorTotal);
    }

    public void limparLista() {
        listaItens.removeAll(listaItens);
        System.out.println("Lista limpa. Todos os itens foram removidos.");
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras [listaItens=" + listaItens + "]";
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarNoCarrinho("banana", 2, 3.34);
        carrinhoDeCompras.adicionarNoCarrinho("feijão", 5, 5.99);
        carrinhoDeCompras.adicionarNoCarrinho("arroz", 5, 2.99);
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.editarQuantidadeItem("feijão", 10);
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerUltimoItem();

        carrinhoDeCompras.valorTotalCompras();
        carrinhoDeCompras.limparLista();
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.adicionarNoCarrinho("goiaba", 3, 1.20);
        carrinhoDeCompras.exibirItens();
    }
}
