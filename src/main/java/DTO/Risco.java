package DTO;

public enum Risco {

    //Percenstuais de taxas de retorno

    ALTO (0.025), MEDIO(0.015), BAIXO(0.005);

    //Atributos, construtores e get

    private double taxaDeRetorno;

    Risco(double taxaDeRetorno) {
        this.taxaDeRetorno = taxaDeRetorno;
    }

    public double getTaxaDeRetorno() {
        return taxaDeRetorno;
    }

}
