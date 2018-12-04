package br.com.adtech.security.dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class JwtAuthenticationDto {

    private String email;
    private String senha;
    private String grand_type;

    public JwtAuthenticationDto() {
    }

    @NotEmpty(message = "Email não pode ser vazio.")
    @Email(message = "Email inválido.")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @NotEmpty(message = "Senha não pode ser vazia.")
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    @NotEmpty(message = "E necessario um granty type ")
    public String getGrand_type() {
        return grand_type;
    }

    public void setGrand_type(String grand_type) {
        this.grand_type = grand_type;
    }

    @Override
    public String toString() {
        return "JwtAuthenticationRequestDto [email=" + email + ", senha=" + senha + "]";
    }


}
