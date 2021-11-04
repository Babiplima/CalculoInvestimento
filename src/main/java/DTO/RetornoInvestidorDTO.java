package DTO;

public class RetornoInvestidorDTO {

    //Atributos

    private double valorDeRetorno;
    private double valorTotal;

    //Métodos construtores

    public RetornoInvestidorDTO() {
    }

    public RetornoInvestidorDTO(double valorDeRetorno, double valorTotal) {
        this.valorDeRetorno = valorDeRetorno;
        this.valorTotal = valorTotal;
    }

    //Getters e Setters

    public double getValorDeRetorno() {
        return valorDeRetorno;
    }

    public void setValorDeRetorno(double valorDeRetorno) {
        this.valorDeRetorno = valorDeRetorno;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
/*
    public RespostaDTO realizarSimulacao(@RequestBody SimulacaoDTO simulacaoDTO){
        return simulacaoService.calcularESalvarSimulacao(simulacaoDTO)
    }

    Instanciar o objeto de resposta DTO
        new RespostaDTO(23, 344, 54)
        */






