package br.com.cyberfestival.main;

import br.com.cyberfestival.model.Bilheteria;
import br.com.cyberfestival.model.Ingresso;
import br.com.cyberfestival.model.IngressoInvalidoException;
// Classe principal para execução e teste dos cenários da bilheteria
public class Main {

public static void main(String[] args) {
// Instancia o controlador da bilheteria
    Bilheteria bilheteria = new Bilheteria();
// Cria os ingressos de teste (ingresso3 reutiliza o ID de ingresso1 de propósito)
    Ingresso ingresso1 = new Ingresso("A-01", "VIP", 500.00);
    Ingresso ingresso2 = new Ingresso("A-02", "PISTA", 200.00);
    Ingresso ingresso3 = new Ingresso("A-01", "PISTA", 200.00);
// Vendas legítimas com IDs distintos
    bilheteria.venderIngresso(ingresso1);
    bilheteria.venderIngresso(ingresso2);
// Bloco de teste de segurança: tenta vender um ingresso com ID duplicado
    try {
        bilheteria.venderIngresso(ingresso3);// Deve disparar a exceção
    } catch (IngressoInvalidoException e) { 
        // Captura o erro e exibe a mensagem de aviso no console sem interromper o programa
        System.out.println(e.getMessage());
    }
// Exibe o cálculo consolidado das receitas de ingressos VIP vendidos
    System.out.println("Receita VIP: R$ "
            + bilheteria.calcularReceitaVIP());
}


}
