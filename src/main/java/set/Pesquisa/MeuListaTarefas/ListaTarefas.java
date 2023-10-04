package main.java.set.Pesquisa.MeuListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    public Set<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }
    public void adicionarTarefa(String descricao){
        Tarefa tarefaParaAdicinar = new Tarefa(descricao, false);
        listaTarefas.add(tarefaParaAdicinar);
        System.out.println("A " + tarefaParaAdicinar + " foi adicionada.");
    }
    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        for(Tarefa t : listaTarefas){
            if(t.getDescricao() == descricao){
                tarefaParaRemover = t;
                System.out.println("A " + tarefaParaRemover + " foi removida.");
                listaTarefas.remove(tarefaParaRemover);
                return;
            }
        }
        System.out.println("A " + tarefaParaRemover + " não existe.");    
    }
    public void exibirTarefas(){
        System.out.println("Lista de Tarefas : " + listaTarefas);
    }
    public void contarTarefas(){
        System.out.println("Existem " + listaTarefas.size() + " Tarefa(s).");
    }

    public void obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t : listaTarefas){
            if(t.isConcluido()){
                tarefasConcluidas.add(t);
            }
        }
        System.out.println("Tarefas concluídas : " + tarefasConcluidas);
    }
    public void obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t : listaTarefas){
            if(!t.isConcluido()){
                tarefasPendentes.add(t);
            }
        }
        System.out.println("Tarefas pendentes : " + tarefasPendentes);
    }
    public void marcarTarefaConcluida(String descricao){
        for(Tarefa f : listaTarefas){
            if(f.getDescricao() == descricao){
                f.setConcluido(true);
                System.out.println("A " + f + " foi concluída.");
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        for(Tarefa f : listaTarefas){
            if(f.getDescricao() == descricao){
                f.setConcluido(false);
                System.out.println("A " + f + " está pendenter");
            }
        }
    }

    public void limparListaTarefas(){
        listaTarefas.clear();
        System.out.println("A lista foi limpa");
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Abrir a porta");
        lista.adicionarTarefa("Passear");

        lista.removerTarefa("Abrir a porta");

        lista.exibirTarefas();
        lista.contarTarefas();

        lista.adicionarTarefa("Comer legumes");
        lista.adicionarTarefa("Jogar volei");

        lista.marcarTarefaConcluida("Jogar volei");

        lista.exibirTarefas();

        lista.obterTarefasConcluidas();
        lista.obterTarefasPendentes();

        lista.exibirTarefas();
        lista.contarTarefas();
        lista.limparListaTarefas();
        lista.exibirTarefas();

    }
}
