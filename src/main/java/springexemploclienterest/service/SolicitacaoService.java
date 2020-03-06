package springexemploclienterest.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import springexemploclienterest.model.dto.ClasseExemplo;
import springexemploclienterest.util.SolicitacaoClient;

@Service
public class SolicitacaoService {
    public ResponseEntity<ClasseExemplo> clientSolicitaEndPoint(ClasseExemplo classeExemplo) {
        return new SolicitacaoClient(classeExemplo).getResponseEntity();
    }
}
