package Exception;

import DTO.InvestidorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

public class InvestimentoController {

    @Autowired
    private InvestidorService investidorService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarInvestidor(@RequestBody @Valid InvestidorDTO){InvestidorService.salvarInvestimento(InvestidorDTO);}

    @GetMapping
    public List<InvestidorDTO> exibirMailing(){ return investidorService retornarTodosOsInvestidores();}

    @GetMapping("/{email}")
    public InvestidorDTO buscarInvestidorPeloEmail(@PathVariable String email){ return investidorService.buscarinvestidor(email);}

}
