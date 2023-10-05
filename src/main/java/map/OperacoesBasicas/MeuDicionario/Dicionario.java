package main.java.map.OperacoesBasicas.MeuDicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String,String> dicionario;

    public Dicionario(){
        this.dicionario =  new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
        System.out.println("A palavra : [" + palavra + "] foi adicionada ao dicionário.");
    }

    public void removerPalavra(String palavra){
        if(!dicionario.isEmpty()){
            dicionario.remove(palavra);
            System.out.println("A palavra : [" + palavra + "] foi removida do dicionário.");
        }else{
            System.out.println("O dicionário já está vazio.");
        }
    }

    public void exibirPalavras(){
        if(!dicionario.isEmpty()){
            System.out.println(dicionario);
        }else{
            System.out.println("O dicionário está vazio.");
        }
    }

    public void pesquisarPorPalavra(String palavra){
        String palavraEncontrada = null;
        if(!dicionario.isEmpty()){
            palavraEncontrada = dicionario.get(palavra);
            if(palavraEncontrada != null){
                System.out.println("A palavra [" + palavra + "] foi encontrada e sua definição é [" + palavraEncontrada + "].");
            }else{
                System.out.println("A palavra [" + palavra + "] não foi encontrada.");
            }
        }else{
            System.out.println("O dicionário está vazio");
        }
    }
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Correr", "Andar Rápido");
        dicionario.removerPalavra("Correr");
        dicionario.adicionarPalavra("Comer", "Engolir comida");
        dicionario.adicionarPalavra("Beber", "Engolir líquidos");

        dicionario.exibirPalavras();
        dicionario.pesquisarPorPalavra("Beber");
        dicionario.pesquisarPorPalavra("Come");

    }
}
