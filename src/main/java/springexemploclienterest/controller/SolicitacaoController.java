package springexemploclienterest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springexemploclienterest.model.dto.ClasseExemplo;
import springexemploclienterest.service.SolicitacaoService;

@RestController
@RequestMapping(value = "/solicitacao", produces = MediaType.APPLICATION_JSON_VALUE)
public class SolicitacaoController {
    @Autowired
    SolicitacaoService solicitacaoService;

    @GetMapping
    public ResponseEntity<ClasseExemplo> solicitacao(ClasseExemplo classeExemplo) {
        return solicitacaoService.clientSolicitaEndPoint(classeExemplo);
    }
}
