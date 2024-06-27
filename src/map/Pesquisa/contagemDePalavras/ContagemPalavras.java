package map.Pesquisa.contagemDePalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, Integer contagem) {
        this.palavras.put(palavra, contagem);
    }

    public void removePalavra(String palavra) {
        if (!palavras.isEmpty()) {
            this.palavras.remove(palavra);
        } else {
            System.out.println("Está vazio");
        }
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : palavras.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        contagem.adicionarPalavras("Java", 2);
        contagem.adicionarPalavras("Python", 8);
        contagem.adicionarPalavras("JavaScript", 1);
        contagem.adicionarPalavras("C#", 6);

        System.out.println("Existem " + contagem.exibirContagemPalavras() + " palavras.");

        String palavraMaisFrequente = contagem.encontrarPalavraMaisFrequente();
        System.out.println("A palavra mais frequente é: " + palavraMaisFrequente);

        contagem.removePalavra("C#");
        System.out.println("Existem " + contagem.exibirContagemPalavras() + " palavras.");
    }
}
