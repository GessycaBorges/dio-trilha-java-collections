package list.Ordenacao.Pessoas;

import java.util.*;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<Pessoa>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Ana", 35, 1.65);
        ordenacaoPessoas.adicionarPessoa("João", 30, 1.8);
        ordenacaoPessoas.adicionarPessoa("Pedro", 40, 1.7);
        ordenacaoPessoas.adicionarPessoa("Maria", 50, 1.6);

        System.out.println(ordenacaoPessoas.pessoaList);

        System.out.println("Ordenado por Idade");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        System.out.println("Ordenado por Altura");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());


    }
}
