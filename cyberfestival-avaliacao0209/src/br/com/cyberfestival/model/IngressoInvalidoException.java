package br.com.cyberfestival.model;
// Exceção customizada (não-checada) para indicar fraudes ou duplicidades na bilheteria
public class IngressoInvalidoException extends RuntimeException {

// Construtor padrão que envia a mensagem de erro detalhada para a superclasse
public IngressoInvalidoException() {
    super("Erro de Segurança: Ingresso já validado ou código duplicado!");
}


}
