package main.java.map.Pesquisa.MeuContagemPalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavras.put(palavra, contagem);
        System.out.println("A palavra [" + palavra + "] foi escrita " + contagem + " veze(s).");
    }

    public void removerPalavra(String palavra) {
        if (!contagemPalavras.isEmpty()) {
            contagemPalavras.remove(palavra);
            System.out.println("A palavra [" + palavra + "] foi totalmente removida do texto.");
        } else {
            System.out.println("O texto está vazio.");
        }
    }

    public void exibirContagemPalavras() {
        Integer contador = 0;
        if (!contagemPalavras.isEmpty()) {
            for (Integer i : contagemPalavras.values()) {
                contador += i;
            }
        }
        System.out.println("Existem " + contador + " palavra(s) no texto.");
    }

    public void encontrarPalavraMaisFrequente() {
        if (!contagemPalavras.isEmpty()) {
            Integer maiorQuantidade = Integer.MIN_VALUE;
            String palavraMaisFrequente = null;
            for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
                if (entry.getValue() > maiorQuantidade) {
                    maiorQuantidade = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                    
                }
            }
            System.out.println("A palavra que mais repete é [" + palavraMaisFrequente + "] que se repete " + maiorQuantidade + " vezes.");
        }else{
            System.out.println("O texto está vazio.");
        }

    }

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        contagem.adicionarPalavra("Mario", 3);
        contagem.adicionarPalavra("Bomberman", 5);
        contagem.adicionarPalavra("Castelo", 1);

        contagem.exibirContagemPalavras();

        contagem.removerPalavra("Mario");

        contagem.exibirContagemPalavras();

        contagem.encontrarPalavraMaisFrequente();

        contagem.adicionarPalavra("Castor", 23);

        contagem.exibirContagemPalavras();
        contagem.encontrarPalavraMaisFrequente();
    }
}
