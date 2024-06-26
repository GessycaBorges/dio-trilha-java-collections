package set.OperacoesBasicas.ConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(!palavrasUnicasSet.isEmpty()){
            if(palavrasUnicasSet.contains(palavra)){
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada.");
            }
        } else {
            System.out.println("O conjunto está vazio.");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if(!palavrasUnicasSet.isEmpty()){
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("O conjunto está vazio.");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("Palavra 1");
        conjunto.adicionarPalavra("Palavra 2");
        conjunto.adicionarPalavra("Palavra 3");
        conjunto.adicionarPalavra("Palavra 4");
        conjunto.adicionarPalavra("Palavra 5");

        conjunto.exibirPalavrasUnicas();

        conjunto.removerPalavra("Palavra 1");
        conjunto.exibirPalavrasUnicas();

        System.out.println("A palavra 2 está no conjunto? " + conjunto.verificarPalavra("Palavra 2"));
    }
}
