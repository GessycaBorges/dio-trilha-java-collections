package map.OperacoesBasicas.agendaDeContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionaAgendaContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            return agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionaAgendaContato("Camila", 123456);
        agendaContatos.adicionaAgendaContato("Camila", 5665);
        agendaContatos.adicionaAgendaContato("Camila Cavalcante", 11111111);
        agendaContatos.adicionaAgendaContato("Camila DIO", 654987);
        agendaContatos.adicionaAgendaContato("Maria Silva", 11111111);
        agendaContatos.adicionaAgendaContato("Camila", 444444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Camila DIO"));
    }
}
