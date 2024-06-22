package list.Ordenacao.Numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listaOrdenada = new ArrayList<>(this.listaNumeros);
        if (!listaNumeros.isEmpty()){
            Collections.sort(listaOrdenada);
            return listaOrdenada;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> listaOrdenada = new ArrayList<>(this.listaNumeros);
        if (!listaNumeros.isEmpty()){
            listaOrdenada.sort(Collections.reverseOrder());
            return listaOrdenada;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public void exibirNumeros() {
        if (!listaNumeros.isEmpty()){
            System.out.println(this.listaNumeros);
        } else {
            System.out.println("Lista vazia");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(10);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(35);
        numeros.adicionarNumero(15);
        numeros.adicionarNumero(50);

        numeros.exibirNumeros();

        System.out.println("Ordenação Ascendente");
        System.out.println(numeros.ordenarAscendente());

        System.out.println("Ordenação Descendente");
        System.out.println(numeros.ordenarDescendente());
    }
}
