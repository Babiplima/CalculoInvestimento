package DTO;

public class RetornoInvestidorDTO {

    //Atributos

    private double valorInvestido;
    private double valorTotaLucro;
    private double valorTotal;

    //Métodos construtores

    public RetornoInvestidorDTO() {
    }

    public RetornoInvestidorDTO(double valorInvestido, double valorTotaLucro, double valorTotal) {
        this.valorInvestido = valorInvestido;
        this.valorTotaLucro = valorTotaLucro;
        this.valorTotal = valorTotal;

            }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public double getValorTotaLucro() {
        return valorTotaLucro;
    }

    public void setValorTotaLucro(double valorTotaLucro) {
        this.valorTotaLucro = valorTotaLucro;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }


/*

        public realizarSimulacao(@RequestBody SimulacaoDTO simulacaoDTO){
        return simulacaoService.calcularESalvarSimulacao(simulacaoDTO)
    }

        Instanciar o objeto de resposta DTO
        new RespostaDTO(23, 344, 54)
        */






