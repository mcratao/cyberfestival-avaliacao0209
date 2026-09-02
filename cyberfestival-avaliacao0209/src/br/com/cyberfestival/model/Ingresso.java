package br.com.cyberfestival.model;
// Modelo de dados que representa um ingresso do festival
public class Ingresso {

// Atributos privados do ingresso
private String codigoId; // Identificador único (ex: "A-01")
private String tipo;  // Categoria do ingresso (ex: "VIP", "PISTA")
private double valor;  // Preço pago pelo ingresso
// Construtor completo para instanciar um novo ingresso
public Ingresso(String codigoId, String tipo, double valor) {
    this.codigoId = codigoId;
    this.tipo = tipo;
    this.valor = valor;
}
// Métodos getters para leitura dos dados protegidos
public String getCodigoId() {
    return codigoId;
}

public String getTipo() {
    return tipo;
}

public double getValor() {
    return valor;
}


}
