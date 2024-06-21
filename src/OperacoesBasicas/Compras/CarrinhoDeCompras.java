package OperacoesBasicas.Compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!carrinho.isEmpty()) {
            for (Item item : carrinho) {
                if (item.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(item);
                }
            }
            carrinho.removeAll(itensParaRemover);
        } else {
            throw new RuntimeException("O carrinho está vazio.");
        }
    }

    public double calcularValorTotal() {
        double total = 0d;
        if (!carrinho.isEmpty()) {
            for (Item item : carrinho) {
                total += item.getPreco() * item.getQuantidade();
            }
            return total;
        } else {
            throw new RuntimeException("O carrinho está vazio.");
        }
    }

    public void exibirItens() {
        if (!carrinho.isEmpty()) {
            System.out.println(carrinho);
        } else {
            System.out.println("O carrinho está vazio.");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Item 1", 59.99, 1);
        carrinhoDeCompras.adicionarItem("Item 2", 149.99, 2);
        carrinhoDeCompras.adicionarItem("Item 3", 125.99, 3);
        carrinhoDeCompras.adicionarItem("Item 0", 65.99, 1);

        System.out.println("O valor total do seu carrinho é: R$" + String.format("%.2f", carrinhoDeCompras.calcularValorTotal()));
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Item 0");
        carrinhoDeCompras.removerItem("Item 2");

        System.out.println("O valor total do seu carrinho é: R$" + String.format("%.2f", carrinhoDeCompras.calcularValorTotal()));
        carrinhoDeCompras.exibirItens();
    }
}
