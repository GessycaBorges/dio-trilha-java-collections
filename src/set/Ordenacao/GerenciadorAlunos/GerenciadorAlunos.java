package set.Ordenacao.GerenciadorAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoARemover = null;
        if (!alunos.isEmpty()) {
            for (Aluno aluno : alunos) {
                if (aluno.getMatricula() == matricula) {
                    alunoARemover = aluno;
                    break;
                }
            }
            alunos.remove(alunoARemover);
        } else {
            System.out.println("Não há alunos cadastrados");
        }

        if (alunoARemover == null) {
            System.out.println("Matrícula não encontrada.");
        }
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
        if (!alunos.isEmpty()){
            System.out.println(alunosPorNome);
        } else {
            System.out.println("Não há alunos cadastrados");
        }
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if (!alunos.isEmpty()){
            alunosPorNota.addAll(alunos);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("Não há alunos cadastrados");
        }
    }

    public void exibirAlunos() {
        System.out.println(alunos);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        gerenciador.adicionarAluno("Ana", 12345L, 8.67);
        gerenciador.adicionarAluno("Bob", 98765L, 7.89);
        gerenciador.adicionarAluno("Carlos", 98765L, 7.89);
        gerenciador.adicionarAluno("Joana", 69571L, 8.78);
        gerenciador.adicionarAluno("Maria", 56987L, 7.78);

        System.out.println("Alunos no gerenciador: ");
        gerenciador.exibirAlunos();

        gerenciador.removerAluno(12345L);
        gerenciador.exibirAlunos();

        gerenciador.exibirAlunosPorNome();
        gerenciador.exibirAlunosPorNota();

    }
}