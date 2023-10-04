package main.java.set.OperacoesBasicas.MeuConjuntoPalavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavras {
    public Set<String> conjuntoPalavras;

    

    public ConjuntoPalavras() {
        this.conjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavras.add(palavra);
        System.out.println("A palavra " + palavra + " foi adicionada.");
    }

    public void removerPalavra(String palavra){
        String palavraParaRemover = null;
        for(String p : conjuntoPalavras){
            if(p == palavra){
                palavraParaRemover = p;
                break;
            }
        }
        if(palavraParaRemover == null){
            System.out.println("Nenhuma palavra com esse nome encotrada.");
        }else{
            conjuntoPalavras.remove(palavraParaRemover);
            System.out.println("A palavra "  + palavra + " foi removida.");
        }
    }

    public void verificarPalavra(String palavra){
        for(String p : conjuntoPalavras){
            if(p == palavra){
                System.out.println("A palavra " + palavra + " está presente no conjunto.");
                return;
            }
        }
        System.out.println("A palavra " + palavra + " ainda não está presente no conjunto");
    }

    public void exibirPalavras(){
        System.out.println(conjuntoPalavras);
    }

    @Override
    public String toString() {
        return "ConjuntoPalavras [conjuntoPalavras=" + conjuntoPalavras + "]";
    }

    public static void main(String[] args) {
        ConjuntoPalavras conjunto = new ConjuntoPalavras();

        conjunto.adicionarPalavra("cachorro");
        conjunto.removerPalavra("gato");
        conjunto.adicionarPalavra("gato");
        
        conjunto.verificarPalavra("cachorro");
        conjunto.verificarPalavra("pato");
        conjunto.adicionarPalavra("peixe");

        conjunto.exibirPalavras();
        
    }
}
