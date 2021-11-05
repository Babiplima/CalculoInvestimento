package Exception;

import DTO.InvestidorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

public class InvestimentoController {

    //Injeção de dependência (Objeto da classe Service sendo injetado)
    @Autowired
    private InvestidorService investidorService;

    @PutMapping
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void InvestidorDTOsaida simularInvestimento (@RequestBody @Valid InvestidorDTO investidorDTO)
    return

    @GetMapping
    public List<InvestidorDTO> exibirMailing(){ return investidorService retornarTodosOsInvestidores();}

    @GetMapping("/{email}")
    public InvestidorDTO buscarInvestidorPeloEmail(@PathVariable String email){ return investidorService.buscarinvestidor(email);}

}
