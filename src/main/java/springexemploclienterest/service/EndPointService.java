package springexemploclienterest.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import springexemploclienterest.model.dto.ClasseExemplo;

@Service
public class EndPointService {
    public ResponseEntity<ClasseExemplo> avaliaRespostaEndPoint(ClasseExemplo classeExemplo) {
        if(classeExemplo != null) {
            classeExemplo.setParam1(classeExemplo.getParam1() + "1");
            classeExemplo.setParam2(classeExemplo.getParam2() + "2");
            classeExemplo.setParam3(classeExemplo.getParam3() + "3");
            return new ResponseEntity<>(classeExemplo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
