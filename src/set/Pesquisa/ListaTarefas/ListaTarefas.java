package set.Pesquisa.ListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionaTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;
        if (!tarefas.isEmpty()) {
            for (Tarefa tarefa : tarefas) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaRemover = tarefa;
                    break;
                }
            }
            tarefas.remove(tarefaRemover);
        } else {
            System.out.println("O conjunto está vazio.");
        }

        if (tarefaRemover == null) {
            System.out.println("Tarefa não encontrada");
        }
    }

    public void exibirTarefas(){
        if (!tarefas.isEmpty()) {
            System.out.println(tarefas);
        } else {
            System.out.println("Nenhuma tarefa encontrada.");
        }
    }

    public int contarTarefas(){
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : tarefas) {
            if (tarefa.isConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa : tarefas) {
            if (!tarefa.isConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = null;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaPendente = tarefa;
                break;
            }
        }
        if(tarefaPendente != null){
            if(tarefaPendente.isConcluida()){
                tarefaPendente.setConcluida(false);
            }
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void limparListaTarefas(){
        if (tarefas.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            tarefas.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionaTarefa("Limpar quarto");
        listaTarefas.adicionaTarefa("Lavar louça");
        listaTarefas.adicionaTarefa("Trocar roupa de cama");
        listaTarefas.adicionaTarefa("Estender roupas");

        listaTarefas.exibirTarefas();

        System.out.println("Total de tarefas: " + listaTarefas.contarTarefas());

        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Lavar louça");
        listaTarefas.marcarTarefaConcluida("Estender roupas");

        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendente("Lavar louça");
        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Limpar quarto");

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
