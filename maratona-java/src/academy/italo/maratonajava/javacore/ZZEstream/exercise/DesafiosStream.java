package academy.italo.maratonajava.javacore.ZZEstream.exercise;

import academy.italo.maratonajava.javacore.Jmodificadorfinal.domain.Comprador;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

record Produto(String nome, String categoria, BigDecimal preco, int estoque) {}

record Cliente(String nome, String tier) {}

record Pedido(String status, LocalDate dataPedido, List<Produto> produtos, Cliente cliente) {}

public class DesafiosStream {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana", "Ouro");
        Cliente cliente2 = new Cliente("Bruno", "Prata");
        Cliente cliente3 = new Cliente("Carla", "Bronze");
        Cliente cliente4 = new Cliente("Daniel", "Ouro");

        Produto produto1 = new Produto("Notebook Gamer", "Eletrônicos", new BigDecimal("7500.00"), 10);
        Produto produto2 = new Produto("Teclado Mecânico", "Eletrônicos", new BigDecimal("450.50"), 25);
        Produto produto3 = new Produto("O Senhor dos Anéis", "Livros", new BigDecimal("120.00"), 30);
        Produto produto4 = new Produto("Monitor Ultrawide", "Eletrônicos", new BigDecimal("2800.00"), 15);
        Produto produto5 = new Produto("Cafeteira Expresso", "Eletrodomésticos", new BigDecimal("350.00"), 20);
        Produto produto6 = new Produto("Duna", "Livros", new BigDecimal("95.50"), 50);
        Produto produto7 = new Produto("Air Fryer", "Eletrodomésticos", new BigDecimal("499.90"), 5);

        List<Produto> todosOsProdutos = List.of(produto1, produto2, produto3, produto4, produto5, produto6, produto7);

        Pedido pedido1 = new Pedido("ENTREGUE", LocalDate.of(2023, 10, 5), List.of(produto1, produto3), cliente1);
        Pedido pedido2 = new Pedido("PROCESSANDO", LocalDate.of(2023, 10, 20), List.of(produto5, produto6), cliente2);
        Pedido pedido3 = new Pedido("ENTREGUE", LocalDate.of(2023, 9, 15), List.of(produto4), cliente4);
        Pedido pedido4 = new Pedido("CANCELADO", LocalDate.of(2023, 10, 1), List.of(produto2), cliente1);
        Pedido pedido5 = new Pedido("ENTREGUE", LocalDate.of(2023, 8, 12), List.of(produto6, produto7), cliente3);
        Pedido pedido6 = new Pedido("PROCESSANDO", LocalDate.of(2023, 10, 21), List.of(produto3, produto4, produto5), cliente4);


        List<Pedido> todosOsPedidos = List.of(pedido1, pedido2, pedido3, pedido4, pedido5, pedido6);

        // ** SEU CÓDIGO AQUI **

        List<Produto> produtos = todosOsProdutos.stream()
                .filter(categoria -> categoria.categoria().equals("Eletrônicos"))
                .filter(preco -> preco.preco().compareTo(new BigDecimal("2000")) > 0)
                .sorted(Comparator.comparing(Produto::preco).reversed())
                .collect(Collectors.toList());

        System.out.println(produtos);
    }
}