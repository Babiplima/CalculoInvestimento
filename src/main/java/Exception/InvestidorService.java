package Exception;

import DTO.InvestidorDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvestidorService {

    private List<InvestidorDTO> mailing = new ArrayList<>();

    public void salvarInvestimento(InvestidorDTO){
    InvestidorDTO InvestirorDaLista = buscarInvestimento (InvestidorDTO.());

    }

    public calcularRetorno (InvestidorDTO){


        return calcular retorno;

    }

    public buscarInvestimento(double valorProvisto) {
        for (InvestidorDTO investidorDTO : mailing) {
            if (InvestidorDTO.getvalorPrevisto().equalsIgnoreCase(valorProvisto)) {
                return InvestidorDTO;
            }
        }
    }
}



