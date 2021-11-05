package DTO;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;

public class InvestidorDTO {

    //Atributos

    @Email(message = "Email inválido")
    private String email;
    @Size(min = 2, max = 50, message = "nome deve ter no minimo 2 à 50 caracteres")
    @NotBlank
    private String nome;
    @CPF(message = "CPF INVALIDO")
    private String cpf;
    private int periodoDeAplicacaoMeses;
    private double valorPrevisto;
    private  Risco risco;

    //Métodos construtores

    public InvestidorDTO(double valorAplicado, double valorDoLucro, double valorTotal) {
    }

    public InvestidorDTO(String email, String nome, String cpf, int periodoDeAplicacaoMeses, double valorPrevisto) {
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
        this.periodoDeAplicacaoMeses = periodoDeAplicacaoMeses;
        this.valorPrevisto = valorPrevisto;
    }

    //Getters e Setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getPeriodoDeAplicacaoMeses() {
        return periodoDeAplicacaoMeses;
    }

    public void setPeriodoDeAplicacaoMeses(int periodoDeAplicacaoMeses) {
        this.periodoDeAplicacaoMeses = periodoDeAplicacaoMeses;
    }

    public double getValorPrevisto() {
        return valorPrevisto;
    }

    public void setValorPrevisto(double valorPrevisto) {
        this.valorPrevisto = valorPrevisto;
    }
}
