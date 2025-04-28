package academy.italo.maratonajava.javacore.Ycolecoes.test;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapTest {
    public static void main(String[] args) {

        // ===========================================
        // 1. Exemplo com Map e HashMap
        // ===========================================
        // A interface Map define os métodos que qualquer estrutura de mapeamento deve ter.
        // HashMap é uma implementação concreta dessa interface que não garante a ordem dos elementos.

        Map<Integer, String> map = new HashMap<>();  // Criação de um Map utilizando HashMap.

        // Adicionando elementos ao Map (Chave-Valor)
        map.put(1, "Um");
        map.put(2, "Dois");
        map.put(3, "Três");

        // Exibindo os elementos do Map
        System.out.println("Conteúdo do Map (usando HashMap - sem garantia de ordem):");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();  // Quebra de linha para separar os exemplos


        // ===========================================
        // 2. Exemplo com HashMap
        // ===========================================
        // O HashMap é uma implementação do Map e não garante a ordem dos elementos inseridos.
        // Ele usa uma tabela hash interna para mapear as chaves aos valores, o que resulta
        // em operações de tempo constante (em média) para inserção e busca de elementos.

        HashMap<Integer, String> hashMap = new HashMap<>();  // Criação de um HashMap

        // Adicionando elementos ao HashMap
        hashMap.put(1, "Maçã");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Laranja");

        // Exibindo os elementos do HashMap
        System.out.println("Conteúdo do HashMap (sem garantir a ordem de inserção):");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();  // Quebra de linha para separar os exemplos


        // ===========================================
        // 3. Exemplo com LinkedHashMap
        // ===========================================
        // O LinkedHashMap também é uma implementação do Map, mas ele mantém a ordem de inserção dos elementos.
        // Ele usa uma tabela hash interna e uma lista duplamente ligada para garantir que os elementos sejam
        // retornados na mesma ordem em que foram inseridos.

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();  // Criação de um LinkedHashMap

        // Adicionando elementos ao LinkedHashMap
        linkedHashMap.put(1, "Café");
        linkedHashMap.put(2, "Chá");
        linkedHashMap.put(3, "Suco");

        // Exibindo os elementos do LinkedHashMap
        System.out.println("Conteúdo do LinkedHashMap (mantém a ordem de inserção):");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();  // Quebra de linha para separar os exemplos


        // ===========================================
        // Resumo das diferenças:
        // ===========================================
        System.out.println("Resumo das diferenças entre Map, HashMap e LinkedHashMap:");
        System.out.println("- Map é uma interface que define o comportamento de mapeamento chave-valor.");
        System.out.println("- HashMap é uma implementação do Map que não garante a ordem dos elementos.");
        System.out.println("- LinkedHashMap é uma implementação do Map que mantém a ordem de inserção dos elementos.");
        System.out.println("- HashMap é mais eficiente em termos de tempo para inserção e busca, mas não mantém a ordem.");
        System.out.println("- LinkedHashMap garante a ordem de inserção, mas tem um ligeiro custo de desempenho.");
    }
}
