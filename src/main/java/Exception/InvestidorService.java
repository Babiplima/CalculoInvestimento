package Exception;

import DTO.InvestidorDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvestidorService {

    private List<InvestidorDTO> investidorDTOS = new ArrayList<>();

    public void adicionarInvestidor(InvestidorDTO investidorDTO) {
        mailing.add(InvestidorDTO);

    }

    public void calcularInvestimento(InvestidorDTO investidorDTO){
        double taxaRendimento = investidorDTO.getRisco().getTaxaDeRendimento();
        double valorAplicado = InvestidorDTO.getValor();
        int periodoAplicado = InvestidorDTO.getPeriodo();

        double valorDoLucro = 0;
        double valorTotal = valorAplicado;
        for (int i = 0; i <periodoAplicado; i++){
            valorDoLucro = valorDoLucro + (valorTotal * taxaRendimento);
            valorTotal += valorAplicado + valorDoLucro;
        }

        return new InvestidorDTO(valorAplicado, valorDoLucro, valorTotal);
    }

    public InvestidorSaidaDTO realizarSimulacao (InvestidorDTO investidorDTO){
        adicionarInvestidorNaLista(investidorDTO);
        return calcularInvestimento(investidorDTO);
    }
}