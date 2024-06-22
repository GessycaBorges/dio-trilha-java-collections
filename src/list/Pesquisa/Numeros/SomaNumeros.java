package list.Pesquisa.Numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> lista;

    public SomaNumeros() {
        this.lista = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.lista.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : lista) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maior = Integer.MIN_VALUE;
        if(!lista.isEmpty()) {
            for (Integer numero : lista) {
                if(numero >= maior) {
                    maior = numero;
                }
            }
            return maior;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public int encontrarMenorNumero() {
        int menor = Integer.MAX_VALUE;
        if(!lista.isEmpty()) {
            for (Integer numero : lista) {
                if(numero <= menor) {
                    menor = numero;
                }
            }
            return menor;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public void exibirNumeros() {
        if(!lista.isEmpty()) {
            System.out.println(lista);
        } else {
            System.out.println("Lista vazia");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(20);

        System.out.println("Soma: " + somaNumeros.calcularSoma());

        System.out.println("Maior numero: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor numero: " + somaNumeros.encontrarMenorNumero());

        somaNumeros.exibirNumeros();


    }
}
