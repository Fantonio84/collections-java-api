package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributos
    private List<Integer> numeros;

    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int total = 0;
        for(Integer n :numeros) {
            total += n;
        }
        return total;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!numeros.isEmpty()) {
            for (Integer n : numeros) {
                if (n >= maiorNumero) {
                    maiorNumero = n;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if(!numeros.isEmpty()) {
            for (Integer n : numeros) {
                if (n <= menorNumero) {
                    menorNumero = n;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(1);

        System.out.println("A soma dos numeros é: " + somaNumeros.calcularSoma());
        System.out.println("O maior numero é : " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor numero é: " + somaNumeros.encontrarMenorNumero());

        somaNumeros.exibirNumeros();




    }

}
