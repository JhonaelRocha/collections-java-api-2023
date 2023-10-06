package main.java.map.Ordenacao.MeuLivrariaOnline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
    private Map<String, Livro> livraria;

    public LivrariaOnline() {
        this.livraria = new HashMap<>();
    }
    public void adicionarLivro(String link, String titulo, String autor, double preco){
        Livro livro = new Livro(titulo, autor, preco);
        livraria.put(link, livro);
        System.out.println("O " + livro + " de link [" + link + "] foi adicionado");
    }
    public void removerLivro(String titulo){
        if(!livraria.isEmpty()){
            List<String> livrosParaRemover = new ArrayList<>();
            for (Map.Entry<String, Livro> entry : livraria.entrySet()) {
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    livrosParaRemover.add(entry.getKey());
                }
            }
            for (String link : livrosParaRemover) {
                System.out.println("O "+ livraria.get(link) +" de link[" + link + "] foi removido.");
                livraria.remove(link);
                ;
            }
        } else {
            System.out.println("A livraria está vazia.");
        }
    }

    /*Rever*/
    
    /*Fim*/
    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        livrariaOnline.adicionarLivro("Link 1", "Como plantar batatas", "Julia", 12.99);
        livrariaOnline.removerLivro("Como plantar batatas");
    }
}
