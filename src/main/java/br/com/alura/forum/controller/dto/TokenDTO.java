package br.com.alura.forum.controller.dto;

public class TokenDTO {

    private String tipo;
    private String token;

    public TokenDTO(String token, String tipo) {
        this.tipo = tipo;
        this.token = token;
    }

    public String getTipo() {
        return tipo;
    }

    public String getToken() {
        return token;
    }
}
