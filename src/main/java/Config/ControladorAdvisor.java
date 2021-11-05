package Config;

import DTO.InvestidorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ControladorAdvisor {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public List<MensagemErro> manipularExcecoesDeValidacao(MethodArgumentNotValidException exception) {

        List<MensagemErro> mensagens = new ArrayList<>();

        for (FieldError fieldError : exception.getFieldErrors()) {
            mensagens.add(new MensagemErro(fieldError.getDefaultMessage(), fieldError.getField()));
        }
        return mensagens;
    }

    @ExceptionHandler(InvestidorJaCadastradoException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public MensagemErro manipularExcecaoDeLeadEProdutoJaCadastrado(InvestidorJaCadastroException exception) {
        return new MensagemErro(exception.getMessage(), "sem campo");
    }

    @ExceptionHandler(InvestidorDTONaoEncontradoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public MensagemErro manipularExcecaoDeLeadEProdutoJaCadastrado(InvestidorDTONaoEncontradoException exception) {
        return new MensagemErro(exception.getMessage(), "sem campo");
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public MensagemErro mensagemGenerica(RuntimeException exception) {
        System.out.println(exception);
        return new MensagemErro("Algo deu errado. Volte mais tarde", "vazio");
    }
}


