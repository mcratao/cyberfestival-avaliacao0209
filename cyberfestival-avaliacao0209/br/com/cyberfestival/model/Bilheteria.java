package br.com.cyberfestival.model;

import java.util.HashMap;
import java.util.Map;
// Gerencia o fluxo de vendas e o controle de ingressos do festival
public class Bilheteria {

// Mapa para armazenar os ingressos vendidos usando o código ID como chave única
private Map<String, Ingresso> ingressosVendidos;
// Construtor: inicializa a estrutura de dados em memória
public Bilheteria() {
    ingressosVendidos = new HashMap<>();
}
// Registra a venda de um novo ingresso com validação contra duplicidade
public void venderIngresso(Ingresso ingresso) {
// Verifica se o ID do ingresso já foi registrado anteriormente
    if (ingressosVendidos.containsKey(ingresso.getCodigoId())) {
        // Lança uma exceção personalizada caso o ingresso seja repetido
        throw new IngressoInvalidoException();
    }
// Armazena o ingresso no mapa caso o código seja inédito
    ingressosVendidos.put(
            ingresso.getCodigoId(),
            ingresso
    );
}
// Calcula a receita total obtida exclusivamente com ingressos VIP
public double calcularReceitaVIP() {

    return ingressosVendidos.values()
            .stream()
        // Filtra apenas os ingressos cujo tipo é "VIP"
            .filter(i -> i.getTipo().equals("VIP"))
        // Extrai o valor monetário de cada ingresso VIP   
        .mapToDouble(Ingresso::getValor)
        // Soma todos os valores mapeados 
        .sum();
}


}
