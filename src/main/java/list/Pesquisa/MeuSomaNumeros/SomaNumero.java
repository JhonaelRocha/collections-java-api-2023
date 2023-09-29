package main.java.list.Pesquisa.MeuSomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumero{
    private List<Integer> listaNumeros;

    public SomaNumero() {
        this.listaNumeros = new ArrayList<>();
    }


    public List<Integer> adicionarNumero(int numero){
        listaNumeros.add(numero);
        return listaNumeros;
    }


    public int calcularSoma(){
        int soma = 0;
        if(!listaNumeros.isEmpty()){
            for(Integer numero : listaNumeros){
                soma += numero;
            }
        }
        System.out.println("A soma de todos os números é " + soma + " .");
        return soma;
    }


    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE; // pega o valor mínimo que um inteiro pode ter
        if(!listaNumeros.isEmpty()){
            for(int numero : listaNumeros){
                if(numero > maiorNumero){
                    maiorNumero = numero;
                }
            }
        }
        System.out.println("O maior número da lista é : " + maiorNumero + " .");
        return maiorNumero;
    }
    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE; //pega o valor máximo que um inteiro pode ter
        if(!listaNumeros.isEmpty()){
            for(int numero : listaNumeros){
                if(numero < menorNumero){
                    menorNumero = numero;
                }
            }
        }
        System.out.println("O menor número da lista é : " + menorNumero + " .");
        return menorNumero;
    }



    public void exibirNumeros(){
        System.out.println(listaNumeros); 
    }

    public static void main(String[] args) {
        SomaNumero numero = new SomaNumero();

        numero.adicionarNumero(2);
        numero.adicionarNumero(7);
        numero.adicionarNumero(5);
        numero.adicionarNumero(-2);

        numero.exibirNumeros();
        numero.calcularSoma();

        numero.encontrarMaiorNumero();
        numero.encontrarMenorNumero();



    }
}