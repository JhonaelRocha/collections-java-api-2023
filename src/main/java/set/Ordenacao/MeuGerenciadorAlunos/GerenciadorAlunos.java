package main.java.set.Ordenacao.MeuGerenciadorAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    public Set<Aluno> listaAlunos;

    public GerenciadorAlunos() {
        this.listaAlunos = new HashSet<>();
    }
    public void adicionarAluno(String nome, long matricula, double nota){
        Aluno alunoParaAdicionar = new Aluno(nome, matricula, nota);
        listaAlunos.add(alunoParaAdicionar);
        System.out.println("O " + alunoParaAdicionar + " foi adicionado");
    }
    public void removerAluno(long matricula){
        for(Aluno a : listaAlunos){
            if(a.getMatricula() == matricula){
                listaAlunos.remove(a);
                System.out.println("O " + a + " foi removido");
            }
        }
    }
    public Set<Aluno> exibirAlunosPorNome(){
        Set <Aluno> alunosPorNome = new TreeSet<>(listaAlunos);
        System.out.println("Lista Organizada por Nome : " + alunosPorNome);;
        return alunosPorNome;
    }
    public Set<Aluno> exibirAlunosPorNota(){
        Set <Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(listaAlunos);
        System.out.println("Lista Organizada por Nota : " + alunosPorNota);
        return alunosPorNota;
    }
    public Set<Aluno> exibirAlunos(){
        System.out.println("Lista de Alunos : " + listaAlunos);
        return listaAlunos;
    }
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Maria", 123, 8);
        gerenciadorAlunos.adicionarAluno("Pedro", 32, 10);
        gerenciadorAlunos.adicionarAluno("Júlia", 42, 9);

        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();

        gerenciadorAlunos.removerAluno(32);

        gerenciadorAlunos.exibirAlunos();
    }
}
